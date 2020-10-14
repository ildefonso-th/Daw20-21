import java.util.Scanner;
public class ejercicio5scaner{
  public static void main (String [] args){
    System.out.println("Introduce la base y la altura del rectángulo y te calcularemos el área");
    Scanner A = new Scanner(System.in);
    int x;
    int y;
    int area;
    System.out.println("Base: ");
    x=A.nextInt();
    System.out.println("Altura: ");
    y=A.nextInt();
    area=x*y;
    System.out.println("El área del rectángulo sería: "+area);
    
    
    
    }
  }
