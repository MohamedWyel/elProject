
@members {
    int idCount = 0;
    int intCount = 0;
    int keywordCount = 0;
}

prog
    : (statement)* EOF
      {
          System.out.println("Identifiers = " + idCount);
          System.out.println("Integers = " + intCount);
          System.out.println("Keywords = " + keywordCount);
      }
    ;

statement
    : tokenItem*
    ;

tokenItem
    : ID
    | INT
    | IF
    | WHILE
    | RETURN
    | ';'
    | '='
    ;

IF     : 'if'     {keywordCount++; System.out.println("keyword: if");} ;
WHILE  : 'while'  {keywordCount++; System.out.println("keyword: while");} ;
RETURN : 'return' {keywordCount++; System.out.println("keyword: return");} ;
ID     : ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*
         {idCount++; System.out.println("id: " + getText());} ;
INT    : '0'..'9'+
         {intCount++; System.out.println("int: " + getText());} ;
WS     : (' ' | '\t' | '\n' | '\r') {skip();} ;
