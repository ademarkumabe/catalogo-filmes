package RequisitosDoProjeto;

//Atidade de laço de repetição (infinitos1...)
public class AtividadeInfinitos1 {

    public static void main(String[] args) {
        int contador = 1;

        while(contador <= 10) {
            System.out.println(contador);
            contador++; //Se não tivermos o incremento na variavel de controle, o laço se repetira para sempre.
        }
    }
}
