public class Test {
    public static void main(String[] args) throws IllegalStateException {
        Cola<Integer> queue = new Cola<Integer>(4, 10);
        System.out.println(queue);
        queue.add(5);
        System.out.println(queue);
        queue.offer(7);
        System.out.println(queue);
        queue.add(11);
        queue.poll();
        System.out.println("El primer elemento es: " + queue.element() + " => " + queue);
        queue.offer(9);
        queue.remove();
        System.out.println("El primer elemento es: " + queue.peek() + " => " + queue);
    }
}
