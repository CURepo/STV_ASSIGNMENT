package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public static boolean isBipartite(int[][] graph)
    {
        int n=graph.length;
        int [] color = new int[n];
        for(int i=0;i<n;i++)
        {
            if(color[i]!=0)
            {
                continue;
            }
            Queue<Integer> q = new LinkedList<>();
            q.add(i);
            color[i]=1;

            while(!q.isEmpty())
            {
                int cur=q.peek();
                q.remove();

                for(int x : graph[cur])
                {
                    if(color[x]==0)
                    {
                        color[x]=-color[cur];
                        q.add(x);
                    }
                    else if(color[x]!=-color[cur])
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}

