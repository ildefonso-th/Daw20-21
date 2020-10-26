import java.util.Scanner;
public class Act9{
  public static void main (String[]args){
    Scanner s = new Scanner (System.in);
    int x = s.nextInt();
    int contador=0;
    do{
      x=x/10;
      contador++;
      }while(x>=1);
      System.out.println(contador);
    }
  }

