parser grammar WynnScriptParser;

options { tokenVocab = WynnScriptLexer; }

wynnScript: header? function* EOF;

header
    : HASH id
    ;

function
    : FUNCTION id LPAREN parameters? RPAREN statements
    ;

parameters
    : id (COMMA id)*
    ;

statements
    : LCURL statement* RCURL
    ;

statement
    : var_declaration SEMI #var
    | if_statement #if
    | while_statement #while
    | for_statement #for
    | control_statement SEMI #control
    | expression SEMI #ex
    ;

var_declaration
    : VAR id EQ expression
    ;

if_statement
    : IF LPAREN expression RPAREN statements (ELSE IF LPAREN expression RPAREN statements)* ELSE statements
    ;

while_statement
    : WHILE LPAREN expression RPAREN statements
    | DO statements WHILE LPAREN expression RPAREN
    ;

for_statement
    : FOR LPAREN id IN expression RPAREN statements
    ;

control_statement
    : BREAK
    | CONTINUE
    | RETURN expression?
    | YIELD expression?
    ;

expression
    : operator_expression
    ;

operator_expression
    : operator_expression (DOT operator_expression | LSQUARE args? RSQUARE | LPAREN args? RPAREN) #access
    | operator_expression (INC | DEC) #postfix
    | (BANG | TILDE | PLUS | DASH | INC | DEC) operator_expression #prefix
    | operator_expression POW operator_expression #power
    | operator_expression (STAR | SLASH | PERCENT) operator_expression #product
    | operator_expression (PLUS | DASH) operator_expression #sum
    | operator_expression (LANGLE | RANGLE | LE | GE | IN | IS | NOT_IN | NOT_IS) operator_expression #comparison
    | operator_expression (EQEQ | NEQ) operator_expression #equality
    | operator_expression AND operator_expression #and
    | operator_expression OR operator_expression #or
    | operator_expression QUEST operator_expression COLON operator_expression #conditional
    | operator_expression (EQ | PLUS_EQ | MINUS_EQ | TIMES_EQ | DIV_EQ | MOD_EQ | POW_EQ) operator_expression #assign
    | ELLIPSIS operator_expression #spread
    | primary_expression #primary
    ;

args
    : expression (COMMA expression)*
    ;

primary_expression
    : LPAREN expression RPAREN #paren
    | literal #lit
    | id #name
    ;

literal
    : StringLiteral
    | NumberLiteral
    | HexLiteral
    | BinLiteral
    | TRUE
    | FALSE
    | NULL
    ;

id: Identifier;