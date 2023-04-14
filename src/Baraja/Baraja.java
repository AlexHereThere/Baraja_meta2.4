/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baraja;
import java.util.Random;
import java.util.HashSet;

/**
 * clase para modelar la baraja
 * @author ACR
 */
public class Baraja {
    HashSet<Carta> cartas;
    
    //constructor
    public Baraja()
    {
    cartas =new HashSet<>();    
    llenarOriginal();
    }
    /*
    llenar la baraja con las originales 52 cartas
    */
    private void llenarOriginal()
    {
    String colores[]={"ROJO","NEGRO"};
    String familias[]={"GEMA","CORAZON","PALA","TREBOL"};
    for(String color:colores)
     for(String familia:familias)
     {
     if("ROJO".equals(color) && "PALA".equals(familia))continue;
     if("ROJO".equals(color) && "TREBOL".equals(familia))continue;
     if("NEGRO".equals(color) && "GEMA".equals(familia))continue; //para las combinaciones que no se pueden
     if("NEGRO".equals(color) && "CORAZON".equals(familia))continue;
      for(int i=1;i<=13;i++)
      {
       cartas.add(new Carta(color,familia,i));
      }
     }
    }
    /*
       mostrar todas las cartas de la baraja
    */
    public void mostrarCartas()
    {
        for(Carta carta:cartas)
        System.out.println(carta);    
    }
    public Carta sacarCarta()
    {
    Random rmd=new Random();
    Object[] mis_cartas=cartas.toArray();
    Object Carta_a_eliminar=mis_cartas[rmd.nextInt(cartas.size())];
    cartas.remove((Carta) Carta_a_eliminar);
    return (Carta) Carta_a_eliminar;
    }
    
    public static void main(String[] a)
    {
     Baraja baraja=new Baraja();
     baraja.mostrarCartas();
        System.out.println("");
     Carta carta_sacada=baraja.sacarCarta();
        System.out.println("CARTA SACADA: "+carta_sacada);
     baraja.mostrarCartas();
    }
}
