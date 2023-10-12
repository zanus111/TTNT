package thuchanh;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BFS_DFS {
	public void bfsUsingQueue(Node initial, int goal) {
        Queue<Node> queue = new LinkedList<>(); // mang chua danh sach cac note
        queue.offer(initial); // add note dau tien vao
        initial.setVisited(true); // gan no la da di qua
        while (!queue.isEmpty()) { // neu mang van con phan tu
            Node current = queue.poll(); // xoa no di va goi no ra
            if (current.getState()==goal){
            	System.out.println("Da tim thay dc dinh : "+ goal);
            	String s="";
            	while (current!=initial)// neu no van chua phaai la dinh ban dau
            	{
            		s="->"+current.getState()+s; // gan vi tri cua dinh do vao trc s
            		current =current.getParent(); // gan dinh do thanh dinh cha cua no
            	}
            	System.out.println("Duong di tu " + initial.getState() +" den " + goal+ " la :" +initial.getState()+ ""+s);// dinh ban dau + danh sach cac dinh tiep theo
            	return;
            }

            ArrayList<Node> neighbours = (ArrayList<Node>) current.getNeighbours(); // danh sach cac note lien ke
            if (neighbours != null) {// neu danh sach khac null
                for (Node neighbour : neighbours) { // chay vong lap
                    if (!neighbour.isVisited()) { // neu dinh chua dc duyet
                        queue.offer(neighbour); // add vao
                        neighbour.setVisited(true); // gan no da dc duyet
                        neighbour.setParent(current); // gan cha cua no la current
                    }
                }
            }
        }

        System.out.println("Không tìm thấy giá trị " + goal);
    }

public void dfsUsingQueue(Node initial, int goal) {
    Stack<Node> stack = new Stack<>(); // mang chua danh sach cac note
    stack.push(initial); // add note dau tien vao
    initial.setVisited(true); // gan no la da di qua
    while (!stack.isEmpty()) { // ktra stack neu van con phan tu
        Node current = stack.pop(); // lấy nút ra khỏi Stack
        if (current.getState() == goal) { // neu vi tri cua no la goal
            System.out.println("Đã tìm thấy đỉnh: " + goal);
            String s = "";
            while (current != initial) {
                s = "->" + current.getState() + s;
                current = current.getParent();
            }
            System.out.println("Đường đi từ " + initial.getState() + " đến " + goal + " là: " + initial.getState() + s);
            return;
        }
// Buoc add cac dinh vao dinh lien ke
        ArrayList<Node> neighbours = (ArrayList<Node>) current.getNeighbours();
        if (neighbours != null) {
            for (Node neighbour : neighbours) {
                if (!neighbour.isVisited()) {
                    stack.push(neighbour); // đẩy nút vào Stack
                    neighbour.setVisited(true);
                    neighbour.setParent(current);
                }
            }
        }
    }

    System.out.println("Không tìm thấy giá trị " + goal);
}

}
