package javaapplication1;
import java.util.Scanner;

public class backtrackingConMactrices {
    static int N = 10;
    static int n, m;
    static char A[][] = new char[N][N];
    static String camino = "";
    static int dx[] = {1, 0};
    static int dy[] = {0, 1};
    static String path = "AD";
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        for(int i = 0; i < n; i++){
            String cad = in.next();
            for(int j = 0; j < m; j++)
                A[i][j] = cad.charAt(j);
        }
        int ans = findPath(0, 0);
        System.out.println("hay camino: " + ans);
        System.out.println("camino: " + camino);
    }
    
    public static int findPath(int i, int j) {
        // yo garantizo que aqui esta un camin valido
        if (i == n - 1 && j == m - 1) {
            System.out.println("camino valido: " + camino);
            return 1;
        }  
        int ans = 0;
        for(int k = 0; k < 2; k++) {
            int ni = i + dx[k];
            int nj = j + dy[k];
            if (check(ni, nj)) {
                camino += path.charAt(k);
                ans += findPath(ni, nj);
                camino = camino.substring(0, camino.length() - 1);
            }
        }
        return ans;
    }
    
    public static boolean check(int i, int j) {
        return j < m && i < n && A[i][j] == '.';
    }
    
}
