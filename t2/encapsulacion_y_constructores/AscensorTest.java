public class AscensorTest{
    public static void main (String [] args){
        Ascensor myAscensor1 = new Ascensor();
        Ascensor myAscensor2 = new Ascensor(3);
        Ascensor myAscensor3 = new Ascensor(5, 6, 7);

        //Seteando un valor invalido.
        myAscensor1.setMaximoPisos(10);

        //Seteando un valor valido.
        myAscensor1.setMaximoPisos(4);

        System.out.println("Numero de pisos maximos: " + myAscensor1.getMaximoPisos());
        
    }
}