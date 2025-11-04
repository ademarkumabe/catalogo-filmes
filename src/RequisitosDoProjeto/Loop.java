package RequisitosDoProjeto;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;

        //usamos um laço para coletar 3 notas, e como temos uma atribuição composta (+=), a mediaAvaliação
        //recebera o valor da nota capturad que será somada com o valor da mediaAvalicao que por fim será atribuidao
        // a mediaAvaliacao, ou seja estava aculumando as notas, é como utlizar a repetição para realizar um somatorio,
        //isso também poderia ser feito da seguinte maneira: mediaAvaliacao = mediaAvaliacao + nota;

        for (int i = 0; i < 3; i++) {
            System.out.println("Diga sua avaliação para o filme ");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
        }

        System.out.println("Média de avaliações: " + mediaAvaliacao/3);
    }
}
