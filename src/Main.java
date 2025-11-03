

public class Main { //Nome de classes sempre em maiusculo
    public static void main(String[] args) {

        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022; //Camelcase
        System.out.println("Ano de lançamento: " + anoDeLancamento); //concatenação
        boolean incluidoNoPlano = true;

        double media = (9.8 + 6.3 + 8.0) / 3; //Tome cuidado com a precedecia de operadores
        System.out.println(media);

        //String sinopse = "Filme de aventura com galã dos anos 80"; //O String é uma classe diferente de int ou double
        //System.out.println(sinopse);

        //Text Blocks
        String sinopse = """
                Filme Top Gun
                Filme de aventura com galã dos anos 80
                Muito bom!
                Ano de lançamento:""" + " " + anoDeLancamento;
        System.out.println(sinopse);


        //Casting explicito, pois estamos dizendo para ele.
        int classificacao;
        classificacao = (int) media/2; //aqui estamos fazendo o casting informando que a media divido por 2, passará ser um inteiro e não mais um double como declarado na linha 13, ou seja é uma conversão.

        //isso poderia ser feito na mesma linha
        /*
        int classificacao = (int) media/2
        */
        System.out.println(classificacao);



        //Atividade Conversor de temperatura - instanciando objeto ConversorDeTemperatura
        ConversorDeTemperatura conversor = new ConversorDeTemperatura();

        //Chama metodos para coletar e converter graus celsius para farenheit
        conversor.coletandoGrausCelsius();
        conversor.conversaoCelsiusParaFarenheit();
    }
}
