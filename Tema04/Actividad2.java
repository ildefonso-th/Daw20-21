import java.util.Scanner;
public class Actividad2{
  public static void main (String [] args){
    Scanner x = new Scanner (System.in);
    System.out.println("¿Qué hora es?");
    
    int hora;
    hora = x.nextInt();
    
    if((hora>6)&&(hora<12)){
      System.out.println("Buenos días <3");
      }
      if((hora>13)&&(hora<20)){
      System.out.println("Buenas tardes");
    }
      if((hora>21)&&(hora<5)){
      System.out.println("Buenas noches Migue");
    }
  }
}
