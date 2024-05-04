//Ejercicio 2518 PALINDROMOS PARA LLEVAR

import java.util.Scanner;
import java.util.Vector;
public class palindromos {
    static String str = "";
    static Vector<String> path = new Vector<String>();
    static int contador = 0;
    
    public static boolean isPal(String s){
        String inverso = "";
        for (int i = s.length()-1;i >=0; i--) {
            inverso += s.charAt(i);
        }
        return inverso.equals(s);
    }
    public static void f(int pos, boolean flag){
        if(pos>str.length()) return;
        if(pos == str.length()){
            contador++;
            if(flag){
                System.out.println(path);
            }
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            if(pos+i < str.length()){
                String aux = str.substring(pos, pos+i+1);
                if(isPal(aux)){
                    path.add(aux);
                    f(i+pos+1,flag);
                    path.remove(path.size()-1);
                }
            }  
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        str = in.next();
        f(0,false);
        System.out.println(contador);
        f(0,true);          
    }
}
