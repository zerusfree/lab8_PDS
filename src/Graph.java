import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Graph {
    private int[][] adjacencyMatrix;
    private int vertices;

    public Graph(String filename) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(filename));
        vertices = scanner.nextInt();
        adjacencyMatrix = new int[vertices][vertices];
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                adjacencyMatrix[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
    }

    public  List<Integer> DFS(int startVertex) {
        boolean[] visited = new boolean[vertices];
        Stack<Integer> stack = new Stack<>();
        List<Integer> dfsOrder = new ArrayList<>();
        stack.push(startVertex);
        while (!stack.isEmpty()) {
            int currentVertex = stack.pop();
            if (!visited[currentVertex]) {
                dfsOrder.add(currentVertex);
                System.out.print("Вершина: " + (currentVertex + 1) + ", DFS-номер: " + (currentVertex + 1));
                System.out.println(", Стек: " + stack);
                visited[currentVertex] = true;
                for (int i = 0; i < vertices; i++) {
                    if (adjacencyMatrix[currentVertex][i] == 1 && !visited[i]) {
                        stack.push(i);
                    }
                }
            }
        }
        return dfsOrder;
    }
}
