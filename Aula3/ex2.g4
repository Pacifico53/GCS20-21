grammar ex2;

@header {
    import java.util.List;
    import java.util.ArrayList;
}

@members {
    int totalAlunos = 0;
    int media = 0;
    int numNotas = 0;
    ArrayList<String> nomes = new ArrayList<String>();
    String currentNome;
}

turma: TURMA ID alunos PONTO
        {
            System.out.println("Alunos:" + totalAlunos);
        }
        ;

alunos: aluno (PONTOVIRG aluno)*
        ;

aluno: ID   {
            currentNome = $ID.text;
            if(nomes.contains(currentNome)){
                System.out.println("Repeated name: " + currentNome+ ".");
            }else{
                nomes.add(currentNome);
            }
       }
        notas {
            totalAlunos++;
            System.out.println("----------------\n"+currentNome+": M = "+media+".. N = "+numNotas);

            if(numNotas > 6 || numNotas < 4){
                System.out.println("Numero de notas invalido ("+numNotas+").\n-------------");
            } else {
                media = media / numNotas;
                System.out.println("Media = "+media+"\n--------------");
            }
            media = 0;
            numNotas = 0;
        }
        ;

notas: LPAREN
        NUM     {
            media += $NUM.int; numNotas++;
            if($NUM.int > 20 || $NUM.int < 0)
                System.out.println("Erro, nota invalida.");
        }
        (VIRG NUM {numNotas++; media += $NUM.int;})*
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

