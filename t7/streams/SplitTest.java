public class SplitTest{
    public static void main(String [] args){
        String [] campos;
        String cadena = "00116055558|Julio Castro|SI|21-04-1980|C";
        
        campos = cadena.split("\\|");

        String cedula          = campos[0];
        String nombre          = campos[1];
        String activo          = campos[2];
        String fechaNacimiento = campos[3];
        String estadoCivil     = campos[4];

        System.out.println("Cedula          : "+ cedula);
        System.out.println("Nombre          : "+ nombre);
        System.out.println("Activo          : "+ activo);
        System.out.println("Fecha nacimiento: "+ fechaNacimiento);
        System.out.println("Estado civil    : "+ estadoCivil);
    }
}
