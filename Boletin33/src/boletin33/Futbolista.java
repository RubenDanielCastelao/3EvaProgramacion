
package boletin33;

public class Futbolista extends SeleccionFutbol{

    private Integer dorsal;
    private String demarcacion;
    
    @Override
    public void concentrarse() {
        System.out.println("concentrase o futbolista");
    }

    @Override
    public void viajar() {
        System.out.println("Viaxa o futbolista");
    }

    @Override
    public void entrenar() {
        System.out.println("entrena o futbolista");
    }

    @Override
    public void jugarPartido() {
        System.out.println("juega o futbolista");
    }
    
    public void entrevista(){
        System.out.println("entrevistan al futbolista");
    }

    @Override
    public String toString() {
        return super.toString() + ", dorsal=" + dorsal + ", demarcacion=" + demarcacion;
    }
    
    
}
