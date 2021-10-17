public class VehiculoTest{
    public static void main (String [] arg){
        Vehiculo miVehiculo = new Vehiculo();

        miVehiculo.setTipoVehiculo("Santa Fe 2010");
        miVehiculo.setCantidadDePuertas(5);
        miVehiculo.setColor("Gris");
        miVehiculo.setVelocidadMaxima(260);

        System.out.println("\n*** Salida de Objetos ***\n");
        System.out.println("Tipo de Vehiculo: \t" + miVehiculo.getTipoVehiculo());
        System.out.println("Cantidad de puertas: \t" + miVehiculo.getCantidadDePuertas());
        System.out.println("Color: \t\t\t" + miVehiculo.getColor());
        System.out.println("Velocidad Maxima: \t" + miVehiculo.getVelocidadMaxima());
        System.out.println();
    }
}
