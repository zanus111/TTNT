package thuchanh;

public class Test {
	public static void main(String arg[]){
		 
		Node node40 =new Node(40);
		Node node10 =new Node(10);
		Node node20 =new Node(20);
		Node node30 =new Node(30);
		Node node60 =new Node(60);
		Node node50 =new Node(50);
		Node node70 =new Node(70);
 
		node40.addNeighbour(node10);
		node40.addNeighbour(node20);
		node10.addNeighbour(node30);
		node20.addNeighbour(node10);
		node20.addNeighbour(node30);
		node20.addNeighbour(node60);
		node20.addNeighbour(node50);
		node30.addNeighbour(node60);
		node60.addNeighbour(node70);
		node50.addNeighbour(node70);
 
		BFS_DFS bfsExample = new BFS_DFS(); 
//		bfsExample.bfsUsingQueue(node40,70);
		System.out.println("================================================");
		bfsExample.dfsUsingQueue(node40,70);

}

}
