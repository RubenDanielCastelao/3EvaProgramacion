
package boletin33;


public class Entrenador extends SeleccionFutbol{

    private Integer idFederacion;
    
    @Override
    public void concentrarse() {
        System.out.println("Concentra aos futbolistas");
    }

    @Override
    public void viajar() {
        System.out.println("Viaxa o entrenador");
    }

    @Override
    public void entrenar() {
        System.out.println("O entrenador entrena aos futbolistas");
    }

    @Override
    public void jugarPartido() {
        System.out.println("O entrenador dirixe aos futbolistas no partido");
    }
    
    public void planificarEntrenamiento(){
        System.out.println("O entrenador planifica os entrenamientos");
    }

    @Override
    public String toString() {
        return super.toString() + ", idFederacion=" + idFederacion;
    }
    
    
}
