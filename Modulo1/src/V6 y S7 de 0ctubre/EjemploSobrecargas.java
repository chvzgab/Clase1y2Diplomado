import com.sun.security.jgss.GSSUtil;

public class EjemploSobrecargas {
    public static void saluda(){
        System.out.println("Hola");
    }
    public static void saluda(String persona){
        System.out.println("¿Qué hay de nuevo " +persona+"?");
    }
    public static void saluda(long veces){
        for (int i=0; i<veces;i++){
            System.out.println("Hola");
        }
    }
    public static int suma (int x, int y){
        return x+y;
    }
    public static double suma (double x, double y){
        return x+y;
    }
    public static void main(String[] args) {
        System.out.println("** Ejemplo de sobrecarga de funciones y procedimientos **");
        saluda();                    // Ejectua el primer saludo
        saluda("Gabriel");   // Ejecuta el segundo saludo
        saluda(10);           // Ejecuta el tercer saludo
        double resultado = 0;
        resultado    = suma(1,2);

        System.out.println("Fin del programa");
    }
}
