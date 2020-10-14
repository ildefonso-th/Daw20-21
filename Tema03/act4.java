import java.util.Scanner;
public class act4{
  public static void main(String[]args){
    Scanner s = new Scanner (System.in);
    System.out.println("Introduce dos numeros por teclado y te haremos la suma, resta, multipliación y división:");
    System.out.print("Introduce A:");
    double a=s.nextInt();
    System.out.print("Introduce B:");
    double b=s.nextInt();
    double suma=a+b;
    double resta=a-b;
    double multi=a*b;
    double divi=a/b;
    System.out.println("La suma de "+a+"+"+b+" es ="+suma);
    System.out.println("La resta de "+a+"-"+b+" es ="+resta);
    System.out.println("La multiplicación de "+a+"*"+b+" es ="+multi);
    System.out.println("La división de "+(double)a+"/"+(double)b+" es ="+divi);
  }
}

