class A{
    private int x;
    protected double y;

    public A(){
        System.out.println("Llamada al constructor de la clase A: *Padre*");
    }

    public A(int x, double y){
        this.x = x;
        this.y = y;
    }

    protected int getX() { return x; }

    protected double getY() { return y; }

}

class B extends A {
    private String nombre;

    public B(){
        System.out.println("Llamada al constructor de B: *Hijo*");
    }

    public B(int x, double y, String no){
        super(x, y);
        nombre = no;
    }

    void desplegarInformacion(){
        System.out.println("Valor de x: " + getX());
        System.out.println("Valor de y: " + getY());
        System.out.println("Valor de nombre: " + nombre + "\n");
    }
}

public class Herencia2{
    public static void main(String [] args){
        
        B myObjectB1 = new B();
        myObjectB1.desplegarInformacion();

        B myObjectB2 = new B(5, 7.3, "Julio Castro");
        myObjectB2.desplegarInformacion();

    }
}
