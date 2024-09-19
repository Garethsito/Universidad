import java.util.Scanner;

public class Main {

    //funciones de captura
    public static String capturaTexto(){
        System.out.println("ingresa tu texto");
        Scanner cadena = new Scanner(System.in);
        return cadena.nextLine();
    }
    public static int capturaInt(){
        System.out.println("ingresa tu numero entero");
        Scanner numero = new Scanner(System.in);
        return numero.nextInt();
    }

    public static float capturarDec(){
        System.out.println("ingresa tu numero decimal");
        Scanner decimal = new Scanner(System.in);
        return decimal.nextFloat();
    }

    //funciones para mostrar
    public static void mostrarInt(int numero){
        System.out.println("tu numero es: " + numero);
    }

    public static void mostrarFloat(float decimal){
        System.out.println("tu numero es: " + decimal);
    }

    public static void mostrarText(String texto){
        System.out.println("tu texto es: " + texto);
    }
    public static void main(String[] args) {
            String texto = capturaTexto();
            float decim = capturarDec();
            int ent = capturaInt();

            mostrarText(texto);
            mostrarInt(ent);
            mostrarFloat(decim);
        }
    
}