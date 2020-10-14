import java.util.Scanner;
public class act5{
  public static void main(String[]args){
    Scanner s = new Scanner (System.in);
    System.out.println("Este programa calcula el area de un triangulo a partir de la base y la altura.");
    System.out.print("Introduce la base:");
    double base=s.nextInt();
    System.out.println("Introduce la altura");
    double altura=s.nextInt();
    double area=(base*altura)/2;
    System.out.print("El área del triangulo es "+area+" u²");
  }
}


