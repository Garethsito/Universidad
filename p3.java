import java.util.Scanner;
public class p3 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    float x,x3=0;
    float x2=0;
    float menor=0 ,mayor =0, i=0;
    do{
    System.out.println("ingrese numero (-1 para terminar)");
    x = leer.nextFloat();
    if(x != -1){
        if(x>x2){
            mayor= x;
        }
        else if (x<x2){
            menor = x;
        }
        x2=x;
        x3=x2+x3;
        i++;


    }
    }while(x != -1);
    System.out.println("la suma de todos los numeros es: " + x3 + " y el promedio:" +x3/i);
    System.out.println("el numero menor es: " + menor);
    System.out.println("el numero mayor es: " + mayor);
    }
    
}
