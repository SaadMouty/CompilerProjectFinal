grammar HtmlSubset;
@header { package com.compiler.shop.generated; }

document
  : node* EOF
  ;

node
  : element
  | TEXT
  ;

element
  : emptyElement
  | normalElement
  ;

emptyElement
  : LT NAME attribute* SLASH_GT
  ;

normalElement
  : startTag node* endTag
  ;

startTag
  : LT NAME attribute* GT
  ;

endTag
  : LT_SLASH NAME GT
  ;

attribute
  : NAME (EQ attrValue)?
  ;

attrValue
  : STRING
  | NAME
  ;

// ---------- LEXER ----------
HTML_COMMENT
  : '<!--' .*? '-->' -> skip
  ;

LT_SLASH : '</';
SLASH_GT : '/>';
LT       : '<';
GT       : '>';

EQ       : '=';

NAME
  : [a-zA-Z_][a-zA-Z0-9_-]*
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

WS
  : [ \t\r\n]+ -> skip
  ;

// Text outside tags (kept simple)
TEXT
  : ~[<]+
  ;
