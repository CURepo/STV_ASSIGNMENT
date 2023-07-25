import org.example.Solution;
import org.junit.Test;
import static org.junit.Assert.*;


public class BipartiteGraphCoverageTest {

    @Test
    public void testEccForChoice1() {
        int[][] graph1 = {
                {1, 3},
                {0, 2},
                {1, 3},
                {0, 2}
        };
        assertTrue(Solution.isBipartite(graph1));
    }

    @Test
    public void testEccForChoice2() {
        int[][] graph2 = {
                {1, 2, 3},
                {0, 2},
                {0, 1},
                {0}
        };
        assertFalse(Solution.isBipartite(graph2));
    }

    @Test
    public void testEccForChoice3() {
        int[][] graph3 = {
                {1, 2},
                {0, 2},
                {0, 1},
                {4},
                {3}
        };
        assertFalse(Solution.isBipartite(graph3));
    }

    @Test
    public void testEccForChoice4() {
        int[][] graph4 = {{}};
        assertTrue(Solution.isBipartite(graph4));
    }

    @Test
    public void testBccForChoice1AndChoice3() {
        int[][] graph1 = {
                {1, 3},
                {0, 2},
                {1, 3},
                {0, 2}
        };
        assertTrue(Solution.isBipartite(graph1));
    }

    @Test
    public void testBccForChoice2AndChoice3() {
        int[][] graph2 = {
                {1, 2, 3},
                {0, 2},
                {0, 1},
                {0}
        };
        assertFalse(Solution.isBipartite(graph2));
    }

    @Test
    public void testBccForChoice1AndChoice4() {
        int[][] graph3 = {
                {1, 2},
                {0, 2, 3},
                {0, 1},
                {1}
        };
        assertFalse(Solution.isBipartite(graph3));
    }

    @Test
    public void testBccForChoice2AndChoice4() {
        int[][] graph4 = {{}};
        assertTrue(Solution.isBipartite(graph4));
    }
}

