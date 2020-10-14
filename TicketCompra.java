import java.util.Scanner;
public class TicketCompra{
  public static void main(String[]args){
    Scanner s = new Scanner (System.in);
    Scanner tec = new Scanner (System.in);
    String art1;
    String art2;
    String art3;
    double pr1;
    double pr2;
    double pr3;
    int cant1;
    int cant2;
    int cant3;
    System.out.println("Introduce el primer artículo introduciendo los datos de la siguiente forma: Nombre, Precio, y cantidad (Enter por cada dato)");
    art1=tec.nextLine();
    pr1=s.nextDouble();
    cant1=s.nextInt();
    System.out.println("Introduce el segundo artículo introduciendo los datos de la siguiente forma: Nombre, Precio, y cantidad (Enter por cada dato)");
    art2=tec.nextLine();
    pr2=s.nextDouble();
    cant2=s.nextInt();
    System.out.println("Introduce el tercer artículo introduciendo los datos de la siguiente forma: Nombre, Precio, y cantidad (Enter por cada dato)");
    art3=tec.nextLine();
    pr3=s.nextDouble();
    cant3=s.nextInt();
    System.out.println();
    System.out.printf("%-16s %-16s %-18s %-8s \n","Artículo","Cantidad", "Precio Unidad", "Subtotal");
    System.out.println("--------------------------------------------------------------");
    System.out.printf("%-16s %-16s %-18s %-8s \n",art1,cant1,pr1,pr1*cant1);
    System.out.printf("%-16s %-16s %-18s %-8s \n",art2,cant2,pr2,pr2*cant2);
    System.out.printf("%-16s %-16s %-18s %-8s \n",art3,cant3,pr3,pr3*cant3);
    System.out.println("--------------------------------------------------------------");
    System.out.printf("%56s","Total");
    System.out.printf("%78s",pr1*cant1+pr2*cant2+pr3*cant3);
  }
}
