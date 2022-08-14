import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.println("hola mundito");
        Scanner in = new Scanner(System.in);

        System.out.println("como te llamas?");
        String name = in.nextLine();

        System.out.println("Bienvenido: " + name);
        
        int valor = 873;
        boolean bandera = false;

        if(valor > 850)
            System.out.println("el valor obtenido es menor a la variable");

        else 
            System.out.println("el valor de la variable es menor a 850");



    }
}
