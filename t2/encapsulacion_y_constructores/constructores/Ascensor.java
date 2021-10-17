public class Ascensor{
    //Declaracion de constantes.
    public final int TOPE_MAXIMO_PISOS = 5;
    public final int TOPE_MINIMO_PISOS = 1;
    
    //Declaracion de variables o atributos.
    private int maximoPisos;
    private int pisoActual;
    private int minimoPisos;

    public Ascensor(){
        System.out.println("Creando un nuevo objeto ascensor.");
    }

    public Ascensor(int parametroPisoActual){
        pisoActual = parametroPisoActual;
    }

    public Ascensor(int par1, int par2, int par3){
        maximoPisos = par1;
        pisoActual  = par2;
        minimoPisos = par3;
    }

    //metodos getter y setter.

    public int getMaximoPisos(){
        return maximoPisos;
    }

    public void setMaximoPisos(int parMaximoPisos){
        if (parMaximoPisos > TOPE_MAXIMO_PISOS){
            System.out.println("Numero de pisos invalido.");
            System.out.println("Maximo de pisos permitido entre " + TOPE_MINIMO_PISOS + " y " + TOPE_MAXIMO_PISOS);
        } else {
            System.out.println("Numero de pisos permitido. Asignado a " + parMaximoPisos);
            maximoPisos = parMaximoPisos;
        }
    }
}
