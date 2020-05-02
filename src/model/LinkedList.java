package model;

public class LinkedList {

	// ------------------------------
	// Associations
	// ------------------------------
	nodeList first;

	// -------------------------------------
	// Atributtes
	// -------------------------------------

	private long time;
	private int count;

	// -------------------------------------
	// Constructor
	// -------------------------------------

	public LinkedList(long time, int count) {
		this.time = time;
		this.count = count;
	}

	// -------------------------------------
	// Getters
	// -------------------------------------

	public nodeList getFirst() {
		return first;
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

	public void setFirst(nodeList f) {
		first = f;
		first.setNext(first);
		first.setPrev(first);
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

	public void addIterative(nodeList nl) {
		nodeList toAdd = nl;
		if (first == null) {
			first = toAdd;
		} else {
			nodeList current = first;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			toAdd.setPrev(current);
			current.setNext(toAdd);
		}
	}

	public boolean searchIterative(long snl) {
		boolean find = false;
		long x = System.currentTimeMillis();
		nodeList nl = null;
		nodeList current = first;
		if (current != null) {
			while (current.getNext() != null && !find) {
				if (current.getValue() == snl) {
					find = true;
				}
				current = current.getNext();
			}
		}
		long y = System.currentTimeMillis();
		time = y - x;
		return find;
	}

	public boolean removeIterative(long rnl) {
		boolean remove = false;
		long x = System.currentTimeMillis();
		nodeList nl = null;
		nodeList current = first;
		if (current != null) {
			while (current.getNext() != null && !remove) {
				if (current.getValue() == rnl) {
					current.getPrev().setNext(current.getNext());
					current.getNext().setPrev(current.getPrev());
					remove = true;
				}
				current = current.getNext();
			}
		}
		long y = System.currentTimeMillis();
		time = y - x;
		return remove;
	}

	// -------------------------------------
	// Recursive
	// -------------------------------------

	private void add(nodeList cur, long data) {
		if (cur.next != null) {
			add(cur.next, data);
		} else {
			cur.next = new nodeList(data);
		}
	}

	public void add(int data) {
		if (first == null) {
			first = new nodeList(data);
		} else {
			add(first, data);
		}
	}

	public boolean search(nodeList node, long x) {
		if (node == null)
			return false;

		if (node.getValue() == x)
			return true;

		return search(node.next, x);
	}

}
