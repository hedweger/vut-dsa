package th;

import java.util.LinkedList;
import java.util.TreeSet;

public class BFS {
	public void printMoves(Board initial) {
		var open = new LinkedList<Board>();
		// TIP: Vyzkousejte s ruznymi strukturami
		var closed = new TreeSet<Board>();
		// HashSet<HraciPole> closed = new TreeSet<HraciPole>();
		// TreeSet<HraciPole> closed = new TreeSet<HraciPole>();
		// LinkedList<HraciPole> closed = new LinkedList<HraciPole>();
		open.addLast(initial);
		int memidx = 0;

		while (!open.isEmpty()) {
			memidx++;
			var tmp = open.removeLast();
			closed.add(tmp);
			if (memidx == 10) {
				System.out.println(Runtime.getRuntime().maxMemory() + "/" + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()));
			}
			if (tmp.isSolution()) {
				System.out.println("Found a solution: \n" + tmp);
				return;
			}
			for (int i = 1; i < 5; i++) {
				var tempest = tmp.cloneAndMove(i);	
				if (tempest == null) {
					continue;
				}
				if (!closed.contains(tempest)) { // not needed for treeset
					open.addLast(tempest);
				}
			}
		}
		System.out.println("Solution is impossible to find!");
	}
}
