import java.util.Scanner;
public class ejercicio4scaner{
  public static void main (String[] args){
    Scanner x = new Scanner(System.in);
    int x1;
    int x2;
    System.out.println("Introduce el primer valor");
    x1=x.nextInt();
    System.out.println("Introduce el segundo valor");
    x2=x.nextInt();
    int suma;
    int resta;
    int multiplicacion;
    double division;
    suma=x1+x2;
    resta=x1-x2;
    multiplicacion=x1*x2;
    division=x1/x2;
    System.out.println("EL resultado de la suma de los dos valores es: "+suma);
    System.out.println("El resultado de la resta de los dos valores es: "+resta);
    System.out.println("El resultado de la multiplicacion de los dos valores es: "+multiplicacion);
    System.out.println("El resultado de la division de los dos valores es: "+division);
    
    }
  }
