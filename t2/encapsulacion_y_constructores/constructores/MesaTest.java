public class MesaTest{
    public static void main(String [] args){
        Mesa myMesa1 = new Mesa();
        Mesa myMesa2 = new Mesa(1);
        Mesa myMesa3 = new Mesa(8);
        Mesa myMesa4 = new Mesa(6, "Plastico");

        myMesa1.desplegarMesa();
        myMesa2.desplegarMesa();
        myMesa3.desplegarMesa();
        myMesa4.desplegarMesa();
    }
}
