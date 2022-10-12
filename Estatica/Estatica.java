package Estatica;

public class Estatica {
    static class ClaseAnidada {
        public void metodo() {
            System.out.println("Clase anidada");
        }
    }

    public static void main(String args[]) {
        ClaseAnidada m = new ClaseAnidada();
        m.metodo();
    }
}
