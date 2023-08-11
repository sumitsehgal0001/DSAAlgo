package graph;


import java.util.ArrayList;
import java.util.Queue;
import java.util.*;

public class BFSTraversalInGraph extends GraphInput {

    public static ArrayList<Integer> BFS(int vertex, int edges[][]){
        // WRITE YOUR CODE HERE
        Map<Integer, Set<Integer>> adjList= new HashMap<>();
        Map<Integer,Boolean> visited= new HashMap<>();
        Queue bfsOrder = new ArrayDeque<>();
        Set<Integer> ans=new HashSet<Integer>();
        ArrayList<Integer> ansList=new ArrayList<Integer>();

//System.out.println("edges " + Arrays.deepToString(edges));


        if(vertex==0 )
            return null;
        else if((vertex==1 || vertex==2) ){

            for(int index=0;index<vertex; index++){
                ansList.add(index);
            }
            return ansList;
        }

        for(int index=0;index<vertex; index++){
            adjList.put(index, new HashSet<Integer>() );
            visited.put(index, false);
        }


        for(int index=0;index<edges[0].length; index++){


            //System.out.println("array" + edges[0][index] + " > " + edges[1][index]);
            adjList.get(edges[0][index]).add(edges[1][index]);
            adjList.get(edges[1][index]).add(edges[0][index]);
        }

        //System.out.println("adjList" + adjList);
        //disconnected loop
        for(int index=0;index<vertex; index++){

            if(!visited.get(index))
                bfs(adjList,visited,bfsOrder,index,ansList);
        }


        return ansList;
    }

    public static void	bfs(Map<Integer,Set<Integer>> adjList,Map<Integer,Boolean> visited,
                              Queue bfsOrder,Integer currentVertex, ArrayList<Integer> ans){

        visited.put(currentVertex, true);
        ans.add(currentVertex);

        Set<Integer> neighbours=  adjList.get(currentVertex);

        for(Integer ele : neighbours){
            bfsOrder.add(ele);
        }

        while(bfsOrder.size()>0){
            Integer vertex =  bfsOrder.peek() !=null ? (Integer) bfsOrder.poll() :null ;
            if(vertex!=null && !visited.get(vertex))
                bfs(adjList,visited,bfsOrder,vertex,ans);
        }



    }

    public static void main(String[] args) {
        BFSTraversalInGraph obj = new BFSTraversalInGraph();
        obj.BFS(BFS_vertex,BFS_edges);
    }
}
