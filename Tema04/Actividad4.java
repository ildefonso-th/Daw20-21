import java.util.Scanner;
public class Actividad4{
  public static void main (String [] args){
    System.out.println("Por favor, introduzca el número de horas trabajadas durante la semana: ");
    Scanner x = new Scanner(System.in);
    int horasSemana; int sueldoSemanal;
    horasSemana= x.nextInt();
   
    if(horasSemana<40){
      sueldoSemanal=horasSemana*12;
    }else{
      sueldoSemanal=40*12+(horasSemana-40)*16;
      }
    System.out.println("Tu sueldo semanal sería de "+sueldoSemanal+"€");
  }
}
