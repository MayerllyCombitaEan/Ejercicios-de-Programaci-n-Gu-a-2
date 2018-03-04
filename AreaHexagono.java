import java.util.Scanner;
import java.lang.Math;
/**
 * Write a description of class AreaHexagono here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AreaHexagono
{
    // Área de un hexágono regular
    public static void main(String[] args)
    {
     Scanner teclado = new Scanner (System.in);
     double lado;
     double apotema;
     double areahexagono = 0;
     
    System.out.println("Ingrese el valor del lado del hexágono");
    lado=teclado.nextDouble();
    
    System.out.println("Ingrese el valor del apotema");
    apotema=teclado.nextDouble();
    
    areahexagono = Math.round((6*lado*apotema)/2);
    
    System.out.println("El área del hexágono regular es: " + areahexagono + " centimetros al cuadrado");
    }
  
}
