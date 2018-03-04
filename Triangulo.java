import java.util.Scanner;
import java.lang.Math;
/**
 * Write a description of class Triangulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Triangulo
{
    // Semiperímetro, área y circumradius del triángulo
    public static void main(String[] args)
    {
     Scanner teclado = new Scanner (System.in); 
     double a, b, c;
     double s =0; //semiperimetro
     double area = 0;
     double R = 0; //circumradius
     
    System.out.println("Los valores ingresados deben ser en centimetros");
    System.out.println("Ingrese el valor del lado a del triángulo");
    a=teclado.nextDouble();
    
    System.out.println("Ingrese el valor del lado b del triángulo");
    b=teclado.nextDouble();
    
    System.out.println("Ingrese el valor del lado c del triángulo");
    c=teclado.nextDouble();
    
    s = Math.round ((a+b+c)/2); //formula para hallar el semiperímetro
    area = Math.round (Math.sqrt(s*(s-a)*(s-b)*(s-c))); //formula para hallar el área
    R = Math.round ((a*b*c)/(4*Math.PI*area)); //formula para hallar el circumradius
    
    System.out.println("El semiperímetro del triangulo es: " + s + " centimetros");
    System.out.println("El área del triangulo es: " + area + " centimetros cuadrados"); 
    System.out.println("El circumradius del triangulo es: " + R + " centimetros");  
    }
}
