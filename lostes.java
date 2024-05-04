//ejercicio  lotes especial
//resuelto
import java.util.Scanner;
public class lostes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();
        boolean sw = true;
        int primos = 0;
        int suma = 0;
        
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = in.nextInt();
        }
        
        for (int i = 0; i < n-1; i++) {
            if(sw){
                if(primos<=x && esPrimo(v[i])){
                    primos++;
                }
                if(v[i]>v[i+1]){
                    sw = false;
                }
                suma = suma + v[i];                
            }
        }
        
        if(sw){
            suma = suma+v[n-1];
            if(esPrimo(v[n-1])){
                primos++;
            }
            if((suma & 1)==0 || (primos<x))
                sw = false;
        }
        if(sw){
            System.out.println("SI");
        }else{
            System.out.println("NO");
        }
    }
    static boolean esPrimo(int x){
        int c = 0;
        for (int r = 1; r <= (int)(Math.sqrt(x)) && c<=2; r++) {
            if(x%r==0){
                c++;
            }
        }
        return c<2;
    }
}
