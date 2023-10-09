import java.util.Scanner;

public class EjemploCiclos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ejemplo de ciclo en Java");
        int numero = 1;
        while(numero <= 10){System.out.println("Voy en el " +numero);
            numero++;
        }System.out.println("Eso es todo");
        // Programa de tablas de multiplicar
        System.out.println("Proporciona un numero del 1 al 12 para poder brindarte su tabla de multiplicar hasta el 12: ");
        numero = teclado.nextInt();
        int contador = 1;
        if (numero <= 12 && numero >= 1){
            while(contador<=10){
            System.out.println(numero + " x " + contador + " = " +numero*contador);
                    contador++;
        }}else{System.out.println("Proporciona un numero dentro del rango, por favor");

        //Ejemplo de dowhile
        //int numero = 100;



        }
    }

}

