import java.util.Scanner;


public class p2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre por favor");
        final String nombre = leer.nextLine();
        double c1,c2,c3,c4,c5=0;
        double[] calificaciones = new double[6];
        double promedio=0;
        int opc;
        do { 
            menu();
            opc = leer.nextInt();
            switch(opc) {
                case 1:
                System.out.print("ingrese su primera califcacion: ");
                c1 = leer.nextInt();
                System.out.print("ingrese su segunda califcacion: ");
                c2 = leer.nextInt();
                System.out.print("ingrese su tercera califcacion: ");
                c3 = leer.nextInt();
                System.out.print("ingrese su cuarta califcacion: ");
                c4 = leer.nextInt();
                System.out.print("ingrese su quinta califcacion: ");
                c5 = leer.nextInt();
        
                calificaciones[1] = c1;
                calificaciones[2] = c2;
                calificaciones[3] = c3;
                calificaciones[4] = c4;
                calificaciones[5] = c5;
                break;
                
                case 2:
                for (int i = 1; i < calificaciones.length; i++){
                    System.out.println("La calificacion " + i + ": " + calificaciones[i]);
                    promedio += calificaciones[i];
                }
                System.out.println("el promedio es: "+ promedio);
                break;
                case 3:
                double menor = calificaciones[0];
                for (int i = 1; i < calificaciones.length; i++){
                    if(calificaciones[i] < menor){
                        menor = calificaciones[i];
                    }
                    System.out.println("La calificacion " + i + ": " + calificaciones[i]);
                }
                System.out.println("La calificacion mas alta es: "+ menor);
                case 4:
                double mayor = calificaciones[0];
                for (int i = 1; i < calificaciones.length; i++){
                    if(calificaciones[i] > mayor){
                        mayor = calificaciones[i];
                    }
                    System.out.println("La calificacion " + i + ": " + calificaciones[i]);
                    promedio += calificaciones[i];
                }
                System.out.println("La calificacion mas alta es: "+ mayor);

                
                
            }

        } while (opc!=5);
        





    }

    public static void menu(){
        System.out.println("seleccione su opcion");
        System.out.println("1. Captura de nombre y calificaciones");
        System.out.println("2. Mostrar calificaciones y el promedio");
        System.out.println("3. Mostrar calificaciones y la calificacion mas baja");
        System.out.println("4. Mostrar calificaciones y la calificacion mas alta");
        System.out.println("5. Salir");

    }

    static boolean isNumber(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
