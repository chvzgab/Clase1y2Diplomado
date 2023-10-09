public class Arreglos {
    public static void main(String[] args) {
        // Definicion de arreglos
        //el main es un arrgeglo de strings
        int [] promedios;
        double [] calificaciones;
        String [] direcciones;

        //Definicion e inicializacion de arreglos
        int [] alturas = new int[5]; // Alturas es un arreglo de 5 elementos de tipo int
        double [] estaturas = new double[5];
        String [] nombres = new String[5];

        // Loos indices permiten acceder a elementos individuales. Se numeran a partir del cero
        alturas [3] = 178;
        alturas [2] = 178;
        alturas [4] = 178;
        alturas [0] = 178;
        nombres [4] = "Andrea";
        nombres [1] = "Luis";
        nombres [6] = "Pedro";
        promedios = new int[45];
        promedios = new int[36]; // Perdemos lo que tenemos en los 45 elementos anteriores

        for (int i= 0; i<5; i++){
            System.out.println("Alturas ("+i+")="+alturas[i]);
            System.out.println("Nombres " +nombres[i]);
        }
    }

// Los nombres y los promedios deben estar en un arreglo, dos arreglos
// Se genera funcion en main que genera promedio de las personas
//    double promedios[5] = new double[];


    }
// Pedir los datos de 5 personas (nombre y calificacion) guardar datos en arreglo de strings y doubles
// Calcular el promedio de las 5 calificaciones y se desplegará en pantalla

// Pedir el mes del año que indique los meses dentro del rango de enero a diciembre
// en arreglo de 1-12, los nombres deben estar en arreglo de strings por orden y los
// numeros del mes en condicional