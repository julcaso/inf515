//Herencia1

class Libro {
    
    protected int paginas;

    Libro(){
        paginas = 5555;
    }

    public void setPaginas(int numPaginas){
        paginas = numPaginas;
    }

    public int getPaginas(){
        return paginas;
    }
}

class Diccionario extends Libro {

    //Default access.
    
    private int definiciones;

    Diccionario(){
        definiciones = 3333;
    }

    double relacion(){
        return (double) definiciones / paginas;
    }

    void setDefiniciones(int numDefiniciones){
        definiciones = numDefiniciones;
    }

    int getDefiniciones(){
        return definiciones;
    }

}

public class Herencia1 {
    public static void main(String [] args){
        Diccionario d1 = new Diccionario();
        System.out.println("\n\t => Numero de paginas: " + d1.getPaginas());
        System.out.println("\n\t => Numero de definiciones: " + d1.getDefiniciones());
        System.out.println("\n\t => Relacion definiciones a paginas: " + d1.relacion());
    }
}
