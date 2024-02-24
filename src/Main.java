import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Graph graph = new Graph("src/graph.txt");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введіть початкову вершину:");
            int startVertex = scanner.nextInt() - 1;
            graph.DFS(startVertex);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не знайдено");
        }
    }
}