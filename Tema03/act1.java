import java.util.Scanner;
public class act1{
  public static void main (String[]args){
    Scanner s = new Scanner(System.in);
    System.out.println("Este programa se encarga de operar las multiplicaciones de números que introduzcas:");
    System.out.print("Introduce A:");
    int a = s.nextInt();
    System.out.print("Introduce B:");
    int b = s.nextInt();
    int r=a*b;
    System.out.println(r+" Es el resultado de "+a+"*"+b);
    }
  }
 
