public class VehiculoTest{
    public static void main (String [] arg){
        Vehiculo miVehiculo = new Vehiculo();
        miVehiculo.setColor("Gris");
        miVehiculo.setVelocidadMaxima(260);
        miVehiculo.desplegarPantalla();

        Vehiculo miVehiculo2 = new Vehiculo("Jeep SUV", 290, "Azul");
        miVehiculo2.desplegarPantalla();

    }
}