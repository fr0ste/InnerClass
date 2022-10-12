package Interna;

public class ClaseLocal {
    public void metodoEjemplo() {
        System.out.println("Esto es un metodo de la clase externa");

        //Clases locales
        //Se puede usar dentro del metodo
        class claseLocal {
            private String ejemplo;

            public void metodoLocal() {
                System.out.println("Esto es un metodo de la clase Local");
            }
        }
        claseLocal claseLocal = new claseLocal();
        claseLocal.metodoLocal();
    }
}
