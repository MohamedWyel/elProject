grammar SymbolTableExample;

@members {
    java.util.Set<String> vars = new java.util.HashSet<String>();
}

prog
    : (decl | usage)* EOF
      {
          System.out.println("المتغيرات المعرفة: " + vars);
      }
    ;

decl
    : 'int' id=ID ';'
      {
          vars.add($id.text);
          System.out.println("تعريف متغير: " + $id.text);
      }
    ;

usage
    : id=ID '=' n=INT ';'
      {
          if (!vars.contains($id.text)) {
              System.out.println("خطأ: المتغير " + $id.text + " غير معرّف");
          } else {
              System.out.println("إسناد " + $n.text + " إلى " + $id.text);
          }
      }
    ;

ID  : ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')* ;
INT : '0'..'9'+ ;
WS  : (' ' | '\t' | '\n' | '\r') {skip();} ;