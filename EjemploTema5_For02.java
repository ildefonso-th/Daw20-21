  
import java.util.*;

public class Main {
    public static void main(String[] args){
        System.out.println("Este programa te pedirá un número y la cantidad de filas y realizará la tabla de multiplicación:");
        Scanner s = new Scanner (System.in);
        System.out.print("Introduce el número: ");
        int a= s.nextInt();
        System.out.print("Introduce el número de filas: ");
        int b= s.nextInt();
        for(int i=1; i<=b;i++){
            System.out.println(a+" x "+i+" = "+a*i);
        }
    }
}
