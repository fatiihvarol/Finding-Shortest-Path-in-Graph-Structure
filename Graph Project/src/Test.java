
public class Test {

	public static void main(String[] args) {
		Graph graph = new Graph();

		graph.addEdge("0", "1", 4);
		graph.addEdge("0", "2", 3);
		graph.addEdge("1", "2", 1);
		graph.addEdge("1", "3", 2);
		graph.addEdge("2", "3", 4);
		graph.addEdge("3", "4", 2);
		graph.addEdge("4", "5", 6);

		// print whole graph
		System.out.println("Original Graph: ");
		graph.print();

	}

}
