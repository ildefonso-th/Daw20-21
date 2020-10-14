import java.util.Scanner;
public class Actividad3{
  public static void main (String [] args){
    Scanner x = new Scanner (System.in);
    System.out.println("¿Qué número de día de la semana es?");
    
    int NdiaSemana;
    NdiaSemana = x.nextInt();
    String diaSemana;
    
    switch (NdiaSemana) {
      case 1:
      diaSemana = "Lunes";
      break;
      
      case 2:
      diaSemana = "Martes";
      break;
      
      case 3:
      diaSemana = "Miércoles";
      break;
      
      case 4:
      diaSemana = "Jueves";
      break;
      
      case 5:
      diaSemana = "Viernes";
      break;
      
      case 6:
      diaSemana = "Sabado";
      break;
      
      case 7:
      diaSemana = "Domingo";
      break;
      
      default:
      diaSemana="";
      }
      
      System.out.println(diaSemana);
      
    }
  }

