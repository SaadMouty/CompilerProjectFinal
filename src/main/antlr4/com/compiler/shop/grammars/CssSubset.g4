grammar CssSubset;
@header { package com.compiler.shop.generated; }

stylesheet
  : rule* EOF
  ;

rule
  : selectorGroup LBRACE declaration* RBRACE
  ;

selectorGroup
  : selector (COMMA selector)*
  ;

selector
  : simpleSelector (COMBINATOR simpleSelector)*
  ;

simpleSelector
  : (STAR | IDENT)?
    ( (DOT IDENT) | (HASH IDENT) )*
  ;

declaration
  : IDENT COLON value SEMI?
  ;

value
  : valueAtom+
  ;

valueAtom
  : IDENT
  | NUMBER
  | STRING
  | COLOR
  | HASH IDENT
  | LPAREN
  | RPAREN
  | COMMA
  | DOT
  | MINUS
  | PLUS
  | PERCENT
  | SLASH
  ;

// ---------- LEXER ----------
CSS_COMMENT
  : '/*' .*? '*/' -> skip
  ;

WS
  : [ \t\r\n]+ -> skip
  ;

LBRACE : '{';
RBRACE : '}';
COLON  : ':';
SEMI   : ';';
COMMA  : ',';

COMBINATOR : [>+~];

STAR   : '*';
DOT    : '.';
HASH   : '#';
SLASH  : '/';

LPAREN : '(';
RPAREN : ')';

PERCENT : '%';
MINUS   : '-';
PLUS    : '+';

COLOR
  : '#' HEXDIGIT HEXDIGIT HEXDIGIT (HEXDIGIT HEXDIGIT HEXDIGIT)?
  ;

fragment HEXDIGIT : [0-9a-fA-F];

NUMBER
  : DIGIT+ ('.' DIGIT+)?
  ;

fragment DIGIT : [0-9];

STRING
  : '"' ( ESC | ~["\\\r\n] )* '"'
  | '\''( ESC | ~['\\\r\n] )* '\''
  ;

fragment ESC
  : '\\' [btnfr"\\]
  | '\\' 'u' HEX HEX HEX HEX
  ;


fragment HEX : [0-9a-fA-F];

IDENT
  : [a-zA-Z_][a-zA-Z0-9_-]*
  ;
