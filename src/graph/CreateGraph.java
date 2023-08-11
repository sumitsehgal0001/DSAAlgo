package graph;

import java.util.ArrayList;
import java.util.Queue;
import java.util.*;

public class CreateGraph {

    public static int[][] printAdjacency(int n, int m, int[][] edges) {
        // Write your code here.
        //adjacency list for undirected graph u > v and v > u
        if(edges==null)
            return edges;

        Map<Integer,List<Integer>> adjList = new HashMap<>();
        for(int i=0;i<n;i++){
            adjList.put(i, new ArrayList<>());
        }
        int[][] ans = new int[n][];



        for(int[] i : edges){
            int u = i[0];
            int v = i[1];
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }

        int index=0;
        for(Integer i : adjList.keySet()){
            int size=adjList.get(i).size();
            int[] arry = new int[size+1];
            arry[0]=i;

            toIntArray(adjList.get(i),arry,1);
            ans[index++]=arry;

        }


        return ans;


    }

    public static int[] toIntArray(List<Integer> list,int arry[],int index){

        for(int i = 0;i < list.size();i++)
            arry[index++] = list.get(i);
        return arry;
    }
}
