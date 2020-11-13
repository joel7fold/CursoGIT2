import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.println("hola mundito");
        Scanner in = new Scanner(System.in);

        System.out.println("como te llamas?");
        String name = in.nextLine();

        System.out.println("Bienvenido: " + name);

    }
}