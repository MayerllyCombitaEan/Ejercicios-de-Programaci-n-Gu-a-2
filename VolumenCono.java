import java.util.Scanner;
import java.lang.Math;
/**
 * Write a description of class VolumenCono here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VolumenCono
{
    // Volumen del tronco de cono
    public static void main(String[] args)
    {
    Scanner teclado = new Scanner (System.in);
    double RadioBaseSup, RadioBaseInf, h;
    double VolumenTroncoCono=0;
    
    System.out.println("Para hallar el volumen del tronco de cono ingrese los valores solicitados en centimetros");
    System.out.println("Ingrese el valor del radio de la base superior");
    RadioBaseSup=teclado.nextDouble();
    
    System.out.println("Ingrese el valor del radio de la base inferior");
    RadioBaseInf=teclado.nextDouble();
    
    System.out.println("Ingrese el valor de la altura del cono");
    h=teclado.nextDouble();
    
    VolumenTroncoCono=Math.round((1*(Math.PI*h*(Math.pow(RadioBaseSup,2)+Math.pow(RadioBaseInf,2)+(RadioBaseSup*RadioBaseInf))))/3);
    
    System.out.println("El volumen del tronco de cono es: " + VolumenTroncoCono + " centimetros cubicos");
        
    }   
}
