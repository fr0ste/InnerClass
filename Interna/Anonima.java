package Interna;

abstract class ClaseAnonima {
    public abstract void metodoAnonimo();
}

public class Anonima {

    public static void main(String args[]) {
        ClaseAnonima inner = new ClaseAnonima() {
            public void metodoAnonimo() {
                System.out.println("Este es un ejemplo de la clase interna anonima");
            }
        };
        inner.metodoAnonimo();
    }
}
