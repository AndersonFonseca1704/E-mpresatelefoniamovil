package Modelo;

public class Modelo {
    
    //---------------
    //Atributos
    //--------------
    public  double costoMinuto;
    private int minutos;
    private long numeroCelular;
    private String operador;
    

    //-------
    //Metodos
    //--------

    //-----------------------
    //Constructor por defecto
    //-----------------------
    public Modelo() {
        this.numeroCelular = 0;
        this.minutos = 0;
        this.operador = " ";
        this.costoMinuto = 0;
    }

    //-----------------------------
    //Constructor comun u ordinario
    //-----------------------------
    public Modelo(long numeroCelular,int minutos,String operador,double costoMinuto) {
        
        this.numeroCelular = numeroCelular;
        this.minutos = minutos;
        this.operador = operador;
        this.costoMinuto = costoMinuto;
    }
    //-----------------
    //Constructor copia
    //-----------------
    public Modelo(Modelo f) {
        minutos = f.getMinutos();
        numeroCelular = f.getNumeroCelular();
        operador = f.getOperador();
        costoMinuto = f.costoMinuto;

    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public long getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCel(long numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public void setCostoMinuto(double costoMinuto) {
        this.costoMinuto = costoMinuto;
    }
    public double getCostoMinuto() {
        return costoMinuto;
    }
   
    

    public double calcularPago() {

        double pagoTotal = costoMinuto * minutos;
       
        
        if(operador.equals("Movil-lujo")) {
            
            pagoTotal = pagoTotal * 0.5;
            
        }
        return pagoTotal;
    }
}

