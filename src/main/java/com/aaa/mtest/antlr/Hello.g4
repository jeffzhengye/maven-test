grammar Hello;

@header{
package com.aaa.mtest.antlr;
}

r : 'hello' ID ; 
ID : [a-z]+ ;
WS : [ \t\r\n]+ -> skip;