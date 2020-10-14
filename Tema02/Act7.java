import java.util.Scanner;
public class ejercicio7scaner{
  public static void main (String [] args){
    System.out.println("Introduce los precios de los productos: ");
    Scanner A = new Scanner(System.in);
    int prod1;
    int prod2;
    int prod3;
    int facturaSinIva;
    int facturaConIva;
    System.out.println("Producto 1:");
    prod1=A.nextInt();
    System.out.println("Producto 2:");
    prod2=A.nextInt();
    System.out.println("Producto 3:");
    prod3=A.nextInt();
    facturaSinIva=prod1+prod2+prod3;
    facturaConIva=((prod1+prod2+prod3)*21)/100;
    System.out.println("Precio total sin IVA: "+facturaSinIva);
    System.out.println("Precio total con IVA: "+facturaConIva);
    
    
    
    }
  }
