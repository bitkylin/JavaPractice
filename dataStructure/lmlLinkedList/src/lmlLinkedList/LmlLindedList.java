package lmlLinkedList;

public class LmlLindedList {
	private Object last;
	private Object first;
	private int size = 0;

	public LmlLindedList() {
		first = new NodeInt(0);
		last = first;
	}

	public LmlLindedList(int[] items) {
		this();
		for (int item : items) {
			add(item);
		}
	}

	public void add(int item) {
		NodeInt node = new NodeInt(item);
		NodeInt last = (NodeInt) this.last;
		last.setNext(node);
		this.last = node;
		size++;
	}

	public int size() {
		return size;
	}

	public void remove(int count) {
		checkRange(count);
		NodeInt before = (NodeInt) first;
		for (int i = 0; i < count; i++) {
			before = before.getNext();
		}
		NodeInt after = before.getNext().getNext();
		before.setNext(after != null ? after : null);
		size--;
	}

	public int get(int count) {
		checkRange(count);
		NodeInt now = (NodeInt) first;
		for (int i = 0; i < count + 1; i++) {
			now = now.getNext();
		}
		return now.getNode();
	}

	public void getAll() {
		NodeInt now = ((NodeInt) first).getNext();
		while (now != null) {
			System.out.print(" " + now.getNode());
			now = now.getNext();
		}
	}

	private void checkRange(int count) throws IndexOutOfBoundsException {
		if (count < 0 || count >= size)
			throw new IndexOutOfBoundsException("size:"+size+";input:"+count);
	}
}
