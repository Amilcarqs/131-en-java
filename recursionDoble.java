//ejercicio RECURSION DOBLE
//SOLUCIONADO
import java.util.Scanner;
public class recursionDoble {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner inl = new Scanner(System.in);
        int n = in.nextInt();
        long x;
        for (int i = 0; i < n; i++) {
            String aux = in.next();
            x = Long.parseLong(aux);
            System.out.println(solucion(x));
        }
    }
    static long solucion(long x){
        if(x<10)
            return x;
        else{
            long s = 0;
            while(x>0){
                s = s+(x%10);
                x=x/10;
            }
            return 1+solucion(s);
        }
    }    
}
