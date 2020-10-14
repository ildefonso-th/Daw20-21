import java.util.Scanner;
public class ejercicio2scaner{
  public static void main(String[] args){
    System.out.println("Introduce el número de pesetas y te la convertiremos a euros");
    Scanner pesetas = new Scanner(System.in);
    int pta;
    double euros;
    pta = pesetas.nextInt();
    euros = pta/166.387;
    System.out.println(""+euros);
  }
}
