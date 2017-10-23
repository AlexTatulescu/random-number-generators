package data_structure;

public class BinarySearchTree {

	private Node root;

	public BinarySearchTree() {
		this.root = null;
	}

	public void insert(int id) {
		Node newNode = new Node(id);
		if (root == null) {
			root = newNode;
			return;
		}
		Node current = root;
		Node parent = null;
		while (true) {
			parent = current;
			if (id < current.getData()) {
				current = current.getLeft();
				if (current == null) {
					parent.setLeft(newNode);
					return;
				}
			} else {
				current = current.getRight();
				if (current == null) {
					parent.setRight(newNode);
					return;
				}
			}
		}
	}

	public boolean find(int id) {
		Node current = root;
		while (current != null) {
			if (current.getData() == id) {
				return true;
			} else if (current.getData() > id) {
				current = current.getLeft();
			} else {
				current = current.getRight();
			}
		}
		return false;
	}

}
