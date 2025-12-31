grammar PythonSubset;

program
  : statement* EOF
  ;

statement
  : simpleStatement (NEWLINE+ | SEMI)*
  | NEWLINE+
  ;

simpleStatement
  : assignment
  | commandStmt
  | exprStmt
  ;

assignment
  : IDENTIFIER ASSIGN expr
  ;

exprStmt
  : funcCall
  | expr
  ;

commandStmt
  : ADD_PRODUCT LPAREN argList? RPAREN
  | GET_PRODUCTS LPAREN RPAREN
  | GET_PRODUCT_DETAILS LPAREN expr RPAREN
  | DELETE_PRODUCT LPAREN expr RPAREN
  ;

funcCall
  : IDENTIFIER LPAREN argList? RPAREN
  ;

argList
  : expr (COMMA expr)*
  ;

expr
  : literal
  | IDENTIFIER
  | funcCall
  ;

literal
  : STRING
  | NUMBER
  ;

ADD_PRODUCT         : 'add_product';
GET_PRODUCTS        : 'get_products';
GET_PRODUCT_DETAILS : 'get_product_details';
DELETE_PRODUCT      : 'delete_product';

LPAREN : '(';
RPAREN : ')';
COMMA  : ',';
SEMI   : ';';
ASSIGN : '=';

NUMBER
  : DIGIT+ ('.' DIGIT+)?
  ;

STRING
  : '"' ( ESC | ~["\\\r\n] )* '"'
  | '\''( ESC | ~['\\\r\n] )* '\''
  ;

fragment ESC
  : '\\' [btnfr"\\]
  | '\\' 'u' HEX HEX HEX HEX
  ;


fragment HEX : [0-9a-fA-F];
fragment DIGIT : [0-9];

IDENTIFIER
  : [a-zA-Z_] [a-zA-Z0-9_]*
  ;

COMMENT
  : '#' ~[\r\n]* -> skip
  ;

WS
  : [ \t]+ -> skip
  ;

NEWLINE
  : '\r'? '\n'
  ;
