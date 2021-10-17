public class Vehiculo{
    private String color;
    private int velocidadMaxima;
    private int cantidadDePuertas;
    private String tipoVehiculo;

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

}
