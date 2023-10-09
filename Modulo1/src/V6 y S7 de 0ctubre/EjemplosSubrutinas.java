public class EjemplosSubrutinas {

    public static void procedimiento (){
        // Ejemplo de definicion de un procedimiento
        int  numero = 10;
        numero++;
        System.out.println("Procedimiento aqui: " +numero);
    }
    public static void otroProcedimiento (int numero, String nombre){
        for (int i=0; i<numero; i++){
            System.out.println("Hola: " +nombre);
        }
    }
    public static int funcion () {
         int numero = 99;
         numero--;
         return 10; // LA FUNCIN SIEMPRE REGRESARÁ UN 10
    }
    public static double otraFuncion (int valor1, int valor2){
         double resultado = 0;
         resultado = valor1+ valor2;
         return resultado;
    }

    public static void main(String[] args) {
        System.out.println("** Ejemplo de subrutinas **");
        double numero = 0;
        procedimiento();
        otroProcedimiento(5, "Lucia");
        otroProcedimiento(2, "Pedro");
        otroProcedimiento(5, "Carlos");
        System.out.println("Llamando a funcion()+10 = " +(funcion() + 11));
        numero = otraFuncion(4,9);
        numero = 5 + otraFuncion(4,9);
        numero = otraFuncion(1,3) + otraFuncion(9,2);
        // numero = otraFuncion(funcion(4,5),8);
        System.out.println("Eso es todo");
        procedimiento();

    }

}