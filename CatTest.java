public class CatTest{
    public static void main (String [] args){
        Cat myCat1 = new Cat();
        myCat1.setName("Misu");

        Cat myCat2 = new Cat("Misifu");

        myCat1.walk();
        myCat1.eat();

    }
}