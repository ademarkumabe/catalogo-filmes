public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 1990; //Camelcase
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        String tipoPlano = "plus";

        //Para filmes de 2022 são filmes lançamentos
        if (anoDeLancamento >= 2022){
            System.out.println("Lançamentos que os clientes estão curtindo!");
        }else{
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        //mas poderia ser apenas (incluidoNoPlano) - na condições usamos o pipe para condicional "ou" && seria usado para "e"
        if (incluidoNoPlano == true && tipoPlano.equals("plus")){ //Usamos o metodo equals para comparar o conteudo das variaveis são iguais.
            System.out.println("Filme liberado");
        }else{
            System.out.println("Deve pagar a locação");
        }
    }
}
