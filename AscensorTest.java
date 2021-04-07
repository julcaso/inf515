public class AscensorTest{
    public static void main(String args []){
       
       Ascensor myAscensor1 = new Ascensor();
       Ascensor myAscensor2 = new Ascensor(3);
       
       myAscensor1.setMaximoPisos(4);
      
       System.out.println(myAscensor1.getMaximoPisos());

    }
}