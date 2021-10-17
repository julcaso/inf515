public class Humano  {
    private int edad;
    private String colorDePelo;
    private String tamano;

    public Humano(){
        edad = 0;
        colorDePelo="negro";
        tamano="chiquito";
    }

    public Humano (int edad){
        this.edad = edad;
    }

    public void setEdad(int parametroEdad){
        if (parametroEdad < 0)
        {
            System.out.println("Edad debe ser > 0");
        } else
        {
            edad = parametroEdad;
        }
    }

    public int getEdad(){
        return edad;
    }

    public void mostrarHumano(){
        System.out.println("Edad: " + edad);
        System.out.println("Color de pelo: " + colorDePelo);
        System.out.println("Tamaño: " + tamano);
    }
}
