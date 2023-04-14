package Baraja;


/**
 * clase para modelar una carta.
 *
 * @author (ACR)
 * @version (1)
 */
public class Carta
{ 
 private String color;
 private String familia;
 private int valor;
 //constructor
 public Carta()
 {
 color="Negro";
 familia="Pala";
 valor=0;
 }
 //constructor parametrizado
 /**
  * establece la carta, ingresa segun lo disponible(porfavor):
  * Color: "negro" o "rojo"
  * familia: si rojo: "gema" o "corazon" ; si negro: "pala" o "trebol"
  * valor: del "1 al 13"
  */
 public Carta(String color,String familia,int valor)
 {
 this.color=color;
 this.familia=familia;
 this.valor=valor;
 }
 
 //setters; para cambiar el atributo
 public void setColor(String color)
 {
  this.color=color;
 }
 public void setFamilia(String familia)
 {
  this.familia=familia;
 }
 public void setValor(int valor)
 {
  this.valor=valor;
 }
 //getters; para obtener el atributo
 public String getColor()
 {
 return color;    
 }
 public String getFamilia()
 {
 return familia;    
 }
 public int getValor()
 {
 return valor;
 }
 public String toString()
 {
 return color+"/"+familia+"/"+valor;    
 }
}
