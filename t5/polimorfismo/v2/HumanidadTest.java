public class HumanidadTest{
    public static void main(String [] args){
        
        //Ejemplo 1: primera forma de polimorfismo.
        //Utilizando la misma variable de referencia.

        Humano persona;

        //persona = new Humano();
        persona = new Hombre();
        persona.hablar();
        persona.caminar();

        persona = new Mujer();
        persona.hablar();
        persona.caminar();

        //Ejemplo 2: segunda forma de polimorfismo.
        //Utilizando diferentes variables de referencia.

        Humano persona1 = new Hombre();
        Humano persona2 = new Mujer();

        persona1.hablar();
        persona1.caminar();

        persona2.hablar();
        persona2.caminar();

    }
}