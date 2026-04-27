grammar re;

options {
    output=AST;
}

expr
    : multExpr (('+'^|'-'^) multExpr)*
    ;

multExpr
    : atom (('*'^|'/'^) atom)*
    ;

atom
    : (INT|DOUBLE)
    | '('! expr ')'!
    ;

INT     : '0'..'9'+ ;
DOUBLE 	: INT'.'INT;
WS  : (' ' | '\t' | '\n' | '\r') {skip();} ;








