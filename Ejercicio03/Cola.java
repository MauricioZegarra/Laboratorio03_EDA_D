public class Cola <T>{
    private Node<T> root;
    private int n;
    
    public Cola() {
        this.n = 0;
    }

    public Cola (T data){
        this.root = new Node<T>(data);
        this.n = 1;
    }

    public Cola(Node<T> root) {
        this.root = root;
        this.n = 1;
    }

    public boolean isEmpty(){
        return this.n == 0;
    }

    public void remove() {
        if (isEmpty()) {
            System.out.println("La cola esta vacia!");
        }
        else {
            if (this.n == 1) {
                this.root = null;
            }
            else {
                this.root = this.root.getNextNode();
            }

            this.n--;
        }
    }

    public void insert(T data){
        if (isEmpty()) {
            this.root = new Node<T>(data);
        }
        else {
            Node<T> aux = this.root;
            for (; aux.getNextNode() != null; aux = aux.getNextNode());
            aux.setNextNode(new Node<T>(data));
        }

        this.n++;
    }

    public String toString() {
        String str = "";
        
        if (isEmpty()) {
            str = "La cola esta vacia!";
        }
        else {
            for (Node<T> aux = this.root; aux != null; aux = aux.getNextNode()) {
                str += aux + ", ";
            }
        }

        return str;
    }
}
