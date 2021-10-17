/***************************************
Autor:    Profesor Julio Castro Ortiz.
Fecha:    9/5/2021.
Semestre: 2021-10.
Objetivo: Ejemplo docente.
Tema:     Constructores.
Materias: INF514, INF515.
****************************************/

public class Mesa{
    int cantidadPatas;
    String materialFabricacion;
    
    public Mesa(){
        cantidadPatas = 4;
        materialFabricacion = "Madera";
    }
    
    public Mesa(int patas){
        cantidadPatas = patas;
        materialFabricacion = "Madera";
    }

    public Mesa(int patas, String material){
        cantidadPatas = patas;
        materialFabricacion = material;
    }

    public void desplegarMesa(){
        System.out.println("\n---------------------------");
        System.out.println("Cantidad de patas:         " + cantidadPatas);
        System.out.println("Material de fabricacion:   " + materialFabricacion);
        System.out.println("---------------------------");
    }
}
