import java.util.Scanner;
public class ejercicio9scaner{
  public static void main (String [] args){
    System.out.println("Introduce el radio y la altura de un cono y te calculamos su volumen; ");
    Scanner A = new Scanner(System.in);
    int r;
    int h;
    double v;
    System.out.println("Introduce el radio");
    r=A.nextInt();
    System.out.println("Introduce su altura");
    h=A.nextInt();
    v=(3.14*(r*r)*h)/3;
    System.out.println("EL volumen del cono sería: "+v);
    
    }
  }

