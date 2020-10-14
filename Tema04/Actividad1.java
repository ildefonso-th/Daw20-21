import java.util.Scanner;
public class Actividad1{
  public static void main (String [] args){
    Scanner x = new Scanner (System.in);
    System.out.println("Introduce el día de la semana, y te diremos que asignatura tienes a primera hora");
    
    String diaSemana;
    diaSemana = x.nextLine();
    String asignatura;
    
    switch (diaSemana) {
      case "lunes":
      asignatura = "Entornos de desarrollo";
      break;
      case "martes":
      asignatura = "Programación";
      break;
      case "miercoles":
      asignatura = "Programación";
      break;
      case "jueves":
      asignatura = "Programación";
      break;
      case "viernes":
      asignatura = "FOL";
      break;
      default:
      asignatura="";
      }
      
      System.out.println("El "+diaSemana+" a primera hora hay: " +asignatura);
      
    }
  }
