package model;

public class ABB {

	// ------------------------------
	// Associations
	// ------------------------------
	private nodeABB root;

	// -------------------------------------
	// Atributtes
	// -------------------------------------
	private long time;
	private int count;

	// -------------------------------------
	// Constructor
	// -------------------------------------

	public ABB(long time, int count) {
		this.time = time;
		this.count = count;
	}

	// -------------------------------------
	// Getters
	// -------------------------------------
	public nodeABB getRoot() {
		return root;
	}

	public long getTime() {
		return time;
	}

	public int getCount() {
		return count;
	}

	// -------------------------------------
	// Setters
	// -------------------------------------
	public void setRoot(nodeABB root) {
		this.root = root;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public void setCount(int count) {
		this.count = count;
	}

	// -------------------------------------
	// Methods
	// -------------------------------------

	public void addIterative(nodeABB node) {
		nodeABB toAdd = node;
		if (root == null) {
			root = toAdd;
		} else {
			nodeABB current = root;
			boolean added = false;

			while (!added) {

				if (toAdd.getValue() > current.getValue()) {
					if (current.getRight() == null) {
						current.setRight(toAdd);
						added = true;
					} else {
						current = current.getRight();
					}
				} else {
					if (current.getLeft() == null) {
						current.setLeft(toAdd);
						added = true;
					} else {
						current = current.getLeft();
					}
				}
			}
		}
	}

	public boolean searchIterative(long num) {
		long x = System.currentTimeMillis();
		boolean found = false;
		nodeABB current = root;
		boolean keep = true;
		if (root != null) {
			while (current != null && keep) {
				if (current.getValue() == num) {
					found = true;
					keep = false;
				} else if (current.getValue() <= num) {
					current = current.getLeft();
				} else if (current.getValue() >= num) {
					current = current.getRight();
				}
			}
		}
		long y = System.currentTimeMillis();
		time = y - x;
		return found;
	}

	// -------------------------------------
	// Recursive
	// -------------------------------------

	public void addRecursive(nodeABB node, long value) {
		if (value < node.getValue()) {
			if (node.getLeft() != null) {
				addRecursive(node.getLeft(), value);
			} else {
				node.setLeft(new nodeABB(value));
			}
		} else if (value > node.getValue()) {
			if (node.getRight() != null) {
				addRecursive(node.getRight(), value);
			} else {
				node.setRight(new nodeABB(value));
			}
		}
	}
	
	public static boolean searchRecursively(nodeABB node, long value) {

        if (node == null)
            return false;

        if (node.getValue() == value)
            return true;

        if (value < (int) node.getValue())
            return searchRecursively(node.getLeft(), value);

        else if (value > node.getValue())
            return searchRecursively(node.getRight(), value);


        return false;
    }

}
