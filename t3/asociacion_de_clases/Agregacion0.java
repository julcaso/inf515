//Agregacion0.java

import java.util.Vector;

class Empleado{
    
    private String nombre;

    public Empleado(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() { return nombre; }

}

class Empresa{
    private String nombre;
    //Esta es una forma de hacer agregacion en Java.
    private Vector<Empleado> listaEmpleados;

    //Para poder enviar a Empresa los empleados al momento de la creacion de Empresa.
    public Empresa(String nombreEmpresa, Vector<Empleado> empleados){
        this.nombre = nombreEmpresa;
        listaEmpleados = empleados;
    }

    public void verListaEmpleados(){
        System.out.println("\nEn la empresa " + nombre + ", Mis empleados son: \n");
        for(int i = 0; i < listaEmpleados.size(); ++i){
            System.out.println(listaEmpleados.get(i).getNombre());
        }
    }
}

public class Agregacion0{
    public static void main(String [] args){
        //Prepara lista de objetos empleado.
        Vector <Empleado> listaEmpleados = new Vector<Empleado>();
        
        //agregamos empleados a la lista de empleados.
        listaEmpleados.add(new Empleado("Wilfredo Mojica"));
        listaEmpleados.add(new Empleado("Raul Mateo"));
        listaEmpleados.add(new Empleado("Leoncio Martinez"));
        listaEmpleados.add(new Empleado("Kleto Ferrer"));

        //se crea el objeto Empresa y se le pone la lista de empleados.
        Empresa objEmpresa = new Empresa("Compania INF515",listaEmpleados);

        //veamos los empleados en la empresa.
        objEmpresa.verListaEmpleados();

        //borramos el objeto empresa (opcional).
        objEmpresa = null;

        //notar que los objetos no son eliminados.
        System.out.println("\nLa empresa fue eliminada, los empleados aun estan vivos!!. Ellos son:\n");
        for(int i = 0; i < listaEmpleados.size(); ++i){
            System.out.println(listaEmpleados.get(i).getNombre());
        }
    }
}
