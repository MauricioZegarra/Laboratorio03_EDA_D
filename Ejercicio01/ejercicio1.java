public class ejercicio1 {
    
    public static void main(String[] args) {
        System.out.println("hola");
    }
	
    public static int equalStacks(Stack<Integer> h1, Stack<Integer> h2, Stack<Integer> h3) {
        int sum1 = suma(h1);
        int sum2 = suma(h2);
        int sum3 = suma(h3);
        //mientras las sumas sean diferentes se repite el ciclo
        while (!comparar(sum1, sum2, sum3)) {
            if (sum1 >= sum2 && sum1 >= sum3) {
                if (h1.isEmpty()) {
                    break; // No se pueden eliminar mas elementos 
                }
                sum1 -= h1.pop();
            } else if (sum2 >= sum1 && sum2 >= sum3) {
                if (h2.isEmpty()) {
                    break; // No se pueden eliminar mas elemetnos
                }
                sum2 -= h2.pop();
            } else {
                if (h3.isEmpty()) {
                    break; // No se pueden eliminar mas elemetnos
                }
                sum3 -= h3.pop();
            }
        }

        if (comparar(sum1, sum2, sum3)) {
            return sum1; // si al final las sumas son igual retorna
        } else {
            return 0; // No hay altura máxima posible para las tres pilas
        }
    }
    //suma los elementos de la pila
    public static int suma(Stack<Integer> pila) {
        int sum = 0;
        for (int altura : pila) {
            sum += altura;
        }
        return sum;
    }
    //retorna true si las sumas son iguales
    public static boolean comparar(int sum1, int sum2, int sum3) {
        return sum1 == sum2 && sum2 == sum3;
    }
}
