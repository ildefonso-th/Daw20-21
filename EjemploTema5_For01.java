  
import java.util.*;

public class Main {
    public static void main(String[] args){
        System.out.println("Este programa te pedirá un número y una frase y te la repetirá las veces que la hayas pedido: ");
        Scanner s = new Scanner (System.in);
        Scanner tec = new Scanner (System.in);
        System.out.print("Introduce el número: ");
        int a= s.nextInt();
        System.out.print("Introduce la frase: ");
        String b= tec.nextLine();
        for(int i=1; i<=a; i++){
            System.out.println(b);
        }
    }
}
