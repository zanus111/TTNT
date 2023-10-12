package thuchanh;

import java.util.ArrayList;
import java.util.List;

public class Node {
	 private int state; // định danh đỉnh
	    private boolean visited; // ktra xem dinh do da dc tham chua
	    private List<Node> neighbours; // danh sach cac dinh lien ke 
	    private Node parent; // Node cha của node hiện tại

	    public Node(int state) {
	        this.state = state;
	        visited = false;
	        neighbours = new ArrayList<>();
	        parent = null;
	    }

	    public int getState() {
	        return state;
	    }

	    public boolean isVisited() {
	        return visited;
	    }

	    public void setVisited(boolean visited) {
	        this.visited = visited;
	    }

	    public List<Node> getNeighbours() {
	        return neighbours;
	    }

	    public void addNeighbour(Node neighbour) {
	        neighbours.add(neighbour);
	    }

	    public Node getParent() {
	        return parent;
	    }

	    public void setParent(Node parent) {
	        this.parent = parent;
	    }

}
