package ejecutable;
import Modelo.Modelo;




public class Test {

  
  public static void main(String[] args) {
    
    Modelo miplan = new Modelo();
    miplan.setNumeroCel(3228413);
    miplan.setMinutos(3);
    miplan.setOperador("Movil-lujo");
    miplan.setCostoMinuto(300);
  

  System.out.println("El numero de celular es " + miplan.getNumeroCelular() + 
    " El operador es :" + miplan.getOperador() + 
    " El saldo total es de : " + miplan.calcularPago());






    
  }
  
}
