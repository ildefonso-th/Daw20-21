import java.util.*;

public class Main {
    public static void main(String[] args){
        System.out.println("Este programa te pedirá un número y la cantidad de filas y realizará la tabla de potencias:");
        Scanner s = new Scanner (System.in);
        System.out.print("Introduce el número: ");
        int a= s.nextInt();
        System.out.print("Introduce el número de filas: ");
        int b= s.nextInt();
        for(int i=1; i<=b;i++){
            int p=1;
            for(int j=1; j<=i; j++){
                p=p*a;
            }
            System.out.println(p);
        }
    }
}
