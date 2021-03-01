grammar ex2_prof;

turma /*returns [int totalAlunos]
@after{
    System.out.println("Total de alunos: " + $totalAlunos);
}*/
: TURMA ID
        alunos
        {
            System.out.println("Total de alunos: " + $alunos.totalAlunos);
        }
        PONTO
        ;

alunos returns [int totalAlunos]:
        aluno               {$totalAlunos = 1;}
        (PONTOVIRG aluno    {$totalAlunos +=1;})*
        ;

aluno: ID notas
        {
            float media = (float)$notas.soma/$notas.totalNotas;
            System.out.println("Media do " + $ID.text +": " + media);
        }
        ;

notas returns [int soma, int totalNotas]: LPAREN
        n1=NUM          {$soma = $n1.int; $totalNotas = 1;}
        (VIRG n2=NUM    {$soma += $n2.int; $totalNotas += 1;})*
        RPARENT
        ;

TURMA: [tT][uU][rR][mM][aA];
ID: [a-zA-Z]+;
NUM: [0-9]+;
VIRG: ',';
PONTOVIRG: ';';
PONTO: '.';
LPAREN: '(';
RPARENT: ')';
WS: ('\r'?'\n'|'\t'|' ') -> skip;

