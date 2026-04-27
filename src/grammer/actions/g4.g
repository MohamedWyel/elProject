grammar re;

@members {
    java.util.Map<String, Integer> memory = new java.util.HashMap<String, Integer>();
}

prog
    : (stmt)+ EOF
      {
          System.out.println("الذاكرة النهائية = " + memory);
      }
    ;

stmt
    : decl
    | assign
    | printStmt
    ;

decl
    : 'int' id=ID ';'
      {
          if (memory.containsKey($id.text)) {
              System.out.println("تحذير: المتغير " + $id.text + " متعرف قبل كده");
          } else {
              memory.put($id.text, 0);
              System.out.println("تم تعريف " + $id.text + " بقيمة ابتدائية 0");
          }
      }
    ;

assign
    : id=ID '=' e=expr ';'
      {
          if (!memory.containsKey($id.text)) {
              System.out.println("خطأ: المتغير " + $id.text + " غير معرّف");
          } else {
              memory.put($id.text, $e.value);
              System.out.println("تم إسناد " + $e.value + " إلى " + $id.text);
          }
      }
    ;

printStmt
    : 'print' id=ID ';'
      {
          if (!memory.containsKey($id.text)) {
              System.out.println("خطأ: لا يمكن طباعة " + $id.text + " لأنه غير معرّف");
          } else {
              System.out.println($id.text + " = " + memory.get($id.text));
          }
      }
    ;

expr returns [int value]
    : a=term
      {
          $value = $a.value;
      }
      (
          '+' b=term
          {
              $value += $b.value;
          }
        | '-' b=term
          {
              $value -= $b.value;
          }
      )*
    ;

term returns [int value]
    : n=INT
      {
          $value = Integer.parseInt($n.text);
      }
    | id=ID
      {
          if (!memory.containsKey($id.text)) {
              System.out.println("خطأ: المتغير " + $id.text + " غير معرّف، سيتم اعتباره 0");
              $value = 0;
          } else {
              $value = memory.get($id.text);
          }
      }
    ;

ID  : ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')* ;
INT : '0'..'9'+ ;
WS  : (' ' | '\t' | '\n' | '\r') {skip();} ;


test:-
int x;
int y;
x = 10;
y = x + 5;
print x;
print y;