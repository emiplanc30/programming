
public class Stack_program {

	public static void main(String[] args) 
	{
		// Crear mis objetos
		Stack stack = new Stack(5);
		Queues queue = new Queues(5);
		
		
		// Ejercicio 1:
		
		stack.Push('h');
		stack.Push('o');
		stack.Push('l');
		stack.Push('a');
		
		System.out.print(stack.Pop());
		System.out.print(stack.Pop());
		
		System.out.println(" ");
		
		// Ejercicio 2:
		
		queue.insert('h');
		queue.insert('o');
		queue.insert('l');
		queue.insert('a');
		
		System.out.print(queue.delete());
		System.out.print(queue.delete());
		
		// Ejercicio 3:
		
		stack.invertirCadena("Agua");
		
		// Ejercicio 4:
		

		
	}

}
