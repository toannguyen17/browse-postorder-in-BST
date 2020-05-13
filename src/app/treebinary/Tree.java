package app.treebinary;

public class Tree<E> {
	private Node<E> root;

	// Constructor
	public Tree() {
	}

	public Tree(E data) {
		this.root = new Node<E>(data);
	}

	public Node<E> getRoot() {
		return root;
	}

	public void add(E data){
		Node<E> node = new Node<E>(data);

		if(root == null){
			root = node;
		}else{
			Node<E> current = root;
			while (true) {
				Node<E> line;

				if (current.compareTo(data) > 0) {
					line = current.getLeft();
					if (line == null){
						current.setLeft(node);
						break;
					}
				} else {
					line = current.getRight();
					if (line == null){
						current.setRight(node);
						break;
					}
				}
				current = line;
			}
		}
	}

	public boolean search(E element) {
		Node<E> current = root;
		while (current != null) {
			if (current.compareTo(element) > 0) {
				current = current.getLeft();
			} else if (current.compareTo(element) < 0) {
				current = current.getRight();
			} else {
				return true;
			}
		}
		return false;
	}
}
