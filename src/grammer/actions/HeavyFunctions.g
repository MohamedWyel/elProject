grammar HeavyFunctions;

@header {
import java.util.*;
}

@members {
    static class VarSymbol {
        String name;
        String type;
        Object value;

        VarSymbol(String name, String type, Object value) {
            this.name = name;
            this.type = type;
            this.value = value;
        }

        public String toString() {
            return name + ":" + type + "=" + value;
        }
    }

    static class FuncSymbol {
        String name;
        List<String> paramTypes = new ArrayList<String>();
        String returnType;

        FuncSymbol(String name, String returnType) {
            this.name = name;
            this.returnType = returnType;
        }

        public String toString() {
            return name + paramTypes + " -> " + returnType;
        }
    }

    Map<String, FuncSymbol> functions = new HashMap<String, FuncSymbol>();
    Stack<Map<String, VarSymbol>> scopes = new Stack<Map<String, VarSymbol>>();

    void enterScope() {
        scopes.push(new HashMap<String, VarSymbol>());
        System.out.println(">> enter scope depth=" + scopes.size());
    }

    void exitScope() {
        System.out.println("<< exit scope vars=" + scopes.peek());
        scopes.pop();
    }

    void declareVar(String name, String type) {
        Map<String, VarSymbol> current = scopes.peek();
        if (current.containsKey(name)) {
            System.out.println("Semantic Error: variable " + name + " already declared");
        } else {
            Object init = type.equals("int") ? 0 : false;
            current.put(name, new VarSymbol(name, type, init));
            System.out.println("Declared variable " + name + ":" + type);
        }
    }

    VarSymbol resolveVar(String name) {
        for (int i = scopes.size() - 1; i >= 0; i--) {
            Map<String, VarSymbol> s = scopes.get(i);
            if (s.containsKey(name)) return s.get(name);
        }
        return null;
    }

    void assignVar(String name, Object value, String type) {
        VarSymbol v = resolveVar(name);
        if (v == null) {
            System.out.println("Semantic Error: variable " + name + " not declared");
            return;
        }
        if (!v.type.equals(type)) {
            System.out.println("Type Error: cannot assign " + type + " to " + v.type);
            return;
        }
        v.value = value;
        System.out.println("Assigned " + value + " to variable " + name);
    }

    void declareFunction(String name, List<String> params, String retType) {
        if (functions.containsKey(name)) {
            System.out.println("Semantic Error: function " + name + " already declared");
            return;
        }
        FuncSymbol f = new FuncSymbol(name, retType);
        f.paramTypes.addAll(params);
        functions.put(name, f);
        System.out.println("Declared function " + f);
    }

    FuncSymbol resolveFunction(String name) {
        return functions.get(name);
    }
}

prog
@init {
    enterScope();
}
@after {
    System.out.println("All functions = " + functions);
    exitScope();
}
    : item* EOF
    ;

item
    : funcDecl
    | stmt
    ;

funcDecl
    : 'func' name=ID '(' params=paramList? ')' ':' rt=type blockFunc
      {
          List<String> p = ($params != null) ? $params.types : new ArrayList<String>();
          declareFunction($name.text, p, $rt.t);
      }
    ;

paramList returns [List<String> types]
@init {
    $types = new ArrayList<String>();
}
    : t1=type id1=ID
      {
          $types.add($t1.t);
      }
      (',' t2=type id2=ID
        {
            $types.add($t2.t);
        }
      )*
    ;

blockFunc
@init {
    enterScope();
}
@after {
    exitScope();
}
    : '{' stmt* '}'
    ;

stmt
    : declStmt
    | assignStmt
    | printStmt
    | callStmt
    ;

declStmt
    : t=type id=ID ';'
      {
          declareVar($id.text, $t.t);
      }
    ;

assignStmt
    : id=ID '=' e=expr ';'
      {
          assignVar($id.text, $e.value, $e.type);
      }
    ;

printStmt
    : 'print' e=expr ';'
      {
          System.out.println("PRINT => " + $e.value + " : " + $e.type);
      }
    ;

callStmt
    : c=callExpr ';'
      {
          System.out.println("Function call executed, returned type = " + $c.type);
      }
    ;

callExpr returns [Object value, String type]
    : name=ID '(' args=argList? ')'
      {
          FuncSymbol f = resolveFunction($name.text);
          List<String> actualTypes = ($args != null) ? $args.types : new ArrayList<String>();

          if (f == null) {
              System.out.println("Semantic Error: function " + $name.text + " not declared");
              $value = 0;
              $type = "int";
          } else {
              if (f.paramTypes.size() != actualTypes.size()) {
                  System.out.println("Semantic Error: function " + $name.text + " expects "
                      + f.paramTypes.size() + " args but got " + actualTypes.size());
              } else {
                  for (int i = 0; i < f.paramTypes.size(); i++) {
                      if (!f.paramTypes.get(i).equals(actualTypes.get(i))) {
                          System.out.println("Type Error in function call " + $name.text
                              + ": arg " + (i+1) + " expected " + f.paramTypes.get(i)
                              + " but got " + actualTypes.get(i));
                      }
                  }
              }
              $value = 0;
              $type = f.returnType;
          }
      }
    ;

argList returns [List<String> types]
@init {
    $types = new ArrayList<String>();
}
    : e1=expr
      {
          $types.add($e1.type);
      }
      (',' e2=expr
        {
            $types.add($e2.type);
        }
      )*
    ;

expr returns [Object value, String type]
    : a=term
      {
          $value = $a.value;
          $type = $a.type;
      }
      (
          '+' b=term
          {
              if (!$type.equals("int") || !$b.type.equals("int")) {
                  System.out.println("Type Error: + only supports int");
                  $value = 0;
                  $type = "int";
              } else {
                  $value = ((Integer)$value) + ((Integer)$b.value);
                  $type = "int";
              }
          }
      )*
    ;

term returns [Object value, String type]
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
          VarSymbol v = resolveVar($id.text);
          if (v == null) {
              System.out.println("Semantic Error: variable " + $id.text + " not declared");
              $value = 0;
              $type = "int";
          } else {
              $value = v.value;
              $type = v.type;
          }
      }
    | c=callExpr
      {
          $value = $c.value;
          $type = $c.type;
      }
    | '(' e=expr ')'
      {
          $value = $e.value;
          $type = $e.type;
      }
    ;

type returns [String t]
    : 'int'  { $t = "int"; }
    | 'bool' { $t = "bool"; }
    ;

ID  : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*
      { System.out.println("[LEX] ID = " + getText()); }
    ;
INT : '0'..'9'+
      { System.out.println("[LEX] INT = " + getText()); }
    ;
WS  : (' ' | '\t' | '\n' | '\r') {skip();} ;