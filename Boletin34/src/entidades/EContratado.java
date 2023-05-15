package entidades;

import java.util.GregorianCalendar;

public class EContratado extends Empregado{
    
    private float soldoBasico;
    private static final int ANOACTUAL = 2023;
    private float soldoTotal;

    public EContratado(String DNI, String nome, String apelidos, GregorianCalendar calendario, float soldoBasico) {
        super(DNI, nome, apelidos, calendario);
        this.soldoBasico = soldoBasico;
        this.soldoTotal = soldoACobrar();
    }
    
    public float soldoACobrar(){
        float soldoTotal;
        int anosTrabajados = ANOACTUAL - super.getCalendario().get(GregorianCalendar.YEAR);
        
        if(anosTrabajados>=0 && anosTrabajados<=3){
            soldoTotal = soldoBasico + (5/100)*soldoBasico;
        }
        else if(anosTrabajados<=7){
            soldoTotal = soldoBasico + (10/100)*soldoBasico;
        }
        else if(anosTrabajados<=15){
            soldoTotal = soldoBasico + (15/100)*soldoBasico;
        }
        else{
            soldoTotal = soldoBasico + (20/100)*soldoBasico;
        }
        return soldoTotal;
    }

    public float getSoldoBasico() {
        return soldoBasico;
    }

    public void setSoldoBasico(float soldoBasico) {
        this.soldoBasico = soldoBasico;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + soldoTotal;
    }
    
    
    
}
