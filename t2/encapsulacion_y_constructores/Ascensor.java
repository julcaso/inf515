public class Ascensor{
    private int maximoPisos = 5;
    private int pisoActual = 0;

    public Ascensor(){}

    public Ascensor(int parametroPisoActual){
        pisoActual = parametroPisoActual;    
    }

    public void setMaximoPisos(int parMaximoPisos){
        if (parMaximoPisos > maximoPisos){
            System.out.println("Numero de pisos invalido");
            System.out.println("La cantidad debe estar entre 1 y " + maximoPisos);
        } else {
            System.out.println("Numero de pisos permitido. Asignado a " + parMaximoPisos);
        }
    }

    public int getMaximoPisos(){
        return maximoPisos;
    }
}
