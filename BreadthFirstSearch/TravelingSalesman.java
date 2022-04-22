package BreadthFirstSearch;

import java.util.ArrayList;
/*
big O runtime for both depth-first search and breadth-first search is O(vertices + edges).
 */

class TravelingSalesman {
    public static void breadthFirstTraversal(Vertex start, ArrayList<Vertex> visitedVertices) {
        Queue visitQueue = new Queue();
        visitQueue.enqueue(start);

        while(!visitQueue.isEmpty()){
            Vertex current = visitQueue.dequeue();
            System.out.println(current.getData());

            for(Edge e : current.getEdges()) {
                Vertex neighbor = e.getEnd();
                if(!visitedVertices.contains(neighbor)) {
                    visitQueue.enqueue(neighbor);
                    visitedVertices.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        CityData citydata = new CityData();
        Vertex startingVertex = citydata.getStartingVertex();
        ArrayList<Vertex> visitedVertices = new ArrayList<>();
        visitedVertices.add(startingVertex);

        TravelingSalesman.breadthFirstTraversal(startingVertex, visitedVertices);
    }
}
