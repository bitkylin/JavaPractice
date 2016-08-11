package lmlLinkedList;

public class NodeInt {
	private NodeInt next;
	private int node;

	public int getNode() {
		return node;
	}

	public void setNext(NodeInt next) {
		this.next = next;
	}

	public NodeInt getNext() {
		return next;
	}

	public NodeInt(int node) {
		this.node = node;
	}

	public void setNode(int node) {
		this.node = node;
	}
}
