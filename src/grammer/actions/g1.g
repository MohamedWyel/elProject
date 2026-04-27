grammar re;

prog
    : expr EOF
      {
          System.out.println("الناتج = " + $expr.value);
      }
    ;

expr returns [int value]
    : a=multExpr
      {
          $value = $a.value;
      }
      (
          '+' b=multExpr
          {
              System.out.println("جمع " + $value + " + " + $b.value);
              $value += $b.value;
          }
        | '-' b=multExpr
          {
              System.out.println("طرح " + $value + " - " + $b.value);
              $value -= $b.value;
          }
      )*
    ;

multExpr returns [int value]
    : a=atom
      {
          $value = $a.value;
      }
      (
          '*' b=atom
          {
              System.out.println("ضرب " + $value + " * " + $b.value);
              $value *= $b.value;
          }
        | '/' b=atom
          {
              System.out.println("قسمة " + $value + " / " + $b.value);
              $value /= $b.value;
          }
      )*
    ;

atom returns [int value]
    : n=(INT|DOUBLE)
      {
          $value = Integer.parseInt($n.text);
      }
    | '(' e=expr ')'
      {
          $value = $e.value;
      }
    ;

INT 	: '0'..'9'+ ;
DOUBLE	: INT'.'INT;
WS  : (' ' | '\t' | '\n' | '\r') {skip();} ;