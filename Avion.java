import java.util.Scanner;
import java.lang.Math;
/**
 * Write a description of class Avion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Avion
{
    // Valor total recolectado por la empresa àerea, gracias a la venta de tiquetes.
        public static void main(String[] args)
    {
        Scanner teclado = new Scanner (System.in);
        int clase;
        int numeropasajeros=0;
        long totalventa=0;
             
        System.out.println("Ingrese el número de la clase en que viajaran los pasajeros: Clase económica = 1, Clase ejecutiva = 2, Primera Clase = 3");
        clase=teclado.nextInt();
        
        if ((clase==0) || (clase >3))
        {
            System.out.println("Solamente tenemos tres categorias de vuelo: Clase económica = 1, Clase ejecutiva = 2, Primera Clase = 3");
            System.out.println("Ingrese el número de la clase en que viajaran los pasajeros");
            clase=teclado.nextInt();
        }
            if ((clase>=1) && (clase <=3)){
                 System.out.println("Ingrese el número de pasajeros que viajaran en esa clase");
                 numeropasajeros=teclado.nextInt();
               }
                if (numeropasajeros<615)
                {
                    if (clase==1) {
                    totalventa=numeropasajeros*500000;
                }
                       if (clase==2){
                       totalventa=numeropasajeros*200000;
                    }
                        if (clase==3){
                            totalventa=numeropasajeros*125000;
                        }
                        System.out.println("El valor recolectado por la venta de tiquetes es: " + totalventa);
                    }
                    else
                    {
                        System.out.println("El número de pasajeros excede la capacidad del avión");
                        System.out.println("Capacidad maxima: 615 pasajeros");
                    }
       }
}  
