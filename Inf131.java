/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inf131;

/**
 *
 * @author Amilcar
 */
import java.util.Scanner;
public class Inf131 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //eliminar los elementos dupicados de un vector
        Scanner leer = new Scanner(System.in);
        int n = leer.nextInt();
        int vector[] =new int[n];
        for (int i = 0; i < n; i++) {
            vector[i] = leer.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(vector[i]);
        }
        vector = eliminaDuplicados(vector, n);     
        System.out.println("");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]);
        }
        System.out.println();
    }

    private static int[] eliminaDuplicados(int[] v, int n) {
        for(int i=0;i<n;i++){
            int dato=v[i];
            for (int j=i+1;j<n;j++){
                if(dato == v[j]){
                    for (int k = j; k < n-1; k++) {
                        v[k] = v[k+1];
                    }
                    int aux[] = new int[n-1];
                    for (int k = 0; k < n-1; k++) {
                        aux[k]=v[k];
                    }
                    n--;
                    v = aux;
                }
            }
        }
        return v;
    }
    
    private static int[] elimina(int[] v, int n){
        boolean vaux[] = new boolean[n];
        int c = n;
        for (int i = 0; i < n; i++) {
            int dato=v[i];
            for (int j = 1; j < n; j++) {
                if (dato == v[j]) {
                    vaux[j]=false;
                    n--;
                }
            }        
        }
        int aux2[] = v;
        int cont=0;
        for (int i = 0; i < n; i++) {
            if (vaux[i]==true) {
                v[cont]=aux2[i];
                cont++;
            }
        }
        return v;
    }
}
