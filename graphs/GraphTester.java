import java.util.Queue;

public class GraphTester {
public static void main(String[] args) {
	String houston = "houston";
	String denver = "denver";
	String dallas = "Dallas";
	WeightedGraph<String> graph = new WeightedGraph<>();
	graph.addVertex(houston);
	graph.addVertex(denver);
	graph.addVertex(dallas);
	
	graph.addEdge(denver, dallas, 200);
	graph.addEdge(denver, houston, 200);
	
	Queue <String> q = graph.getToVertices(denver);
	System.out.println(q);
}
}
