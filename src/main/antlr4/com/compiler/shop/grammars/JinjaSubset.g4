grammar JinjaSubset;
@header { package com.compiler.shop.generated; }

/*
  Jinja2 Template Subset - NO MODES (Most stable in IntelliJ)
  Supports:
    - TEXT
    - {{ expression }}
    - {% for item in items %} ... {% endfor %}
    - {% if condition %} ... {% endif %}
    - {# comment #} (skipped)
*/

template
  : part* EOF
  ;

part
  : TEXT
  | printExpr
  | forBlock
  | ifBlock
  ;

printExpr
  : EXPR_OPEN expr EXPR_CLOSE
  ;

forBlock
  : STMT_OPEN FOR IDENTIFIER IN expr STMT_CLOSE
    part*
    STMT_OPEN ENDFOR STMT_CLOSE
  ;

ifBlock
  : STMT_OPEN IF expr STMT_CLOSE
    part*
    STMT_OPEN ENDIF STMT_CLOSE
  ;

/* -------- expression subset -------- */
expr
  : orExpr
  ;

orExpr
  : andExpr (OR andExpr)*
  ;

andExpr
  : equalityExpr (AND equalityExpr)*
  ;

equalityExpr
  : relationalExpr ((EQEQ | NEQ) relationalExpr)*
  ;

relationalExpr
  : additiveExpr ((LT | GT | LE | GE) additiveExpr)*
  ;

additiveExpr
  : primary ((PLUS | MINUS) primary)*
  ;

primary
  : literal
  | variable
  | LPAREN expr RPAREN
  ;

variable
  : IDENTIFIER (DOT IDENTIFIER)*
  ;

literal
  : STRING
  | NUMBER
  | TRUE
  | FALSE
  ;

/* ================= LEXER ================= */

// Comments (skip)
JINJA_COMMENT
  : '{#' .*? '#}' -> skip
  ;

// Delimiters
EXPR_OPEN  : '{{';
EXPR_CLOSE : '}}';

STMT_OPEN  : '{%';
STMT_CLOSE : '%}';

// Keywords
FOR    : 'for';
ENDFOR : 'endfor';
IF     : 'if';
ENDIF  : 'endif';
IN     : 'in';

// Booleans + logical
TRUE : 'true';
FALSE: 'false';

OR  : 'or';
AND : 'and';

// Operators
EQEQ : '==';
NEQ  : '!=';

LE : '<=';
GE : '>=';

LT : '<';
GT : '>';

PLUS  : '+';
MINUS : '-';
DOT   : '.';

LPAREN : '(';
RPAREN : ')';

// Literals
NUMBER
  : DIGIT+ ('.' DIGIT+)?
  ;

STRING
  : '"' ( ESC | ~["\\\r\n] )* '"'
  | '\'' ( ESC | ~['\\\r\n] )* '\''
  ;

// Identifiers
IDENTIFIER
  : [a-zA-Z_] [a-zA-Z0-9_]*
  ;

// Whitespace (keep it as TEXT?)
// We SKIP only tabs/spaces around statements/expressions parsing doesn't require keeping them as TEXT.
// But to preserve HTML spacing/newlines, we keep NEWLINES as part of TEXT by NOT skipping '\r' '\n' here.
WS
  : [ \t]+ -> skip
  ;

// Text token: everything else (including newlines) that is not start of Jinja blocks.
// This avoids modes and avoids lookaheads.
TEXT
  : ( ~'{' | '{' ~[{%#] )+
  ;

/* -------- fragments -------- */
fragment DIGIT : [0-9];

fragment ESC
  : '\\' [btnfr"\\]
  | '\\' 'u' HEX HEX HEX HEX
  ;

fragment HEX : [0-9a-fA-F];
