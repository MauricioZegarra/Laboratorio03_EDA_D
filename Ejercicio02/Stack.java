import java.util.EmptyStackException;

public class Stack<E> {
	private Node<E> root;
	
	public Stack() {
		this.root = null;
	}
	
	public void push(E x) {
		this.root = new Node<E>(x, this.root);
	}
	
	public E pop() {
		if (isEmpty())
            throw new EmptyStackException();
        E aux = this.root.getData();
        this.root = this.root.getNext();
        return aux;
	}
	
	public E peek() {
		if (isEmpty())
            throw new EmptyStackException();
        return this.root.getData();
	}
	
	public boolean isEmpty() {
		return this.root == null;
	}

    public int search(Object o){
        return 0;
    }
	
	public String toString() {
		String str = "";
		for (Node<E> i = this.root; i != null; i = i.getNext())
			str += i.toString() + ", ";
		return str;
	}
}