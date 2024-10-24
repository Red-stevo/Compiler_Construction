grammar ZaraParser;

@header {
    package red.stevo.code.Lexer;
}

options {
  language = Java;
}


// Lexer rules (Token specifications)
IF: 'if';
ELSE: 'else';
WHILE: 'while';
FOR: 'for';
RETURN: 'return';
CONST: 'const';
GLOB: 'global';
IN: 'in';
STRING: 'string';
ARRAY: 'arr';
STACK: 'stack';
ELSE_IF: 'else-if';
DO: 'do';
CONTINUE: 'continue';
CLASS: 'class';
INT: 'int';
ASSIGN: '=';
EQ: '==';
GT: '>';
LT: '<';
GTE: '>=';
LTE: '<=';
PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
AND: '&&';
NOT: '!';
DOT: '.';
OR: '||';
LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';
SEMICOLON: ';';
COMMA: ',';
COLON: ':';
LSQUARE: '[';
RSQUARE: ']';

IDENTIFIER: LETTER (LETTER | DIGIT)*;
CONSTANT: DIGIT+;
FLOAT: DIGIT+ '.' DIGIT*;

fragment DIGIT: [0-9];
fragment LETTER: [A-Za-z];

// Parser rules
start
    : (statement)* EOF
    ;

statement
    : IDENTIFIER ASSIGN expression SEMICOLON {System.out.println("Declared variable: " + $IDENTIFIER.text);}
    | IDENTIFIER LPAREN (parameterList)? RPAREN block {System.out.println("Declared function: " + $IDENTIFIER.text);}
    | ifStatement
    | whileStatement
    | forStatement
    | expressionStatement
    | returnStatement
    ;

variableDeclaration
    : IDENTIFIER ASSIGN expression SEMICOLON {System.out.println("Declared variable: " + $IDENTIFIER.text);}
    ;

functionDeclaration
    : IDENTIFIER LPAREN (parameterList)? RPAREN block {System.out.println("Declared function: " + $IDENTIFIER.text);}
    ;

parameterList
    : IDENTIFIER {System.out.println("Parameter: " + $IDENTIFIER.text);}
      (COMMA IDENTIFIER {System.out.println("Parameter: " + $IDENTIFIER.text);})*
    ;

ifStatement
    : IF LPAREN expression RPAREN block (ELSE block)?
    ;

whileStatement
    : WHILE LPAREN expression RPAREN block
    ;

forStatement
    : FOR LPAREN expression SEMICOLON expression SEMICOLON expression RPAREN block
    ;

returnStatement
    : RETURN expression? SEMICOLON
    ;

block
    : LBRACE (statement)* RBRACE
    ;

expressionStatement
    : expression SEMICOLON
    ;

expression
    : orExpression
    ;

orExpression
    : andExpression (OR andExpression)*
    ;

andExpression
    : relationalExpression (AND relationalExpression)*
    ;

relationalExpression
    : additiveExpression ( (GT | LT | EQ | GTE | LTE) additiveExpression )*
    ;

additiveExpression
    : multiplicativeExpression ( (PLUS | MINUS) multiplicativeExpression )*
    ;

multiplicativeExpression
    : unaryExpression ( (MULT | DIV) unaryExpression )*
    ;

unaryExpression
    : (PLUS | MINUS)? primaryExpression
    ;

primaryExpression
    : IDENTIFIER {System.out.println("Identifier: " + $IDENTIFIER.text);}
    | CONSTANT {System.out.println("Constant: " + $CONSTANT.text);}
    | FLOAT {System.out.println("Float: " + $FLOAT.text);}
    | LPAREN expression RPAREN
    ;
