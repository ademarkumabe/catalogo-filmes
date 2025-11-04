package RequisitosDoProjeto;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalNotas = 0;

        //O while usamos quando não sabemos a quantidades de repetições que ocorrerá laço
        //E pelo fato de estamos lidando com medias, e não sabermos quantas iterações, precisamos contar quantas vezes o laço se repetiu, por isso criamos uma variavel para contar
        //Por isso criamos a variavel totalNotas, pois no final precisamos saber quantas notas temos para saber o valor pelo qual iremos dividir, como ocorre no calculo de media.

        while (nota != -1) {
            System.out.println("Diga sua avaliação para o filme ou -1 para encerrar");
            nota = leitura.nextDouble();
            if (nota != -1) {
                mediaAvaliacao += nota;
                totalNotas++; //aqui estamos incrementando totalNotas
            }
        }

        System.out.println("Média de avaliações: " + mediaAvaliacao/totalNotas);
    }
}
