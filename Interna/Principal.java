package Interna;

public class Principal {
    public static void main(String[] args) {
        ClaseExterna claseExterna = new ClaseExterna();//Clase normal
        ClaseLocal claseLocal = new ClaseLocal();
        claseLocal.metodoEjemplo();
        ClaseExterna.claseInterna claseInterna = claseExterna.new claseInterna();//Se inicializa a travez de un objeto de la clase externa
        claseInterna.metodoInterno();
    }
}
