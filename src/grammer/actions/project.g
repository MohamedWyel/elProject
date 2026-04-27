grammar project;

// ==================== Start Rule ====================
// Entry point that ties everything together
program : (statement)+ | quiz ;

quiz returns [int v]
    : a=INT
      { int sum = Integer.parseInt($a.text); }
      (
        '+' b=INT { sum += Integer.parseInt($b.text); }
      | '-' c=INT { sum -= Integer.parseInt($c.text); }
      )*
      { v=sum ; System.out.println(v); }
    ;

// Rule that combines all types of statements
statement  : dec          // Declarations
           | if_          // If-else statement
           | while_       // While loop
           | for_loop     // For loop
           | func_def     // Function definition
           | func_call    // Function call
           ;

// ==================== Declarations ====================
// Declaration variations
dec        : dec1 | dec2 | dec3 | dec4 | sOUT | string_dec ;

// Integer declaration with assignment: int x = 5;
dec1       : Int_type ID '=' INT ';' ;

// Double declaration with assignment: double x = 5.5;
dec2       : Double_type ID '=' DOUBLE ';' ;

// Multiple variable declaration: int x, y, z; OR double a, b;
dec3       : (Int_type | Double_type) ID (',' ID)* ';' ;

// Declaration with expression: int s = x + y * z;
dec4       : (Int_type | Double_type) ID '=' ID (('+' | '-' | '*' | '/') ID)* ';' ;

// ==================== Control Flow ====================

// If-else statement (contains statements, not just declarations)
if_
    : 'if' '(' c=logical_cond ')' '{' statement* '}' (else_)?
      {
          if ($c.value){
       		System.out.println("a7a");
       	  }else{
          	System.out.println("7ankresha");
          }
      }
    ;

// Else block
else_      : 'else' '{' statement* '}' ;

// While loop
while_     : 'while' '(' logical_cond ')' '{' statement* '}' ;

// For loop: for (int i = 0; i < 10; i++) { ... }
for_loop   : 'for' '(' init ';' cond ';' step ')' '{' statement* '}' ;

// Loop initialization: int i = 0
init       : Int_type ID '=' INT ;

// Loop step: i = i + 1 OR i++ OR i--
step       : ID '=' expr | ID INC | ID DEC ;

cond returns [boolean value]
    : a=(ID | INT | DOUBLE) op=BOPR b=(ID | INT | DOUBLE)
      {
          double left = Double.parseDouble($a.text);
          double right = Double.parseDouble($b.text);

          if      ($op.text.equals("<=")) $value = left <= right;
          else if ($op.text.equals(">=")) $value = left >= right;
          else if ($op.text.equals("==")) $value = left == right;
          else if ($op.text.equals("!=")) $value = left != right;
          else if ($op.text.equals("<"))  $value = left < right;
          else if ($op.text.equals(">"))  $value = left > right;
      }
    ;
    
logical_cond returns [boolean value]
    : c1=cond
      {
          $value = $c1.value;
      }
      (
          op=(AND | OR | XOR) c2=cond
          {
              if ($op.text.equals("&&"))
                  $value = $value && $c2.value;
              else if ($op.text.equals("||"))
                  $value = $value || $c2.value;
              else if ($op.text.equals("^"))
                  $value = $value ^ $c2.value;
          }
      )*
    ;

// ==================== Expressions ====================

// Expression with operator precedence
// Addition and subtraction (lowest precedence)
expr       : term (('+' | '-') term)* ;

// Multiplication and division (higher precedence)
term       : factor (('*' | '/') factor)* ;

// Atomic values or parenthesized expressions (highest precedence)
factor     : ID | INT | DOUBLE | '(' expr ')' ;

// ==================== Functions ====================

// Function definition: int func(int a, double b) { ... }
func_def   : iden? func_type ID '(' param_list? ')' '{' statement* '}' ;

// Allowed function return types
func_type  : 'int' | 'double' | 'void' | 'String' ;
iden 	:	'private' |'public';
// Function parameters: int a, double b, ...
param_list : func_type ID (',' func_type ID)* ;

// Function call: myFunc(a, b + c);
func_call : ID '(' arg_list? ')' ';' ;

// Function arguments: a, b + c, 5, ...
arg_list   : expr (',' expr)* ;

// ==================== String & Print ====================

// String declaration with concatenation: String s = "hello" + "world";
string_dec : 'String' ID '=' STRING ('+' STRING)* ';' ;

// System.out.print statement: System.out.print("hello");
sOUT       : 'System' '.' 'out' '.' 'print' '(' STRING ')' ';' ;


// ==================== Lexer Rules ====================

// Single line comment: // this is a comment
Linecomment       : '//' ~('\n' | '\r')* { skip(); } ;

// Multi-line comment: /* this is a comment */
Multiline_comment : '/*' (options {greedy=false;} : .)* '*/' { skip(); } ;

// Type keywords
Int_type    : 'int' ;
Double_type : 'double' ;

// Identifier: variable/function names starting with letter or underscore
ID : ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')* ;

// Floating point number (must be defined before INT for longest match)
DOUBLE : ('0'..'9')+ '.' ('0'..'9')+ ;

// Integer number
INT    : ('0'..'9')+ ;

// String literal enclosed in double quotes
STRING : '"' ~('"')* '"' ;

// Comparison operators (longest match first)
BOPR : '<=' | '>=' | '==' | '!=' | '<' | '>' ;

// Increment and decrement operators
INC  : '++' ;
DEC  : '--' ;

// Logical operators
AND  : '&&' ;
OR   : '||' ;
XOR  : '^' ;

// Whitespace (spaces, tabs, newlines) - skipped
WS : (' ' | '\t' | '\n' | '\r')+ { skip(); } ;