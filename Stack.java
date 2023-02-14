
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

}
