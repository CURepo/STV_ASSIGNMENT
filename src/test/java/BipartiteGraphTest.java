import org.example.Solution;
import org.junit.Test;
import static org.junit.Assert.*;

import org.example.Solution.*;



public class BipartiteGraphTest {

    @Test
    public void testIsBipartiteForBipartiteGraph() {
        BipartiteGraphTest graph = new BipartiteGraphTest();

        int[][] graph1 = {
                {1, 3},
                {0, 2},
                {1, 3},
                {0, 2}
        };
        assertTrue(Solution.isBipartite(graph1));
    }

    @Test
    public void testIsBipartiteForNonBipartiteGraph() {
        BipartiteGraphTest graph = new BipartiteGraphTest();

        int[][] graph2 = {
                {1, 2, 3},
                {0, 2},
                {0, 1},
                {0}
        };
        assertFalse(Solution.isBipartite(graph2));
    }

    @Test
    public void testIsBipartiteForBipartiteGraphWithDisconnectedComponents() {
        BipartiteGraphTest graph = new BipartiteGraphTest();

        int[][] graph3 = {
                {1, 2},
                {0, 2},
                {0, 1},
                {4},
                {3}
        };
        boolean status= Solution.isBipartite(graph3);
        System.out.println(Solution.isBipartite(graph3));
        assertFalse(status);
    }

    @Test
    public void testIsBipartiteForSingleNodeGraph() {
        BipartiteGraphTest graph = new BipartiteGraphTest();

        int[][] graph4 = {{}};
        assertTrue(Solution.isBipartite(graph4));
    }

    @Test
    public void testIsBipartiteForLargeBipartiteGraph() {
        BipartiteGraphTest graph = new BipartiteGraphTest();

        int[][] graph5 = {
                {1, 2},
                {0, 3},
                {0, 3},
                {1, 2}
        };
        assertTrue(Solution.isBipartite(graph5));
    }

    @Test
    public void testIsBipartiteForLargeNonBipartiteGraph() {
        BipartiteGraphTest graph = new BipartiteGraphTest();

        int[][] graph6 = {
                {1, 2},
                {0, 2, 3},
                {0, 1},
                {1}
        };
        assertFalse(Solution.isBipartite(graph6));
    }

    @Test
    public void testIsBipartiteForEmptyGraph() {
        BipartiteGraphTest graph = new BipartiteGraphTest();

        int[][] graph7 = {};
        assertTrue(Solution.isBipartite(graph7));
    }
}

