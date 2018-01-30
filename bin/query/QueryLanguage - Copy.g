grammar QueryLanguage;
options {
	output=AST;
}
tokens {
    // define pseudo-operations
    QUERIES;
    QUERY;
    QUERY_NAME;
    FOR_QUERY;
    SELECT_QUERY;
    FILTER_QUERY;
    PRINT;
    NODE_CHAIN;
    CHAIN_ID;
    IN_CLAUSE;
    WITH_CLAUSE;
    WHERE_BLOCK;
    NESTED;
    BLOCK_STATEMENTS;
    STATEMENTS;
    STATEMENT;
    IF_STATEMENT;
    NODE;
    NODE_NAME;
    AST_CHILD;
    ATTRIBUTE;
    PROPERTY;
    EPSILON;
    VAR;
    VAR_STMT;
    VAR_ASSIGN;
    VAR_NAME;
    COMP_ADD;
    INCR;
    BOOL_EXP;
    BIN_OP;
    LOGIC_OP;
    TABLE;
    SET_TABLE;
}
// Query
startrule 
	:	queries -> ^(QUERIES queries)
	;

queries	:	query query*
	;

query	:	query_name foreach_query print_stmt -> ^(QUERY ^(QUERY_NAME query_name) ^(FOR_QUERY foreach_query) ^(PRINT print_stmt?) )
	|	query_name select_query print_stmt -> ^(QUERY ^(QUERY_NAME query_name) ^(SELECT_QUERY select_query) ^(PRINT print_stmt?) )
	|	query_name ID FILTER ID print_stmt -> ^(QUERY ^(QUERY_NAME query_name) ^(FILTER_QUERY ID FILTER ID) ^(PRINT print_stmt?) )
	;

query_name 
	:	ID COLON -> ID
	|	-> EPSILON
	;

foreach_query
	:	FOREACH LEFT_PAREN node_chain ID? in_clause RIGHT_PAREN with_clause foreach_where stat_statements -> ^(NODE_CHAIN node_chain) ^(CHAIN_ID ID?) ^(IN_CLAUSE in_clause) with_clause foreach_where ^(STATEMENTS stat_statements)
	;
foreach_where
	:	WHERE boolean_exp -> ^(WHERE_BLOCK boolean_exp)
	|	-> WHERE_BLOCK
	;

select_query
	:	SELECT LEFT_PAREN node_chain block ID? in_clause RIGHT_PAREN with_clause select_where -> ^(NODE_CHAIN node_chain) ^(CHAIN_ID ID?) ^(IN_CLAUSE in_clause) ^(BLOCK_STATEMENTS block) with_clause select_where
	;
select_where
	:	WHERE boolean_exp stat_statements -> ^(WHERE_BLOCK ^(BOOL_EXP boolean_exp) ^(STATEMENTS stat_statements))
	|	-> WHERE_BLOCK
	;
in_clause
	:	IN ID -> ID
	|	-> EPSILON
	;
with_clause 
	:	WITH variable AS ID -> ^(WITH_CLAUSE ^(VAR variable) ^(CHAIN_ID ID))
	|	-> WITH_CLAUSE
	;
node_chain
	:	node PERIOD node_chain 				-> ^(NODE node) ^(NODE_CHAIN node_chain)
	|	node COLON attr 				-> ^(NODE ^(NODE_NAME node) ^(ATTRIBUTE attr))
	|	node 						-> ^(NODE ^(NODE_NAME node))
	|   ast_child PERIOD node_chain            -> ^(NODE ^(AST_CHILD ast_child) ^(NODE_CHAIN node_chain))
	|   ast_child                -> ^(NODE ^(AST_CHILD ast_child))
	|	node keywords					-> ^(NODE ^(NODE_NAME node) keywords)
	|	ID PERIOD node_chain 				-> ^(VAR_NAME ID ^(NODE_CHAIN node_chain))
	|	property					-> ^(PROPERTY property)
	;	
node
	:	LT NODE_TYPE GT -> NODE_TYPE	
	|	LEFT_SQ_BRACKET ID RIGHT_SQ_BRACKET -> ^(TABLE ID)
	;
ast_child
	:	LEFT_BRACKET ID RIGHT_BRACKET -> ID
	;
keywords
	:	PERIOD CONTAINS LEFT_PAREN keyword_nodes RIGHT_PAREN 	-> ^(CONTAINS keyword_nodes)
	|	PERIOD IS LEFT_PAREN keyword_nodes RIGHT_PAREN 		-> ^(IS keyword_nodes)
	|	PERIOD HAS LEFT_PAREN keyword_nodes RIGHT_PAREN 	-> ^(HAS keyword_nodes)
	;
keyword_nodes
	:	node	-> ^(NODE_NAME node)
	|	ID	-> ^(VAR_NAME ID)
	|	logical_op -> ^(LOGIC_OP logical_op)
	;
attr
	:	COLON attr 					->  ^(ATTRIBUTES attr)
	|	PERIOD CONTAINS LEFT_PAREN keyword_nodes RIGHT_PAREN 	-> ^(CONTAINS keyword_nodes)
	|	PERIOD IS LEFT_PAREN keyword_nodes RIGHT_PAREN 		-> ^(IS keyword_nodes)
	|	PERIOD HAS LEFT_PAREN keyword_nodes RIGHT_PAREN 	-> ^(HAS keyword_nodes)
	|	ATTRIBUTES attr 				-> ^(ATTRIBUTES attr)
	|	-> EPSILON
	;
property
	:	ID					       -> ^(VAR_NAME ID)
	|	ID PERIOD CONTAINS LEFT_PAREN keyword_nodes RIGHT_PAREN -> ^(VAR_NAME ID ^(CONTAINS keyword_nodes))
	;
	
variable	
	:	ID COLON attr				-> ^(VAR_NAME ID attr)
	|	node_chain 				-> ^(NODE_CHAIN node_chain)
	|	INTEGER 				-> INTEGER
	|       STRING                                  -> STRING
	|	RESERVED_TYPES				-> RESERVED_TYPES	
	;

block //used for search
	:	LEFT_BRACKET block_statements RIGHT_BRACKET -> ^(BLOCK_STATEMENTS block_statements)
	|	-> EPSILON
	;
block_statements
	:	STAR block_statements 			-> ^(STAR block_statements)
	|	REPEATER block_statements 		-> ^(REPEATER block_statements)
	|	node_chain block block_statements	-> ^(NESTED ^(node_chain) block ^(BLOCK_STATEMENTS block_statements))
	|	-> EPSILON
	;

print_stmt
	:	PRINT variable_stmt SEMICOLON -> variable_stmt
	|	-> EPSILON
	;

stat_statements
	:	LEFT_BRACKET statements RIGHT_BRACKET -> statements
	|	-> EPSILON
	;

statements //collects data
	:	variable_assn statements	-> ^(STATEMENT variable_assn statements)
	|	if_statement statements		-> ^(STATEMENT if_statement statements)
	|	query statements		-> ^(QUERY query) statements
	|	SET variable_assn WHERE boolean_exp SEMICOLON -> ^(SET_TABLE variable_assn boolean_exp)
	|	-> EPSILON
	;
	
variable_stmt
	:	variable binary_op 		-> ^(VAR_STMT ^(VAR variable) ^(BIN_OP binary_op)) 
	|	MAX LEFT_PAREN variable COMMA variable RIGHT_PAREN -> ^(MAX variable variable)
	;
variable_assn
	:	variable variable_assn_right	-> ^(VAR variable) variable_assn_right
	;
variable_assn_right
	:	EQUALS variable_stmt SEMICOLON		-> ^(VAR_ASSIGN variable_stmt)
	|	COMPOUND_ADD variable_stmt SEMICOLON	-> ^(COMP_ADD variable_stmt)
	|	INCREMENT SEMICOLON			-> INCR
	;
if_statement
	:	IF LEFT_PAREN boolean_exp RIGHT_PAREN LEFT_BRACKET statements RIGHT_BRACKET -> ^(IF_STATEMENT ^(BOOL_EXP boolean_exp) ^(STATEMENTS statements))
	;

boolean_stmt
	:	variable boolean_right -> ^(VAR variable) boolean_right
	;

boolean_right
	:	boolean_op variable -> ^(boolean_op variable)	
	|	-> EPSILON
	;

boolean_exp
	:	boolean_stmt boolean_exp_cont	-> boolean_stmt ^(BOOL_EXP boolean_exp_cont)
	|	NOT boolean_exp			-> ^(NOT ^(BOOL_EXP boolean_exp))
	;

boolean_exp_cont
	:	logical_op boolean_exp		-> logical_op ^(BOOL_EXP boolean_exp)
	|	-> EPSILON
	;

binary_op
	:	PLUS variable			-> PLUS ^(VAR variable)
	|	MINUS variable			-> MINUS ^(VAR variable)
	|	DIVIDE variable			-> DIVIDE ^(VAR variable)
	|	-> EPSILON
	;
boolean_op
	:	GT		-> GT
	|	GTE		-> GTE
	|	LT		-> LT
	|	LTE		-> LTE
	|	NOT_EQUAL	-> NOT_EQUAL
	|	LOGIC_EQUALS	-> LOGIC_EQUALS
	;
logical_op
	:	AND		-> AND
	|	OR		-> OR
	;
	
//QL Specific Keywords
FOREACH  
	:	 'foreach'
	;
SELECT  
	:	 'select'
	;
WHERE
	:	'where'
	;
WITH
	:	'with'
	;
AS
	:	'as'
	;
SET	
	:	'set'
	;
IF
	:	'if'
	;
IN	:	'in'
	;
STAR
	:	'*'
	;
REPEATER
	:	PERIOD PERIOD PERIOD
	;
CONTAINS
	:	'contains'
	;
IS	:	'is'
	;
HAS	:	'has'
	;
MAX	:	'max'
	;
PRINT
	:	'print'
	;
COMMA	:	','
	;
FILTER
	:	'->'
	;
//Structural
LEFT_PAREN
	:	'('
	;
RIGHT_PAREN
	:	')'
	;
LEFT_BRACKET 
	:	'{'
	;
RIGHT_BRACKET
	:	'}'
	;
LEFT_SQ_BRACKET
	:	'['
	;
RIGHT_SQ_BRACKET
	:	']'
	;
SEMICOLON
	:	';'
	;
COLON
	:	':'
	;
PERIOD
	: 	'.'
	;	
//Logical Operators
DQOUTE : '"'
    ;	
GT 	:	'>' 
	;
LT 	:	'<' 
	;
LTE	:	LT EQUALS
	;
GTE	:	GT EQUALS
	;
AND	:	'&&'
	|	'AND'
	|	'and'
	;
OR	:	'||'
	|	'OR'
	|	'or'
	;
NOT	:	'!'
	;
NOT_EQUAL 
	:	NOT EQUALS
	;
LOGIC_EQUALS	:	EQUALS EQUALS
		;
//Assignment
EQUALS	:	'='
	;
PLUS	:	'+'
	;
MINUS	:	'-'
	;
DIVIDE	:	'/'
	;
COMPOUND_ADD	:	PLUS EQUALS
	;
INCREMENT	:	PLUS PLUS
	;

//Node List
NODE_TYPE
	:	'package_declaration'
	|	'body_declarations'
	|	'variable_declaration'
	|	'import_declaration'
	|	'type_declaration'
	|	'field_declaration'
	|	'method_declaration'
	|	'interface_declaration'
	|	'constructor_declaration'
	|	'class_declaration'
	|	'variable_declaration_fragment'
	|	'variable_declaration_statement'
	|	'thrown_exceptions'
	|	'try_statement'
	|	'catch_clause'
	|	'initializer'
	|	'method_invocation'
	|	'if_statement'
	|	'expression'
	|	'operator'
	|	'conditional_expression'
	|	'continue_expression'
	|	'assignment'
	|	'this_expression'
	|	'class_instance_creation'
	|	'field_access'
	|	'instance_of_expression'
	|	'cast_expression'
	|	'super_field_access'
	|	'statement'
	|	'then_statement'
	|	'else_statement'
	|	'do_statement'
	|	'parameters'
	|	'body'
	|	'for_statement'
	|	'enhanced_for_statement'
	|	'switch_statement'
	|	'while_statement'
	|	'null_literal'
	|	'integer_literal'
	|	'character_literal'
	|	'string_literal'
	|	'boolean_literal'
	|	'variable'
	|	'file'
	|	'directory'
	;
	
ATTRIBUTES
	:	'name'
	|	'type'
	|	'return_type'
	|	'parameter_types'
	|	'is_constructor'
	|	'is_deprecated'
	|	'is_parameter'
	|	'is_field'
	|	'default_value'
	|	'modifiers'
	|	'origin'
	|	'kind'
	|	'declared_methods'
	|	'declared_fields'
	|	'declared_types'
	|	'declaring_class'
	|	'declaring_method'
	|	'package'
	|	'interfaces'
	|	'superclass'
	|	'boxing'
	|	'unboxing'
	|	'parameter_list'
	|	'modifier'
	|	'startLine'
	|	'endLine'
	|	'totalLines'
	|	'boolean_value'
	;
RESERVED_TYPES
	:	'is_class'
	|	'is_primitive'
	;

//Generics
ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

INTEGER :	'0'..'9'+
    ;

STRING 	:	'"' .* '"'
    ;
    
FLOAT
    :   ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    |   '.' ('0'..'9')+ EXPONENT?
    |   ('0'..'9')+ EXPONENT
    ;

fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;
    
SPACE  : (' ' | '\t' | '\r' | '\n')+ {skip();};

