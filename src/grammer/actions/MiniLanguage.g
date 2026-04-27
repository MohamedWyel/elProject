grammar MiniLanguage;

@header {
import java.util.*;
}

@members {
    static class Symbol {
        String name;
        String type;
        Object value;

        Symbol(String name, String type, Object value) {
            this.name = name;
            this.type = type;
            this.value = value;
        }

        public String toString() {
            return name + ":" + type + "=" + value;
        }
    }

    Stack<Map<String, Symbol>> scopes = new Stack<Map<String, Symbol>>();

    void enterScope() {
        scopes.push(new HashMap<String, Symbol>());
        System.out.println(">> Enter scope, depth = " + scopes.size());
    }

    void exitScope() {
        System.out.println("<< Exit scope, symbols = " + scopes.peek());
        scopes.pop();
    }

    void declare(String name, String type, Object value) {
        Map<String, Symbol> current = scopes.peek();
        if (current.containsKey(name)) {
            System.out.println("Semantic Error: variable " + name + " already declared in current scope");
        } else {
            current.put(name, new Symbol(name, type, value));
            System.out.println("Declared " + name + " of type " + type + " with initial value " + value);
        }
    }

    Symbol resolve(String name) {
        for (int i = scopes.size() - 1; i >= 0; i--) {
            Map<String, Symbol> scope = scopes.get(i);
            if (scope.containsKey(name)) {
                return scope.get(name);
            }
        }
        return null;
    }

    void assign(String name, Object value, String valueType) {
        Symbol s = resolve(name);
        if (s == null) {
            System.out.println("Semantic Error: variable " + name + " is not declared");
            return;
        }

        if (!s.type.equals(valueType)) {
            System.out.println("Type Error: cannot assign " + valueType + " to " + s.type);
            return;
        }

        s.value = value;
        System.out.println("Assigned " + value + " to " + name);
    }
}

prog
@init {
    enterScope();
}
@after {
    System.out.println("Final global scope = " + scopes.peek());
    exitScope();
}
    : stmt* EOF
    ;

stmt
    : declStmt
    | assignStmt
    | printStmt
    | block
    ;

block
@init {
    enterScope();
}
@after {
    exitScope();
}
    : '{' stmt* '}'
    ;

declStmt
    : t=type id=ID ';'
      {
          if ($t.t.equals("int")) {
              declare($id.text, $t.t, 0);
          } else if ($t.t.equals("bool")) {
              declare($id.text, $t.t, false);
          }
      }
    ;

assignStmt
    : id=ID '=' e=expr ';'
      {
          assign($id.text, $e.value, $e.type);
      }
    ;

printStmt
    : 'print' e=expr ';'
      {
          System.out.println("PRINT => " + $e.value + " (type=" + $e.type + ")");
      }
    ;

type returns [String t]
    : 'int'  { $t = "int"; }
    | 'bool' { $t = "bool"; }
    ;

expr returns [Object value, String type]
    : a=addExpr
      {
          $value = $a.value;
          $type  = $a.type;
      }
    ;

addExpr returns [Object value, String type]
    : a=mulExpr
      {
          $value = $a.value;
          $type = $a.type;
      }
      (
          '+' b=mulExpr
          {
              if (!$type.equals("int") || !$b.type.equals("int")) {
                  System.out.println("Type Error: '+' only works on int");
                  $value = 0;
                  $type = "int";
              } else {
                  $value = ((Integer)$value) + ((Integer)$b.value);
                  $type = "int";
              }
          }
        | '-' b=mulExpr
          {
              if (!$type.equals("int") || !$b.type.equals("int")) {
                  System.out.println("Type Error: '-' only works on int");
                  $value = 0;
                  $type = "int";
              } else {
                  $value = ((Integer)$value) - ((Integer)$b.value);
                  $type = "int";
              }
          }
      )*
    ;

mulExpr returns [Object value, String type]
    : a=atom
      {
          $value = $a.value;
          $type = $a.type;
      }
      (
          '*' b=atom
          {
              if (!$type.equals("int") || !$b.type.equals("int")) {
                  System.out.println("Type Error: '*' only works on int");
                  $value = 0;
                  $type = "int";
              } else {
                  $value = ((Integer)$value) * ((Integer)$b.value);
                  $type = "int";
              }
          }
      )*
    ;

atom returns [Object value, String type]
    : n=INT
      {
          $value = Integer.parseInt($n.text);
          $type = "int";
      }
    | 'true'
      {
          $value = true;
          $type = "bool";
      }
    | 'false'
      {
          $value = false;
          $type = "bool";
      }
    | id=ID
      {
          Symbol s = resolve($id.text);
          if (s == null) {
              System.out.println("Semantic Error: variable " + $id.text + " is not declared");
              $value = 0;
              $type = "int";
          } else {
              $value = s.value;
              $type = s.type;
          }
      }
    | '(' e=expr ')'
      {
          $value = $e.value;
          $type = $e.type;
      }
    ;

ID  : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')* ;
INT : '0'..'9'+ ;
WS  : (' ' | '\t' | '\n' | '\r') {skip();} ;