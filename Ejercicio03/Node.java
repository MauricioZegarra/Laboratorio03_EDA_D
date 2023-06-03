public class Node <T> {
    T data;
    Node<T> nextNode;

    public Node(T data) {
        this.data = data;
        this.nextNode = null;
    }

    public Node(T data, Node<T> nextNode) {
        this.data = data;
        this.nextNode = nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNextNode() {
        return this.nextNode;
    }

    public T getData() {
        return data;
    }

    public String toString() {
        return getData().toString();
    }
}
