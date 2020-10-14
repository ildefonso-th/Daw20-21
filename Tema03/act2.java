import java.util.Scanner;
public class act2{
  public static void main (String[]args){
    Scanner s = new Scanner(System.in);
    System.out.println("Este es un conversor de euros a pesetas");
    System.out.println("Introduce la cantidad de euros que quieres pasar a pesetas:");
    double eur= s.nextDouble();
    double pta;
    pta=eur*166.3860;
    System.out.print(eur+" euros son "+pta+" pesetas.");
    }
  }
 

