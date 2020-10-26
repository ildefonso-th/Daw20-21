import java.util.Scanner;
public class Act10{
  public static void main (String[]args){
    Scanner s = new Scanner (System.in);
    int x = 0;
    int y=0;
    int contador=0;
    do{
      x = s.nextInt();
      if(x>0){
        y += x;
        contador++;
        }else{}
      }while(x>=0);
      System.out.println("La media es: "+y/contador);
    }
  }

