/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar EX2;


turma returns [int totalAlunos]
@after {
        {System.out.println("Numero de alunos : " + $totalAlunos);}}
: TURMA ID alunos {$totalAlunos = $alunos.totalAlunos;} PONTO
       
       
     ;

alunos returns [int totalAlunos]: aluno {ArrayList<String> nomes = new ArrayList<String>();
                                         nomes.add($aluno.nome);
                                         $totalAlunos=1;} (PONTOVIRGULA aluno {if(nomes.contains($aluno.nome)==true) System.out.println("Este nome ja existe na lista");
                                                                               else nomes.add($aluno.nome) ;$totalAlunos++;})*
       ;

aluno returns [String nome]: ID notas {$nome = $ID.text;
                                       float media = (float)$notas.total_nota/$notas.total_cadeira;
                 if($notas.total_cadeira<4 ||$notas.total_cadeira>6 ) System.out.println("O aluno " + $ID.text + " nao tem um número notas no intervalo [4,6]");
                   System.out.println("Media do aluno " +$ID.text+ " : " + media);
                   }
      ;

notas returns [int total_nota,int total_cadeira] : LPAREN NUM {if($NUM.int<0 ||$NUM.int>20 ) System.out.println("O aluno não tem notas no intervalo [0,20]");
                                                   $total_nota = $NUM.int; $total_cadeira=1;}
                                                   (VIRGULA NUM {if($NUM.int<0 ||$NUM.int>20 ) System.out.println("O aluno não tem notas no intervalo [0,20]");
                                                                 $total_nota += $NUM.int; $total_cadeira+=1;})* 
                                                   RPAREN 
                                                   ;





TURMA : [tT][uU][rR][mM][aA];
ID : [a-zA-Z]+;
NUM: [0-9]+;
VIRGULA: ',';
PONTOVIRGULA: ';';
PONTO: '.';
LPAREN:'(';
RPAREN:')';
WS: ('\r'? '\n' | ' ' | '\t')+ -> skip;