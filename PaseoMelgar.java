import java.util.Scanner;
import java.lang.Math;
/**
 * Write a description of class PaseoMelgar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PaseoMelgar
{
    // Paseo a Melgar
    public static void main(String[] args)
    {
    Scanner teclado = new Scanner (System.in);
    int EstFlaco, EstGordo, SillasGordo, NumEstu;
    double CantHab, ValorHabit, TotalHabit, Nbuses, ValorBus, AlquiBus;  
    int SillasBus; //cantidad de sillas que posee el bus
    int CantSillas; // cantidad de sillas necesarias para todos los estudiantes
    int ValorComida, TotalComida, ComidaGordo, ComidaFlaco;
    int NumPersona; //variable que guarda el número de personas que caben en una habitación
    int NumDias; //número de dias que dura el paseo
    
    System.out.println("Ingrese el número de estudiantes gordos que van a viajar");
        EstGordo=teclado.nextInt();
    System.out.println("Ingrese el número de estudiantes flacos que van a viajar");
        EstFlaco=teclado.nextInt();
    System.out.println("Ingrese la cantidad de sillas que tiene el bus");
        SillasBus=teclado.nextInt();
    System.out.println("Ingrese el valor del alquiler del bus de ida y vuelta");
        AlquiBus=teclado.nextInt();
    System.out.println("Ingrese el valor de un plato de comida");
        ValorComida=teclado.nextInt(); 
    System.out.println("Ingrese el valor de la habitacion");
        ValorHabit=teclado.nextInt(); 
    System.out.println("Ingrese el número de personas que caben en una habitacion");
        NumPersona=teclado.nextInt();
    System.out.println("Ingrese el número de dias que dura el paseo a Melgar");
        NumDias=teclado.nextInt();
        
    SillasGordo = EstGordo * 2;
    CantSillas = SillasGordo + EstFlaco;
    NumEstu =  EstGordo + EstFlaco;
    ComidaGordo = (EstGordo * ValorComida)*5;
    ComidaFlaco = (EstFlaco * ValorComida)*3;
    TotalComida = (ComidaGordo + ComidaFlaco)*NumDias;
      
    
    if (CantSillas <= SillasBus)
    {
       System.out.println("Para el paseo se necesita un bus");
       System.out.println("El valor del alquiler del bus es: " + AlquiBus);
       System.out.println("El valor a pagar por la comida para todos los estudiantes es: " + TotalComida); 
    }
       if (CantSillas> SillasBus)
          {
              Nbuses = Math.ceil(CantSillas/SillasBus);
              ValorBus = AlquiBus * Nbuses;
              System.out.println("Para el paseo se necesita: " +Nbuses+ " buses");
              System.out.println("El valor a pagar por el alquiler de los buses es: " + ValorBus);
            }
       if (NumEstu <= NumPersona)
        {
          System.out.println("Se debe reservar una habitación para los estudiantes");  
          System.out.println("El valor diario que se debe pagar por la habitación es: " + ValorHabit);
          System.out.println("El valor total de la habitación por la duración del paseo es : " + ValorHabit * NumDias);
        }
       else { 
              if (NumEstu > NumPersona)
              {
                  CantHab = Math.ceil(NumEstu/NumPersona);
                  ValorHabit = ValorHabit * CantHab;
                  TotalHabit=ValorHabit*NumDias;
                  System.out.println("Se debe reservar " + CantHab + " habitaciones para los estudiantes");
                  System.out.println("El valor diario que se debe pagar por las habitaciones es: " + ValorHabit);
                  System.out.println("El valor total de las habitaciones por la duración del paseo es : " + TotalHabit );
                }
           }    
    }
}
