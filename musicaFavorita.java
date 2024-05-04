
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;


public class musicaFavorita {
    
    static boolean estado[] = new boolean[10]; 
    static int v[] = new int [10];
    static int n;
    static Vector<Integer> vec = new Vector<Integer>();
    static Vector<Integer> salida = new Vector<Integer>();
    static int mayor=0;
    static int x ;
    static void subset(int i){
        if(i==n){
            vec.removeAllElements();
            int suma = 0;
            //System.out.print("{");
            for (int j = 0; j < n; j++) {
                if (estado[j]) {
                    suma = suma +v[j];
                    vec.add(v[j]);
                    if(suma<=x && suma>mayor){
                        mayor = suma;
                        salida.removeAllElements();
                        salida.addAll(vec);                       
                    }
                    if(suma>x)
                        break;
                    //System.out.print(v[j]+",");
                }
            }
            //System.out.println("}");
            return;
        }
        subset(i+1);
        estado[i]=true;
        subset(i+1);
        estado[i] = false;
        
    }
    
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        n = in.nextInt();
        for (int i = 0; i < n; i++) {
            v[i] = in.nextInt();
        }
        subset(0);
        System.out.println(salida);
        
    }
    
    
}
