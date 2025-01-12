//grammar BadakLang;
//
//// Lexer Rules
//WS          : [ \t\r\n]+ -> skip ;
//NUMBER      : [0-9]+ ;
//PLUS        : '+' ;
//MINUS       : '-' ;
//MULTIPLY    : '*' ;
//DIVIDE      : '/' ;
//LPAREN      : '(' ;
//RPAREN      : ')' ;
//IDENTIFIER  : [a-zA-Z_][a-zA-Z0-9_]* ;
//ASSIGN      : '=' ;
//
//
//// Parser Rules
//prog        : (expr NEWLINE)* EOF ;
//expr        : expr (PLUS | MINUS) term
//            | term
//            | IDENTIFIER ASSIGN expr ;
//term        : term (MULTIPLY | DIVIDE) factor
//            | factor ;
//factor      : NUMBER
//            | IDENTIFIER
//            | LPAREN expr RPAREN ;
//NEWLINE     : '\r'? '\n' ;

// Existing Grammar

// New Grammar
grammar BadakLang;

// Lexer Rules -----------------------------------------------------------------

// Keywords
INT: 'int';
DOUBLE: 'double';
CHAR: 'char';
STRING: 'string';
BOOL: 'bool';
VOID: 'void';
CONST: 'const';
FUNC: 'func';
IF: 'if';
ELSE: 'else';
WHILE: 'while';
FOR: 'for';
RETURN: 'return';
PRINT: 'print';
INPUT: 'input';
AND: 'and';
OR: 'or';
NOT: 'not';
NULL: 'null';
DICT: 'dict';
NEW: 'new';
LENGTH: '.length';
APPEND: '.append';
REMOVE: '.remove';
HASKEY: '.hasKey';
CLEAR: '.clear';
KEYS: '.keys';
VALUES: '.values';

// Literals
BOOLEAN: 'true' | 'false';
INTEGER_LITERAL: [0-9]+;
DOUBLE_LITERAL: [0-9]+ '.' [0-9]+;
CHAR_LITERAL: '\'' . '\'';
STRING_LITERAL: '"' .*? '"';

// Operators
ADD: '+';
SUB: '-';
MUL: '*';
DIV: '/';
MOD: '%';
ASSIGN: '=';
ADD_ASSIGN: '+=';
SUB_ASSIGN: '-=';
MUL_ASSIGN: '*=';
DIV_ASSIGN: '/=';
EQ: '==';
NEQ: '!=';
LT: '<';
GT: '>';
LEQ: '<=';
GEQ: '>=';

// Punctuation
LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';
LBRACKET: '[';
RBRACKET: ']';
COMMA: ',';
COLON: ':';
SEMI: ';';

// Identifiers
IDENTIFIER: [a-zA-Z_][a-zA-Z_0-9]*;

// Comments
LINE_COMMENT: '//' ~[\r\n]* -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;

// Whitespace
WS: [ \t\r\n]+ -> skip;

// Newline
NEWLINE: [\r\n]+ -> skip;


// Parser Rules -------------------------------------------------------------------

// Entry Point
program: (statement (SEMI | NEWLINE)?)* EOF;

// Declarations
declaration: variableDeclaration
           | constantDeclaration
           | functionDeclaration;

variableDeclaration: type IDENTIFIER (ASSIGN expression)? SEMI;
constantDeclaration: CONST type IDENTIFIER ASSIGN expression SEMI;
functionDeclaration: FUNC returnType IDENTIFIER LPAREN parameterList? RPAREN block;

// Types
type: primitiveType
    | arrayType
    | dictionaryType;

primitiveType: INT | DOUBLE | CHAR | STRING | BOOL;
arrayType: primitiveType LBRACKET RBRACKET;
dictionaryType: DICT LT type COMMA type GT;

returnType: VOID | type;

// Parameters
parameterList: parameter (COMMA parameter)*;
parameter: type IDENTIFIER;

// Statements
block: LBRACE statement* RBRACE;

statement: declaration
         | assignment
         | ifStatement
         | whileStatement
         | forStatement
         | returnStatement
         | functionCall SEMI;

assignment: IDENTIFIER ASSIGN expression;

ifStatement: IF LPAREN expression RPAREN block (ELSE block)?;
whileStatement: WHILE LPAREN expression RPAREN block;
forStatement: FOR LPAREN statement expression SEMI statement RPAREN block;
returnStatement: RETURN expression? SEMI;

// Expressions
expression: expression (AND | OR ) expression
          | NOT expression
          | expression (EQ | NEQ | LT | LEQ | GT | GEQ) expression
          | expression (ADD | SUB | MUL | DIV | MOD) expression
          | LPAREN expression RPAREN
          | IDENTIFIER
          | literal;

literal: INTEGER_LITERAL
       | DOUBLE_LITERAL
       | CHAR_LITERAL
       | STRING_LITERAL
       | BOOLEAN
       | NULL;

// Function Calls
functionCall: IDENTIFIER LPAREN argumentList? RPAREN;
argumentList: expression (COMMA expression)*;
