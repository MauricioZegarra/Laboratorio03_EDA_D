import java.util.*;
public class Ejercicio02 {
	public static void main(String[] args) {
		Stack<String> pila = new Stack<>();
        
        try {
            /* 
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
               */
              
               pila.push("Elemento 1");
               pila.push("Elemento 2");
               pila.push("Elemento 3");
               
               System.out.println(pila);
               System.out.println("");
               System.out.println("El ultimo elemento: "+pila.peek());
               System.out.println("Elemento eliminado"+pila.pop());
               
               System.out.println(pila);
               
            
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }


	}

}