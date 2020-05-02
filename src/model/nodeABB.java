package model;

public class nodeABB {

	// ------------------------------
	// Associations
	// ------------------------------
	private nodeABB left;
	private nodeABB right;
	private nodeABB parent;

	// -------------------------------------
	// Atributtes
	// -------------------------------------
	private long value;

	// -------------------------------------
	// Constructor
	// -------------------------------------

	public nodeABB(long value) {
		this.value = value;
	}

	// -------------------------------------
	// Getters
	// -------------------------------------

	public long getValue() {
		return value;
	}

	public nodeABB getLeft() {
		return left;
	}
	
	public nodeABB getRight() {
		return right;
	}
	
	public nodeABB getParent() {
		return parent;
	}
	
	// -------------------------------------
	// Setters
	// -------------------------------------

	public void setValue(long value) {
		this.value = value;
	}

	public void setLeft(nodeABB left) {
		this.left = left;
	}

	public void setRight(nodeABB right) {
		this.right = right;
	}

	public void setParent(nodeABB parent) {
		this.parent = parent;
	}

	// -------------------------------------
	// Methods
	// -------------------------------------
}
