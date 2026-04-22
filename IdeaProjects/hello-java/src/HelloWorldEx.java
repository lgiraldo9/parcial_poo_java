import java.io.IOException;//int tecla = System.in.read();

public class HelloWorldEx {
    public static void main(String[] args) throws IOException {
        //1 imprime un mnesjae que diga tu nombre en lugar de "hola mundo"
        System.out.println("Luis Gonzalo Giraldo Garcia");

        //2 imprime dos lineas: "hola" y luego "mundo" con un solo println
        System.out.println("hola \nmundo");

        //3 añade un comentario sobre lo que hace cada linea del programa
        System.out.println("hola \nmundo");
        // system hacems una llamada al systema
        // utilizamos la propiedad out para dale salida
        //println para imprimri en pantalla le mensaje escrito
        // \n se utiliza para hacer un salta de lina dentro de un mism mensaje

        //4 crea un comentario en varias lineas
        /*esto es
        un comentario
        en varias
        lineas
        * */
        //5 imprime tu edad, tu color favorito y tu ciudad
        System.out.println("mi edad es de 28 años");
        System.out.println("mi color favorito es el negro");
        System.out.println("mi ciudad es barranquilla");

        //6 explora los diferentes System.xxx.println();mas alla del out
        System.out.print("Hola ");      // imprime sin salto de línea
        System.out.println("mundo!");   // imprime y añade salto de línea
        System.out.printf("Tienes %d años", 25); // formato estilo C

        int tecla = System.in.read(); // Lee un solo carácter (código ASCII)

        System.err.println("Error: archivo no encontrado");//Sirve para mostrar mensajes de error o advertencia en la consola

        //System.exit(int status)//Finaliza el programa de manera controlada.



        //7 utiliza varios println para imprimir una frase

        System.out.println("hola");
        System.out.println("mi nombre es ");
        System.out.println("luis");
        System.out.println("y soy desarollador JAVA");

        //8 imprime un diseño ASCII por  ejemplo una cara feliz usando simbolos

        System.out.println("=)");
        System.out.println("-.-");


        //9 intenta ejecutar el programa sin el metodo main y observa el error
        // me manda un lista de erorres si no lo ejcutro con el metodo main erro identifier
        //10 intenta cambiar el nombre del archivo de la clase y compilalo


    }
}
