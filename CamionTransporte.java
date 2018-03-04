import java.util.Scanner;
import java.lang.Math;
/**
 * Write a description of class CamionTransporte here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CamionTransporte
{
    // Carga Bogotá Sasaima
    public static void main(String[] args)
    {
     Scanner teclado = new Scanner (System.in);
     double CapCamion;
     double GalonesKm, x;
     double CantCarga;
     double KmRecorrer;
     double NumViajes=0;
     double CantGasolina=0;
     
     System.out.println("Carga de Bogotá a Sasaima");
     System.out.println("Ingrese la capacidad de carga en Kg del camion");
     CapCamion=teclado.nextDouble();
     System.out.println("Ingrese cantidad de carga en Kg a transportar");
     CantCarga=teclado.nextDouble();
     System.out.println("Ingrese cantidad de Km que hay de Bogotá a Sasaima");
     KmRecorrer=teclado.nextDouble();
     System.out.println("Ingrese el número de galones que gasta el camion por Km");
     GalonesKm=teclado.nextDouble();
     
     if (CantCarga<=CapCamion)
     {
         NumViajes = 1;
         CantGasolina = (KmRecorrer*GalonesKm)*2;
         System.out.println("El camion debe realizar: " + NumViajes + " viaje redondo");
         System.out.println("El camion gasta: " + CantGasolina + " galones de gasolina en el viaje redondo");
         }
         if (CantCarga>CapCamion)
         {
            NumViajes =  Math.ceil(CantCarga/CapCamion);
            x = KmRecorrer*GalonesKm;
            CantGasolina = (NumViajes * x)*2;
            System.out.println("El camion debe realizar: " + NumViajes + " viajes redondos");
            System.out.println("El camion gasta: " + CantGasolina + " galones de gasolina en los " + NumViajes +" viajes redondos");
         }
         
         
}
}
