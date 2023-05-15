
package boletin33;

public abstract class SeleccionFutbol implements IntegranteSeleccionFutbol{
    protected Integer id,edad;
    protected String nombre,apellidos;

    @Override
    public String toString() {
        return "id=" + id + ", edad=" + edad + ", nombre=" + nombre + ", apellidos=" + apellidos;
    }
    
    
}
