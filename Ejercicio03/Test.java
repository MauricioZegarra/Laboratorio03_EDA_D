public class Test {
    public static void main(String[] args) throws IllegalStateException {
        Cola<Integer> queue = new Cola<Integer>(4, 10);
        System.out.println(queue);
        queue.add(5);
        System.out.println(queue);
        queue.offer(7);
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
    }
}
