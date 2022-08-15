import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.println("hola mundito");
        Scanner in = new Scanner(System.in);

        System.out.println("como te llamas?");
        String name = in.nextLine();

        Persona joel = new PersonaImpl(name);
        joel.sayName(name, new String("pito"));



    }
}
