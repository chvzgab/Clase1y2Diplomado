import java.util.Scanner;

public class Ejemplo1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        /*System.out.println("Ejemplo de if: ");
        Scanner teclado = new Scanner(System.in);
        int edad = 0;
        System.out.println("Dame tue dad y te diré si eres un adulto: ");
        edad = teclado.nextInt();
        if (edad >= 18){
            System.out.println("Veo que tienes " + edad + ", por lo tanto eres un adulto");
        }else{
            System.out.println("Veo que tienes " + edad + ", por lo tanto eres no un adulto");
        }
        */
        System.out.println("Captura un numero para saber si es par o impar: ");
        int numero = teclado.nextInt();
        if (numero % 2 == 0){
            System.out.println("El número es par");
        }else{
            System.out.println("El número es impar");
        }

    }
}
