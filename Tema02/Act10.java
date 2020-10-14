import java.util.Scanner;
public class ejercicio10scaner{
  public static void main (String [] args){
    int mbs;
    int kbs;
    Scanner bits = new Scanner(System.in);
    System.out.println("Introduce por teclado el número de Mbs que quieres convertir a Kbs.");
    mbs=bits.nextInt();
    kbs=mbs*1024;
    System.out.println(+mbs+" Mb, son "+kbs+" Kb.");
    
    
    
    }
}
