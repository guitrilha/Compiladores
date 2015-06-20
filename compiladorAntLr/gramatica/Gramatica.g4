grammar Gramatica;

prog: PROGRAM ID OPEN_KEY start CLOSE_KEY ;

start	: def* function* main* ;

def		: CONST var (EQUALS ( calc_1 | OPEN_BRACKET CLOSE_BRACKET EQUALS array )) SEMICOLON ;

var		: type ID ;

array	: ARRAY_TYPE BOOL_SMALLER_OP type BOOL_BIGGER_OP OPEN_KEY values CLOSE_KEY ;

type	: CHAR_TYPE | INT_TYPE | REAL_TYPE | STRING_TYPE | BOOL_TYPE ;

values	: calc_1 COMMA values ;

value	: STRING_ID 
		| CHAR_ID 
		| (MATH_PLUS_OP | MATH_LESS_OP)? (NUM | REAL) 
		| ID (OPEN_BRACKET NUM CLOSE_BRACKET)? 
		| BOOL_ID;
		
calc_1	: calc_2 calc_1l;

calc_1l	: MATH_PLUS_OP calc_2 calc_1l ;

calc_2	: calc_3 calc_2l ;

calc_2l	: MATH_LESS_OP calc_3 calc_2l ;

calc_3	: calc_4 calc_3l ;

calc_3l	: MATH_MULT_OP calc_4 calc_3l ;

calc_4	: calc_5 calc_4l ;

calc_4l	: MATH_DIV_OP calc_5 calc_4l ;

calc_5	: value calc_5l ;

calc_5l	: MATH_MOD_OP value calc_5l ;

main	: MAIN OPEN_KEY comm CLOSE_KEY ;

function: FUNCTION_W ID OPEN_PARENT (params?  CLOSE_PARENT OPEN_KEY comm*) CLOSE_KEY ;

params	: var (COMMA var)* (COMMA assign)* 
		| assign (COMMA assign)* ;
		
comm	: while_stat
		| assign SEMICOLON
		| if_stat
		| for_stat
		| funccall ;
		
while_stat: WHILE_W OPEN_PARENT bool_calc CLOSE_PARENT OPEN_KEY comm CLOSE_KEY ;

assign	: (var | ID) (EQUALS calc_1)? ;

if_stat	: IF_W OPEN_PARENT bool_calc CLOSE_PARENT OPEN_KEY comm CLOSE_KEY (ELSE_W OPEN_KEY comm CLOSE_KEY)? ;

for_stat: FOR_W OPEN_PARENT assign SEMICOLON bool_calc SEMICOLON assign CLOSE_PARENT OPEN_KEY comm CLOSE_KEY ;

funccall: ID OPEN_PARENT (value (COMMA value))* CLOSE_PARENT SEMICOLON ;


bool_calc: ; //FALTA ISSO


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
ARRAY_TYPE	: 'array' ;
CHAR_TYPE	: 'char' ;
INT_TYPE	: 'int' ;
REAL_TYPE	: 'real' ;
STRING_TYPE	: 'string' ;
BOOL_TYPE	: 'bool' ;


STRING_ID	: DOUBLE_Q_MARK (LETTER)* DOUBLE_Q_MARK ;
CHAR_ID		: SIMPLE_Q_MARK (LETTER)? SIMPLE_Q_MARK ;
ID			: (LETTER)+ ;
LETTER		: [a-zA-Z]+ ;
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


WS 			: [ \t\r\n]+ -> skip ;
 