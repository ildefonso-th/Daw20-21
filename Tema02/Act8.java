import java.util.Scanner; 
public class ejercicio8scaner{
  public static void main (String[] args){
  Scanner x = new Scanner(System.in);
  int horasSem;
  int salarioSem;
 
  System.out.println("Segun tus horas semanales, a 12 euros la hora, podemos calcular cuanto consigues a la semana");
  System.out.println("Introduce el número de horas a la semana: ");
  horasSem=x.nextInt();
  salarioSem = (12*horasSem);
  System.out.println("A la semana cobrarías: "+salarioSem+ "€");
  
  }
  }

