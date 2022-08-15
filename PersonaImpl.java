public class PersonaImpl implements Persona{
    
    private String name;
    private String city;

    public PersonaImpl(String name, String city){
        System.out.println("clase: " + this.getClass().getName() + " creada");
        this.name = name;
        this.city = city;
    }

    public PersonaImpl(String name){
        this(name,"Unknow");
    }

    public void sayName(String name){
        System.out.println("Hi My name is: "  + name);
    }

    public void sayName(String name, String city){
        System.out.println("Hi My Name is " + name + " and I am from " + this.city);
    }
}
