import java.util.Scanner;

public class ConversorDeTemperatura {
    Scanner keyboard = new Scanner(System.in);
    double grausCelsius;
    double grausFahrenheit;

    public void coletandoGrausCelsius(){
        System.out.println("informe o valor em graus celsius: ");
        grausCelsius = keyboard.nextDouble();
    }
    public void conversaoCelsiusParaFarenheit(){
        grausFahrenheit = grausCelsius * 1.8 + 32;
        String mensagem = """
                %.210f graus celsius equivale %.2f graus farenheit
                """.formatted(grausCelsius, grausFahrenheit);
        System.out.println(mensagem);
    }
}
