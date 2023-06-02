public class Stack<E> {
	private Node<E> root;
	
	public Stack() {
		this.root = null;
	}
	
	public void push(E x) {
		this.root = new Node<E>(x, this.root);
	}
	
	public E pop() {
		return null;
	}
	
	public E peek() {
		return null;
	}
	
	public boolean isEmpty() {
		return this.root == null;
	}

    public int search(Object o){
        return null;
    }
	
	public String toString() {
		String str = "";
		for (Node<E> i = this.root; i != null; i = i.getNext())
			str += i.toString() + ", ";
		return str;
	}
}