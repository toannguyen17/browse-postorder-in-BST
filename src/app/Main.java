package app;

import app.treebinary.borwse.Postorder;
import app.treebinary.Tree;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Tree<Integer> tree = new Tree<>(60);

		// Add element
		tree.add(55);
		tree.add(100);
		tree.add(45);
		tree.add(57);
		tree.add(67);
		tree.add(107);
		tree.add(59);
		tree.add(101);

		// Postorder
		Postorder postorder = new Postorder<Integer>();

		ArrayList<Integer> array = postorder.toArray(tree);

		System.out.println(array);

	}
}
