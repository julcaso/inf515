//Composicion0.java

class Corazon{
    
    private String tipoCorazon;

    public Corazon(String tc){
        this.tipoCorazon = tc;
    }

    public String getTipoCorazon(){return tipoCorazon;}

}

class Persona{
    private Corazon unCorazon;

    public Persona(String tc){
        this.unCorazon = new Corazon(tc); //Este objeto corazon, es creado al momento de crear un objeto Persona.
        System.out.println("\nHe nacido con un corazon tipo: " + tc);
    }

    public String verCorazon(){
        return unCorazon.getTipoCorazon();
    }
}

//Tester Class

public class Composicion0{
    public static void main(String [] args){
        
        Persona p1 = new Persona("Corazon viejo y cansado");
        System.out.println("\nTengo un "+p1.verCorazon());

        p1 = null; //RIP la persona p1.
        
        try{
            p1.verCorazon();
        } catch(Exception e){
            System.out.println("\nEl corazon de p1 esta " + e.getMessage() +
                               ", es decir, p1 esta RIP\n");
        }
    }
}
