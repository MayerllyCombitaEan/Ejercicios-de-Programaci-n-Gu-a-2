import java.util.Scanner;
import java.lang.Math;
/**
 * Write a description of class TroncoPriramide here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TroncoPriramide
{
    // área del tronco de piramide
    public static void main(String[] args)
    {
    Scanner teclado = new Scanner (System.in);
    double b, B, h;
    double areabaseinferior=0;
    double areabasesuperior=0;
    double areatrapecio=0;
    double areatroncopiramide=0;
    double volumentronco=0;
    
    
    System.out.println("Por favor ingrese los valores en centimetros");
    System.out.println("Ingrese el valor del lado del cuadrado superior");
    b=teclado.nextDouble();
    
    System.out.println("Ingrese el valor del lado del cuadrado inferior");
    B=teclado.nextDouble();
    
    System.out.println("Ingrese el valor de la altura del tronco");
    h=teclado.nextDouble();
    
    areatrapecio=((B+b)*h)/2;
    areabaseinferior=Math.pow(B,2);
    areabasesuperior=Math.pow(b,2);
    areatroncopiramide=(areatrapecio*4)+areabaseinferior+areabasesuperior;
    
    System.out.println("El área del tronco de piramide es: " + areatroncopiramide + " centimetros cuadrados");
    
    volumentronco=Math.round((h/3)*(areabaseinferior+areabasesuperior+(Math.sqrt(areabaseinferior*areabasesuperior))));
    
    System.out.println("El volumen del tronco es: " + volumentronco + " centimetros cubicos");
        
    }
}
