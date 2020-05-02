package model;

public class nodeList {

	// -------------------------------------
	// Atributtes
	// -------------------------------------
	private long value;

	// -------------------------------------
	// Relations
	// -------------------------------------
	nodeList next;
	nodeList prev;

	// -------------------------------------
	// Constructor
	// -------------------------------------

	public nodeList(long value) {
		this.value = value;
	}

	// -------------------------------------
	// Getters
	// -------------------------------------

	public long getValue() {
		return value;
	}

	public nodeList getNext() {
		return next;
	}

	public nodeList getPrev() {
		return prev;
	}

	// -------------------------------------
	// Setters
	// -------------------------------------

	public void setValue(long value) {
		this.value = value;
	}

	public void setNext(nodeList next) {
		this.next = next;
	}

	public void setPrev(nodeList prev) {
		this.prev = prev;
	}

	// -------------------------------------
	// Methods
	// -------------------------------------

}
