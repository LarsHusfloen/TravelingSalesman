package BreadthFirstSearch;

class CityData {
    private Graph CityData;

    public CityData() {
        this.CityData = new Graph(false, true);
        Vertex startNode = CityData.addVertex("v0.0.0");
        Vertex v1 = this.CityData.addVertex("v1.0.0");
        Vertex v2 = this.CityData.addVertex("v2.0.0");

        Vertex v11 = this.CityData.addVertex("v1.1.0");
        Vertex v12 = this.CityData.addVertex("v1.2.0");
        Vertex v21 = this.CityData.addVertex("v2.1.0");

        Vertex v111 = this.CityData.addVertex("v1.1.1");
        Vertex v112 = this.CityData.addVertex("v1.1.2");
        Vertex v121 = this.CityData.addVertex("v1.2.1");
        Vertex v211 = this.CityData.addVertex("v2.1.1");

        this.CityData.addEdge(startNode, v1, null);
        this.CityData.addEdge(startNode, v2, null);

        this.CityData.addEdge(v1, v11, null);
        this.CityData.addEdge(v1, v12, null);
        this.CityData.addEdge(v2, v21, null);

        this.CityData.addEdge(v11, v111, null);
        this.CityData.addEdge(v11, v112, null);
        this.CityData.addEdge(v12, v121, null);
        this.CityData.addEdge(v21, v211, null);

        // create a cycle
        this.CityData.addEdge(v211, v2, null);
    }

    public Vertex getStartingVertex() {
        return this.CityData.getVertices().get(0);
    }
}
