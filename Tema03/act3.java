import java.util.Scanner;
public class act3{
  public static void main (String[]args){
    Scanner s = new Scanner(System.in);
    System.out.println("Este es un conversor de pesetas a euros");
    System.out.println("Introduce la cantidad de pesetas que quieres pasar a euros:");
    double pta= s.nextDouble();
    double eur;
    eur=pta*0.006;
    System.out.print(pta+" pesetas son "+eur+" euros.");
    }
  }
