package org.example;

import org.example.Solution;


public class Main {
    public static void main(String[] args)
    {
        int [][] graph = {{1,2,3},{0,2},{0,1,3},{0,2}};
        Solution.isBipartite (graph);
    }
}