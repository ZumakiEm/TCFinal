/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar Rules;

/*
@header {
    package App;
}*/

fragment LETRA : [A-Za-z];
fragment DIGITO : [0-9];

//caracteres de agrupacion
PA : '(';
PC : ')';
LA : '{';
LC : '}';

//tipos de datos
INT : 'int';
FLOAT : 'float';
DOUBLE : 'double';
CHAR : 'char';

//ciclos
FOR : 'for';
WHILE : 'while';
DO : 'do';

//condicional
IF : 'if';
ELSE : 'else';
ELSE_IF : 'else if';

//valores de asignacion
CARACTER : '\''(LETRA | DIGITO)'\'' ;
NUMERO : DIGITO+;
FLOTANTE : NUMERO'.'NUMERO;

//caracteres de operaciones matematicas
SUMA : '+';
RESTA : '-';
MULTI : '*';
DIV : '/';
RESTO : '%';
INC : '++';
DEC : '--';
NOT : '!';

//carateres de separacion
PYC : ';';
COMA : ',';

//caracteres de operadores relacionales de comparacion
MAYOR : '>';
MAYORIGUAL : '>=';
MENOR : '<';
MENORIGUAL : '<=';
DISTINTO : '!=';
IGUAL : '==';

//caracteres logicos
AND : '&&';
OR : '||';

RETORNO : 'return';
ID : (LETRA | '_') (LETRA | DIGITO | '_')*;
ASIGN : '=';
AC_POS : '+=';
AC_NEG : '-=';

// reglas terminales
tipos : INT
      | FLOAT
      | DOUBLE
      | CHAR
      ;

constante : NUMERO
          | FLOTANTE
          | CARACTER
          ;

comparacion : MAYOR
            | MAYORIGUAL
            | MENOR
            | MENORIGUAL
            | DISTINTO
            | IGUAL
            ;

//regla de entrada
programa : instrucciones EOF;

instrucciones : instruccion instrucciones
              |
              ;

instruccion : declaracion PYC
            | asignacion PYC
            | acumulacion PYC
            | operaciones PYC // solo operaciones caso -> a++
            | if_condicional
            | ambito
            | ciclo_for
            | ciclo_while
            | ciclo_do
            | declaracion_funcion PYC
			| definicion_funcion
			| funcion PYC
            | retorno PYC
            ;

declaracion_funcion : tipos ID PA param_declaracion PC
					;

param_declaracion : tipos (ID | )
		   		  | tipos (ID | ) COMA param_declaracion
		   		  ;

definicion_funcion: tipos ID PA param_definicion PC ambito
				  ;

param_definicion : tipos ID
			     | tipos ID COMA param_definicion
                 |
				 ;

funcion : ID PA parametros PC
		;

parametros : operaciones
		   | operaciones COMA parametros
		   |
		   ;

retorno : RETORNO (operaciones | );

declaracion : tipos lista_declaracion;

// regla que contempla el caso de declaracion multiple de variables -> int x,y,z;
lista_declaracion : ID
                  | asignacion
                  | asignacion COMA lista_declaracion
                  | ID COMA lista_declaracion
                  ;

asignacion : ID ASIGN operaciones;

acumulacion : ID AC_POS operaciones
            | ID AC_NEG operaciones;

//operaciones artimeticas logicas
operaciones : disyuncion;

// se separa si hay un OR logico 
disyuncion : conjuncion
           | disyuncion OR conjuncion;

// se separa si hay un AND logico
conjuncion : igualdad
           | conjuncion AND igualdad;

// se separa si hay alguna comparacion logica
igualdad : expresion
         | igualdad comparacion expresion;

// terminada la parte logica se empieza a separar lo aritmetico
expresion : termino exp;

// se separa los terminos por + ó -
exp : SUMA termino exp
    | RESTA termino exp
    |
    ;

// tomamos el primer termino general
termino : factor term;

// tomamos los siguientes terminos que pueden existir
// ej : x = a + b - c
// (a -> primer termino)
// (+ b -> segundo termino) 
// (- c -> tercer termino)
term : MULTI factor term
     | DIV factor term
	 | RESTO factor term
     |
     ;

// en caso de parentesis se considera que puede venir una 
// operacion aritmetico logica nueva
factor : prefix PA operaciones PC
       | prefix NUMERO
       | prefix ID postfix
	   | prefix FLOTANTE
	   | prefix funcion
	   | prefix CARACTER
       ;

// simbolo de prefijo a un ID (variable, constante, etc)
prefix : INC
	   | DEC
	   | SUMA
	   | RESTA
	   | NOT prefix     // se puede poner varios NOT seguidos
	   |
	   ;

postfix : INC   // caso b++;
        | DEC   // caso ++b;
        |
        ;

if_condicional : IF PA operaciones PC instruccion else_condicional;

else_condicional : (ELSE | ELSE_IF PA operaciones PC) instruccion
                 |
                 ;

//ciclos
ciclo_for : FOR PA (asignacion | lista_declaracion | ) PYC (operaciones | ) PYC (operaciones | asignacion | ) PC instruccion;
ciclo_while : WHILE PA operaciones PC instruccion;
ciclo_do : DO instruccion WHILE PA (operaciones | ) PC;

ambito : LA instrucciones LC;

WS: [ \n\t\r] -> skip ;
