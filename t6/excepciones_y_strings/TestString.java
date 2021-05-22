public class TestString{
    public static void main(String [] args){

        System.out.println("La cantidad de argumentos es: " + args.length);

        try{
            if (!args[0].equals("NO-ACTION")){
                for (int i = 0; i < args.length; i++){
                    System.out.println("Argumentos [" + i + "]: " + args[i]);
                    System.out.println("Cambiar a mayusculas: " + args[i].toUpperCase());
                    System.out.println("Cambiar a mayusculas: " + args[i].toLowerCase());
                }
            }
        }catch (ArrayIndexOutOfBoundsException arrException){
            System.out.println("El sistema proporciono una excepcion");
            System.out.println("\nDetalle de la excepcion: ");
            System.out.println("======================== ");
            arrException.printStackTrace();
            arrException.getMessage();
        } catch (Exception e){
            System.out.println("La excepcion capturda es de arreglo");
            e.printStackTrace();
            e.getMessage();
        } finally {
            System.out.println("Este bloque se ejecuta siempre");
        }
    }
}
