public class VehiculoTest{
    public static void main (String [] args){
        Vehiculo miVehiculo = new Vehiculo();

        miVehiculo.setColor("Negro");
        miVehiculo.setVelocidadMaxima(250);
        miVehiculo.setCantidadDePuertas(5);
        miVehiculo.setTipoVehiculo("Jeepeta");

        miVehiculo.desplegarInformacion();
        
    }
}