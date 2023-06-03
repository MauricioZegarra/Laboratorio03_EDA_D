public class Ejercicio02 {
	public static void main(String[] args) {
		Stack<String> pila = new Stack<String>();
        
        try {

            pila.push("AndreCapi");
            System.out.println(pila+ "\tpeek: " + pila.peek());
            pila.push("GonzaloNoHaceNada");
            System.out.println(pila + "\tpeek: " + pila.peek());
            pila.push("David");
            System.out.println(pila+ "\tpeek: " + pila.peek());
            pila.push("Mauricio");
            System.out.println(pila+ "\tpeek: " + pila.peek());
            pila.push("Diego");
            System.out.println(pila+ "\tpeek: " + pila.peek());

            System.out.println("pop(): " + pila.pop());
            System.out.println(pila + "\tpeek: " + pila.peek());
            System.out.println("pop(): " + pila.pop());
            System.out.println(pila + "\tpeek: " + pila.peek());
            
            pila.push("Diego");
            System.out.println(pila + "\tpeek: " + pila.peek());

			System.out.println(pila.search("AndreCapi"));
                
            
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }


	}

}