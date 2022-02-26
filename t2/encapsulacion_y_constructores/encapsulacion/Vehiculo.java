/* Encapsulación  o  information  hiding, se da en  los miembros de la case; es decir,
con los atributos y los métodos. Un miembro atributo está  encapsulado cuando el nivel
de acceso de sus atributos es privado.

Para poder acceder a este atributo privado, se emplea la tecnica de crear  métodos  de 
acceso  llamados  getters y setters  para  setear  valores a los  atributos privados y 
tambien  para  obtener / consultar  estos  atributos   desde    otra   clase  o  desde
la misma clase. */

public class Vehiculo{
    private String color;
    private int velocidadMaxima;
    private int cantidadDePuertas;
    private String tipoVehiculo;

    //Metodos de acceso: getters y setters.
    //El metodo get sirve para obtener valores del atributo privado.
    //El metodo set sirve para setear o asignar valores al atributo privado.

    public void setColor(String colorDelVehiculo){
        color = colorDelVehiculo;
    }

    public String getColor(){
        return color;
    }

    public void setVelocidadMaxima(int velocidadMaximaDelVehiculo){
        if (velocidadMaximaDelVehiculo >= 300){
            velocidadMaxima = 0;
            System.out.println("\nError 1: velocidad invalida.");
        } else {
            velocidadMaxima = velocidadMaximaDelVehiculo;
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

    public void desplegarInformacion(){
        System.out.println("Color              : " + color);
        System.out.println("Velocidad Maxima   : " + velocidadMaxima);
        System.out.println("Cantidad de Puertas: " + cantidadDePuertas);
        System.out.println("Tipo de Vehículo   : " + tipoVehiculo);
    }
}
