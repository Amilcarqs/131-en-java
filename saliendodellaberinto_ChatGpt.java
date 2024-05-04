import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Laberinto {

    public static void findPaths(int[][] matrix, int i, int j, String path, List<String> paths) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        // Si estamos fuera de los límites del laberinto o encontramos una pared, regresamos
        if (i < 0 || i >= rows || j < 0 || j >= cols || matrix[i][j] == 1) {
            return;
        }
        
        // Si llegamos a la casa de Ruben, añadimos el camino encontrado a la lista de caminos
        if (i == rows - 1 && j == cols - 1) {
            paths.add(path);
            return;
        }
        
        // Movimientos válidos: abajo (A) y derecha (D)
        findPaths(matrix, i + 1, j, path + "A", paths);
        findPaths(matrix, i, j + 1, path + "D", paths);
    }

    public static List<String> getAllPaths(int[][] matrix) {
        List<String> paths = new ArrayList<>();
        findPaths(matrix, 0, 0, "", paths);
        return paths;
    }

    public static List<String> sortPathsLexicographically(List<String> paths) {
        Collections.sort(paths);
        return paths;
    }

    public static void main(String[] args) {
        int[][] laberinto = {
            {0, 0, 1, 0},
            {0, 1, 0, 0},
            {0, 0, 0, 0},
            {0, 1, 1, 0}
        };

        List<String> todosLosCaminos = getAllPaths(laberinto);

        if (todosLosCaminos.isEmpty()) {
            System.out.println("NO HAY CAMINOS POSIBLES");
        } else {
            List<String> caminosOrdenados = sortPathsLexicographically(todosLosCaminos);

            for (String camino : caminosOrdenados) {
                System.out.println(camino);
            }
        }
    }
}