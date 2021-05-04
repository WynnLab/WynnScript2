lexer grammar WynnScriptLexer;

NL: ('\n' | '\r' | '\r\n') -> channel(HIDDEN);

Space: [ \t\f]+ -> channel(HIDDEN);

LineComment: '//' .*? (NL | EOF) -> channel(HIDDEN);
BlockComment: '/*' .*? ('*/' | EOF) -> channel(HIDDEN);

// Symbols

SEMI: ';';
COLON: ':';
COMMA: ',';
DOT: '.';
COLONCOLON: '::';

ELLIPSIS: '...';

PLUS: '+';
DASH: '-';
STAR: '*';
POW: '**';
SLASH: '/';
PERCENT: '%';

LPAREN: '(';
RPAREN: ')';
LSQUARE: '[';
RSQUARE: ']';
LCURL: '{';
RCURL: '}';
LANGLE: '<';
RANGLE: '>';

EQ: '=';
EQEQ: '==';
NEQ: '!=';
LE: '<=';
GE: '>=';

AND: '&&';
OR: '||';
BANG: '!';
HASH: '#';
TILDE: '~';

QUEST: '?';
AT: '@';

PLUS_EQ: '+=';
MINUS_EQ: '-=';
TIMES_EQ: '*=';
POW_EQ: '**=';
DIV_EQ: '/=';
MOD_EQ: '%=';

INC: '++';
DEC: '--';

// Keywords

FUNCTION: 'function';
VAR: 'var';

DEL: 'del';

IF: 'if';
ELSE: 'else';
WHILE: 'while';
DO: 'do';
FOR: 'for';

IN: 'in';
IS: 'is';
NOT_IN: '!in';
NOT_IS: '!is';

CONTINUE: 'continue';
BREAK: 'break';
RETURN: 'return';
YIELD: 'yield';

ASYNC: 'async';
AWAIT: 'await';

TRUE: 'true';
FALSE: 'false';
NULL: 'null';

THIS: 'this';

// Literals

StringLiteral
    : '"' (~["\\\r\n] | EscapeSeq | '\\"')* '"'
    | '\'' (~['\\\r\n] | EscapeSeq | '\\\'')* '\''
    ;

fragment EscapeSeq: '\\' ([nrt] | 'u' [0-9a-fA-F] [0-9a-fA-F] [0-9a-fA-F] [0-9a-fA-F]);

NumberLiteral: DecimalLiteral | RealLiteral;

fragment DecimalLiteral: '0' | [+-]? [1-9] [0-9]*;
fragment RealLiteral: [+-]? ('0' | [1-9] [0-9]*) ([fF] | [fF]? Exponent) | ([1-9] [0-9]*)? '.' [0-9]+ [fF]? Exponent?;
fragment Exponent: [eE] [+-]? [1-9] [0-9]*;

HexLiteral: '0' [xX] [0-9a-fA-F]+;
BinLiteral: '0' [bB] [01]+;

// Identifiers

fragment Letter: [a-zA-Z0-9_];
fragment StartLetter: [a-zA-Z_];

Identifier: StartLetter Letter*;