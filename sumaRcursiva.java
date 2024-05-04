//Ejercicio 2146 SUMA RECURSIVA resuelto
import java.util.Scanner;
public class sumaRcursiva {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n,n1,n2;
        n = in.nextInt();
        for(int i=0; i<n; i++) {
            n1 = in.nextInt();
            n2 = in.nextInt();
            n1= suma(n1);
            if(n2 > 9){
                n2=(n2%6);
                if(n2<=1){
                    n2 += 6;
                }
            }
            long aux = (int) Math.pow(n1, n2);
            System.out.println(suma(aux));
        }
    }
    public static long suma(long n) {
        long s;
        if(n<=9){
            return n;
        }
        else{
            s = 0;
        }
        while(n>0) {
            s = s+(n%10);
            n=n/10;
        }
        return suma(s);
        }
}

