public class Cola <T>{
    private Node<T> root;
    private int n = 0;
    private int capacidad;
    
    public Cola(int capacidad) {
        this.capacidad = capacidad;
        this.n = 0;
    }

    public Cola (T data, int capacidad){
        this.root = new Node<T>(data);
        this.capacidad = capacidad;
        this.n++;
    }

    public Cola(Node<T> root, int capacidad) {
        this.root = root;
        this.capacidad = capacidad;
        this.n++;
    }

    public boolean isEmpty(){
        return this.n == 0;
    }

    public boolean isFull() {
        return this.n == this.capacidad;
    }

    public boolean add(T data) throws IllegalStateException {

        if (isFull()) {
            throw new IllegalStateException("Cola llena!");
        }
        else {
            if (isEmpty()) {
                this.root = new Node<T>(data);
            }
            else {
                Node<T> aux = this.root;
                for (; aux.getNextNode() != null; aux = aux.getNextNode());
                aux.setNextNode(new Node<T>(data));
            }
    
            this.n++;
    
            return true;    
        }

    }

    public boolean offer(T data){
        if (isFull()) {
            System.out.println("Cola llena!");
            return false;
        }
        else {
            if (isEmpty()) {
                this.root = new Node<T>(data);
            }
            else {
                Node<T> aux = this.root;
                for (; aux.getNextNode() != null; aux = aux.getNextNode());
                aux.setNextNode(new Node<T>(data));
            }
    
            this.n++;
            
            return true;
        }
    }

    public Node<T> element() throws IllegalStateException {
        if (isEmpty()) {
            throw new IllegalStateException("La cola esta vacia!"); 
        }
        return root;
    }

    public Node<T> peek() {
        if (isEmpty()) {
            return null;
        }
        else {
            return root;
        }
    }

    public Node<T> poll() {
        if (isEmpty()) {
            System.out.println("La cola esta vacia!");
            return null;
        }
        else {
            if (this.n == 1) {
                this.root = null;
            }
            else {
                this.root = this.root.getNextNode();
            }

            this.n--;

            return root;
        }
    }

    public Node<T> remove() throws IllegalStateException {
        if (isEmpty()) {
            throw new IllegalStateException("La cola esta vacia!");
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

        return root;
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
