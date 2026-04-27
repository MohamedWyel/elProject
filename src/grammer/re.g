grammar re;
options {
    output=AST;
}

prog
    : stmt* EOF -> ^(PROG stmt*)
    ;

stmt
    : assign
    | printStmt
    ;

assign
    : ID '=' INT ';' -> ^(ASSIGN ID INT)
    ;

printStmt
    : 'print' ID ';' -> ^(PRINT ID)
    ;

PROG   : 'PROG';
ASSIGN : 'ASSIGN';
PRINT  : 'PRINT';

ID  : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')* ;
INT : '0'..'9'+ ;
WS  : (' ' | '\t' | '\n' | '\r') {skip();} ;