import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito ");
        String filme = leitura.nextLine();

        System.out.printf("Qual é o ano de lançamento ");
        int anoDeLancamento = leitura.nextInt();

        System.out.println("Diga sua avaliação para o filme ");
        double avaliacao = leitura.nextDouble(); //por padrão o Java aceita valores decimais separados por virgula, "," e não por ponto, pois no EUA é usado virgula para separar as casas decimais.

        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);
    }
}
