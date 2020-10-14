import java.util.Scanner;
public class Actividad7y8{
  public static void main (String [] args){
    Scanner teclado= new Scanner(System.in);
    System.out.println("Introduce la primera nota");
    double n1;
    n1=teclado.nextInt();
    System.out.println("Introduce la segunda nota");
    double n2;
    n2=teclado.nextInt();
    System.out.println("Introduce la la tercera nota");
    double n3;
    n3=teclado.nextInt();
    double m;
    m=(n1+n2+n3)/3;
    System.out.println("La nota media sería: "+m);
    if (m < 5) {
      System.out.print("Insuficiente");
    }
    
    if ((m >= 5) && (m < 6)) {
      System.out.print("Suficiente");
    }
    
    if ((m >= 6) && (m < 7)) {
      System.out.print("Bien");
    }
    
    if ((m >= 7) && (m< 9)) {
      System.out.print("Notable");
    }
    
    if (m >= 9) {
      System.out.print("Sobresaliente");
    }
  }
}
