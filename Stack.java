import java.util.Scanner;

public class Stack 
{
	int top;
	int max;
	char[] stack;
	
	public Stack(int stackSize)
	{
		this.stack = new char[stackSize];
		this.max  = this.stack.length;
		this.top = 0;
	}
	
	public void Push(char letter)
	{
		if(top == max)
		{
			System.out.println("¡FUERA!");
			return;
		}
		
		stack[top] = letter;
		top++;
	}
	
	public char Pop()
	{
		if (top == 0)
		{
			System.out.println("Stack is empty");
			return stack[top];
		}
		else
		{
			char letter;
			letter = stack[top - 1];
			stack[top] = '0';
			top--;
			return letter;
		}
	}
	
	Scanner scan = new Scanner(System.in);
	
	public String invertirCadena(String cadena)
	{
		int i;
		char[] letters = new char[cadena.length()];
		for(i = 0; i < cadena.length(); i++)
		{
			letters[cadena.length() - i - 1] = cadena.charAt(i);
		}
		
		return String.copyValueOf(letters);
	}
	
	public String palindromo(String frase)
	{
		String fin = "La frase no es un palíndromo.";
		
		if(invertirCadena(frase) == frase)
		{
			System.out.println("La frase es un palíndromo. ");
		}
		else
		{
			System.out.println("La frase no es un palíndromo. ");
		}
		
		return fin;
	}

}
