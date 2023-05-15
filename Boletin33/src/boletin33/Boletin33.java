
package boletin33;

public class Boletin33 {

    public static void main(String[] args) {
        SeleccionFutbol obxF;
        obxF = new Futbolista();
        llamadas(obxF);
        obxF = new Entrenador();
        llamadas(obxF);
        obxF = new Masajista();
        llamadas(obxF);
        obxF = new Seleccionador();
        llamadas(obxF);
    }
    
    public static void llamadas(SeleccionFutbol obxF){
        obxF.concentrarse();
        obxF.viajar();
        obxF.entrenar();
        obxF.jugarPartido();
        System.out.println(obxF.toString());
        System.out.println("******************");
    }
    
}
