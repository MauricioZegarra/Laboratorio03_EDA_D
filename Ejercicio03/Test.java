public class Test {
    public static void main(String[] args) {
        Cola<Integer> queue = new Cola<Integer>(4);
        System.out.println(queue);
        queue.insert(5);
        System.out.println(queue);
        queue.insert(7);
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
    }
}
