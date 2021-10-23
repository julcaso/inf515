public class Vehiculo{
    private String color;
    private int velocidadMaxima;
    private int cantidadDePuertas;
    private String tipoVehiculo;

    // Metodos constructores

    public Vehiculo(){
        cantidadDePuertas = 4;
        tipoVehiculo = "Carro";
    }

    public Vehiculo(String tipoVehiculo, int velocidadMaxima, String color){
        setTipoVehiculo(tipoVehiculo);
        setVelocidadMaxima(velocidadMaxima);
        setColor(color);
        cantidadDePuertas = 5;
    }

    // Metodos de acceso: getters y setters.

    public void setColor(String parColor){
        color = parColor;
    }

    public String getColor(){
        return color;
    }

    public void setVelocidadMaxima(int parVelocidadMaxima){
        if (parVelocidadMaxima >= 300){
            velocidadMaxima = 0;
            System.out.println("\nError 1: velocidad invalida.");
        } else {
            velocidadMaxima = parVelocidadMaxima;
        }
    }

    public int getVelocidadMaxima(){
        return velocidadMaxima;
    }

    public void setCantidadDePuertas(int parCantidadDePuertas){
        if (parCantidadDePuertas >= 10){
            cantidadDePuertas = 0;
            System.out.println("\nError 2: Cantidad de puertas invalida");
        } else {
            cantidadDePuertas = parCantidadDePuertas;
        }
    }

    public int getCantidadDePuertas(){
        return cantidadDePuertas;
    }

    public void setTipoVehiculo(String parTipoVehiculo){
        tipoVehiculo = parTipoVehiculo;
    }

    public String getTipoVehiculo(){
        return tipoVehiculo;
    }

    public void desplegarPantalla(){
        System.out.println("\n*** Salida de Objetos ***\n");
        System.out.println("Tipo de Vehiculo: \t" + getTipoVehiculo());
        System.out.println("Cantidad de puertas: \t" + getCantidadDePuertas());
        System.out.println("Color: \t\t\t" + getColor());
        System.out.println("Velocidad Maxima: \t" + getVelocidadMaxima());
        System.out.println();
    }
}