public class Cola <T>{
    private Node<T> root;
    private int n;

    public Cola (T data){
        this.root = new Node<T>(data);
        this.n = 0;
    }

    public Cola(Node<T> root) {
        this.root = root;
        this.n = 0;
    }

    public boolean isEmpty(){
        return n == 0;
    }

    public void insert(T data){
        Node<T> aux = this.root;
        for (; aux.getNextNode() != null; aux = aux.getNextNode());
        aux.setNextNode(new Node<T>(data));
        n++;
    }

    public String toString() {
        String str = "";

        for (Node<T> aux = this.root; aux != null; aux = aux.getNextNode()) {
            str += aux + ", ";
        }

        return str;
    }
}
