import java.util.Scanner; 
public class ejercicio1scaner{
  public static void main (String[] args){
  Scanner x = new Scanner(System.in);
  int x1;
  int x2;
  System.out.println("Introduce un número: ");
  x1=x.nextInt();
  System.out.println("Introduce un segundo número: ");
  x2=x.nextInt();
  int x3;
  x3 = (x1*x2);
  System.out.println("El resultado de la multiplicacion de los dos números es: "+x3);
  
  }
  }
