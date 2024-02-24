import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GraphTest {
    @Test
    void testDFS() {
        try {
            Graph graph = new Graph("src/graph.txt");
            int startVertex = 1;
            List<Integer> expectedDFSOrder = Arrays.asList(1, 2, 3, 4, 0);
            assertEquals(expectedDFSOrder, graph.DFS(startVertex), "Порядок DFS не співпадає");
        } catch (FileNotFoundException e) {
            fail("Файл не знайдено");
        }
    }
}
