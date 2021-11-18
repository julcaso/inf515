public class VehiculoTest{
    public static void main (String [] args){
        Vehiculo miVehiculo1 = new Vehiculo();
        Vehiculo miVehiculo2 = new Vehiculo("Negro", 200,"avion");
        Vehiculo miVehiculo3 = new Vehiculo();

        miVehiculo3.setColor("Negro");
        miVehiculo3.setVelocidadMaxima(250);
        miVehiculo3.setCantidadDePuertas(5);
        miVehiculo3.setTipoVehiculo("Jeepeta");

        miVehiculo1.desplegarInformacion();
        miVehiculo2.desplegarInformacion();
        miVehiculo3.desplegarInformacion();
    }
}
