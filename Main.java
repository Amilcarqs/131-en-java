package javaapplication1;
import java.util.Scanner;
import java.util.Vector;
public class Main {
    static int N = 10;
    static int n, m;
    static int A[][] = new int[N][N];
    static int conf[][] = new int[N][N];
    static String camino = "";
    static int dx[] = {1, 0, 0,-1};
    static int dy[] = {0, -1,1, 0};
    static String path = "DLRU";
    static int contador = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++)
                A[i][j] = in.nextInt();
        }
        findPath(0, 0);
    }
    public static void findPath(int i, int j) {
        // yo garantizo que aqui esta un camin valido
        if (i == n - 1 && j == m - 1) {
            contador++;
            System.out.println("path number: " + contador);
            conf[i][j] = 1;
            for(int ii = -1; ii <= n; ii++) {
                for(int jj = -1; jj <= m; jj++) {
                    if (ii == -1 || jj == -1 || ii == n || jj == m)
                        System.out.print("*");
                    else if (conf[ii][jj] == 1)
                        System.out.print(".");
                    else
                        System.out.print("#");
                }
                System.out.println();
            }
            return;
        }  
        for(int k = 0; k < 4; k++) {
            int ni = i + dx[k];
            int nj = j + dy[k];
            if (check(ni, nj)) {
                conf[i][j] = 1;
                findPath(ni, nj);
                conf[i][j] = 0;
            }
        }
    }
    
    public static boolean check(int i, int j) {
        return i >= 0 && j >= 0 && j < m && i < n && A[i][j] == 0 && conf[i][j] == 0;
    }
    
}