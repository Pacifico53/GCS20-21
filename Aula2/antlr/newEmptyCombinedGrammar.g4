grammar newEmptyCombinedGrammar;

@members {
    int tamanho = 0;
    int totalNumeros = 0;
    int soma = 0;
    int totalPalavras = 0;
}

listas: lista+
    ;

lista: Lista elementos '.'
    {
        System.out.println("Ocorrencia de números: " + totalNumeros);
        System.out.println("Tamanho da lista: " + tamanho);
        System.out.println("Soma: " + soma);
        if(totalNumeros == totalPalavras) System.out.println("Igual numero de palavras e nrs: " + totalPalavras);
        else System.out.println("Diferente numro de palavras e de numeros: nPalavra: "+totalPalavras+" nNumeros: "+totalNumeros);

        tamanho = 0;
        totalNumeros = 0;
        totalPalavras = 0;
        soma = 0;
    }
    ;

elementos : elemento        {tamanho = 1;}
            (',' elemento   {tamanho++;})*
            ;
/*
elementos returns [int total]
@init ( total = 0;)
    :e1 = elemento      {tamanho = 1; $total = $e1.number;}
    (',' e2=elemento    {
                            tamanho++;
                            $total += $e2.number;
                        })*
    ;
*/

elemento : PALAVRA  {totalPalavras++;}
         | NUM      {
                    totalNumeros++;
                    soma += $NUM.int;
                    }
         ;


//LEXER
Lista: [lL][iI][sS][tT][aA]
     ;
NUM: ('0'..'9')+ //[0-9]+
   ;

PALAVRA: [a-zA-Z][a-zA-Z0-9]*
       ;

WS: ('\r'? '\n' | ' ' | '\t')+ -> skip;
