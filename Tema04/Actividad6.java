import java.util.Scanner;
public class Actividad6{
  public static void main (String [] args){
    Scanner teclado= new Scanner(System.in);
    System.out.println("Introduce la masa del objeto");
    double masaObjeto;
    masaObjeto=teclado.nextInt();
    double altura;
    double t;
    double pesoObjeto;
    pesoObjeto=masaObjeto*8.81;
    System.out.println("Introduce la altura desde la que se va a dejar caer el objeto");
    altura=teclado.nextInt();
    t=((2*altura)/pesoObjeto);
    System.out.println("El objeto caería en: "+t+" segundos.");
}
}
