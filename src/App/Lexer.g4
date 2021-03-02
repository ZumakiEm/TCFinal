/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


grammar Lexer;

@header {
    package App;
}

INT : [0-9]+;
FLOAT : [0-9]*'.'[0-9]*;
//INT: ('+'|'-'|)[0-9];
//FLOAT: ('+'|'-'|)[0-9].[0-9];
fragment KEYS : ('{'|'}');
fragment BRACKETS : (']'|'[');
fragment PARENTHESIS : ('('|')');
SEMICOLON : ';';
COMMA : ',';
ASSIGN : ('=');
COMP : ('=='|'&'|'&&'|'|');
ARITH : ('+'|'-'|'*'|'/');
LOGIC : ('<'|'>'|'<='|'>=');
DATATYPE : ('int'|'float'|'string'|'double'|'void');
IF : 'if';
ELSE: 'else';
FOR: 'for';
WHILE:'while';
INC_DEC: ('++'|'--');
INC_DEC_REC:('+='|'-=');


fragment LETRA : [A-z]*;
fragment NUM: [0-9]*;
fragment DASH: '_';
//ID : (LETRA|DASH)(LETRA|NUM|DASH);
ID: ([a-zA-Z_][a-zA-Z0-9_]*);

programa: instrucciones;


instrucciones: estructuras
             | estructuras instrucciones
             |   listaID 
             |  listaID instrucciones
             
           ;


keyinst: listaID // Agregue para el caso que se ejecute solo una instruccion (no necesita llaves)
       |    '{' instrucciones '}' instrucciones
       | '{' instrucciones ('return' (ID|FLOAT | INT) SEMICOLON | 'return' SEMICOLON) '}' instrucciones
       | | '{' instrucciones ('return' (ID|FLOAT | INT) SEMICOLON | 'return' SEMICOLON) '}'  
       |  '{' instrucciones '}' 
       | '{' '}' 
       
       ;

exp_a:  (ID|FLOAT|INT|  ID '(' functionAux')' ) (ARITH|ASSIGN) (exp_a|ID|FLOAT | INT |  ID '(' functionAux')' ) 
        | (ID) INC_DEC
        | ID INC_DEC_REC ID
     ;

declaracion: DATATYPE ID ASSIGN (FLOAT| INT | ID | exp_a)
           |  DATATYPE ID ASSIGN ID '(' functionAux')' 
           
           ;

declaracion_sola: DATATYPE ID
                           | DATATYPE ID COMMA declaracion_sola
                           | exp_a //Agregue
                           |
                ;

asignacion: ID ASSIGN (FLOAT|ID | INT|exp_a) SEMICOLON
                 | ID ASSIGN (FLOAT|ID | INT|exp_a) COMMA asignacion
                 | ID SEMICOLON
                 | ID COMMA asignacion
                                   
                ;

listaID : declaracion SEMICOLON
          | declaracion COMMA asignacion
          | declaracion_sola SEMICOLON
          | declaracion_sola asignacion
          | asignacion //Agregue
            ;
          

exp_l: (ID|FLOAT | INT) LOGIC (ID|FLOAT | INT)
        | '(' (ID|FLOAT | INT) LOGIC (ID|FLOAT | INT) ')'
        ;

if_: IF '(' exp_l')' keyinst else_ 
   | IF '(' exp_l')' keyinst
     
   ;
  
functionAux: ID
           | ID COMMA functionAux
           |
           ;
              
else_: ELSE keyinst;

function_: 
           declaracion_sola '('  ')' keyinst
         | declaracion_sola '(' declaracion_sola ')' keyinst
         | declaracion_sola '(' declaracion_sola')'
         | ID '(' functionAux')' SEMICOLON
         ;

for_: FOR '(' (  | declaracion | ID ASSIGN (FLOAT|ID | INT)) ';' (exp_l |  ) ';' ( exp_a |  ) ')' keyinst;

list_exp_l: exp_l COMP list_exp_l
          | (exp_l|ID|INT|FLOAT)
          ;

while_: WHILE '(' list_exp_l ')' keyinst;

estructuras: if_
           | for_
           | function_
           | while_
           ;

//linea para saltear espacios en blanco
WS: ('\n'|' '|'\t'|'\r') -> skip ;