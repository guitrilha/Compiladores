grammar Gramatica;

prog	: PROGRAM ID OPEN_KEY start CLOSE_KEY ;

start	: def* function* main* ;

def		: CONST var EQUALS term SEMICOLON ;

var		: type ID ;
 
type	: CHAR_TYPE | INT_TYPE | REAL_TYPE | STRING_TYPE | BOOL_TYPE ;

values	: term COMMA values ;
 
value	: STRING_ID 
		| CHAR_ID 
		| number
		| ID
		| BOOL_ID;
		
number	: (MATH_PLUS_OP | MATH_LESS_OP)? (NUM | REAL) ;
    
term	: term MATH_DIV_OP term
		| term MATH_MULT_OP term
		| term MATH_MOD_OP term
		| term MATH_LESS_OP term
		| term MATH_PLUS_OP term
		| value ;

main	: MAIN OPEN_KEY comm CLOSE_KEY ;

function: FUNCTION_W ID OPEN_PARENT params* CLOSE_PARENT OPEN_KEY comm CLOSE_KEY ;

params	: var (COMMA var)* 
		| assign (COMMA assign)* ;
		
comm	: commands* ;

commands: while_stat
		| assign SEMICOLON
		| if_stat
		| for_stat
		| funccall ;
		
while_stat: WHILE_W OPEN_PARENT expression CLOSE_PARENT OPEN_KEY comm CLOSE_KEY ;

assign	: (var | ID) (EQUALS term)? ;

if_stat	: IF_W OPEN_PARENT expression CLOSE_PARENT OPEN_KEY comm CLOSE_KEY (ELSE_W OPEN_KEY comm CLOSE_KEY)? ;

for_stat: FOR_W OPEN_PARENT assign SEMICOLON expression SEMICOLON assign CLOSE_PARENT OPEN_KEY comm CLOSE_KEY ;

funccall: ID OPEN_PARENT (value (COMMA value)*)? CLOSE_PARENT SEMICOLON ;

expression	: term
			| term BOOL_SMALLER_OP term
			| term BOOL_BIGGER_OP term
			| term BOOL_SMALLER_EQUALS_OP term
			| term BOOL_BIGGER_EQUALS_OP term
			| term BOOL_EQUALS_OP term
			| term BOOL_DIFFERENT_OP term ;
			

//palavras reservadas
PROGRAM		: 'program' ;
FUNCTION_W	: 'function' ;
WHILE_W		: 'while' ;
IF_W		: 'if' ;
ELSE_W		: 'else' ;
FOR_W		: 'for' ;

//numeros e ids
CONST		: 'const' ;
MAIN		: 'main' ;
CHAR_TYPE	: 'char' ;
INT_TYPE	: 'int' ;
REAL_TYPE	: 'real' ;
STRING_TYPE	: 'string' ;
BOOL_TYPE	: 'bool' ;


STRING_ID	: DOUBLE_Q_MARK (LETTER)* DOUBLE_Q_MARK ;
CHAR_ID		: SIMPLE_Q_MARK (LETTER)? SIMPLE_Q_MARK ;
ID			: '_'? (LETTER)+ ;
LETTER		: [a-zA-Z] ([a-zA-Z] | NUM)* ;
NUM			: [0-9]+ ;
REAL		: NUM DOT NUM ;
BOOL_ID		: ('true' | 'false') ;

 
//controle
SEMICOLON		: ';' ;
OPEN_KEY		: '{' ;
CLOSE_KEY		: '}' ;
OPEN_PARENT		: '(' ;
CLOSE_PARENT	: ')' ;
OPEN_BRACKET	: '[' ;
CLOSE_BRACKET	: ']';
COMMA			: ',' ;
DOT				: '.' ;
SIMPLE_Q_MARK	: '\'';
DOUBLE_Q_MARK	: '"';


//operadores
MATH_PLUS_OP			: '+' ;
EQUALS					: '=' ;
MATH_LESS_OP			: '-' ;
MATH_DIV_OP				: '/' ;
MATH_MULT_OP			: '*' ;
MATH_MOD_OP				: '%' ;
BOOL_SMALLER_OP			: '<' ;
BOOL_BIGGER_OP			: '>' ;
BOOL_BIGGER_EQUALS_OP	: '>=' ;
BOOL_SMALLER_EQUALS_OP	: '<=' ;
BOOL_EQUALS_OP			: '==' ;
BOOL_DIFFERENT_OP		: '!=' ;
BOOL_CALC_DIFF_OP		: '!' ;
BOOL_CALC_OR_OP			: '|' ;
BOOL_CALC_AND_OP		: '&' ;


SINGLELINE_COMMENT	: '//' ~('\r' | '\n')* -> skip;
WHITE_SPACE			: [ \t\r\n]+ -> skip ;
 
