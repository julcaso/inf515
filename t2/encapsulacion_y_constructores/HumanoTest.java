public class HumanoTest{
    public static void main (String [] args){
        Humano huma = new Humano(5);
        huma.mostrarHumano();
        System.out.println("\n");
        huma.setEdad(9);
        huma.mostrarHumano();
        System.out.println("\n");
        System.out.println("Edad del humano: " + huma.getEdad());
    }
}