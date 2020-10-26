import java.util.Scanner;
public class Act11{
  public static void main (String[]args){
    Scanner s = new Scanner (System.in);
    int x = s.nextInt();
    for(int i = 0; i<=5; i++){
      System.out.println(x+"² = "+x*x+" | "+x+"³ = "+x*x*x);
      x+=1;
      }
    }
  }

