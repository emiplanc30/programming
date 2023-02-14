
public class Queues 
{
	int max;
	int tails;
	char[] queue;
	
	public Queues(int queueSize)
	{
		this.queue = new char[queueSize];
		this.max = this.queue.length;
		this.tails = 0;
	}
		
		public void insert(char letter)
		{
			if (tails == max)
			{
				System.out.println("Queue is full. ");
				return;
			}
			
			queue[tails] = letter;
			tails++;
		}
		
		public char delete()
		{
			int i = 0;
			if (tails == 0)
			{
				System.out.print("The queue is empty. ");
				return queue[tails];
			}
			else
			{
				char letter;
				letter = queue[0];
				queue[tails] = '0';
				tails--;
				for (i = 0; i < tails; i++)
				{
					queue[i] = queue[i + 1];
				}
				return letter;
			}
		}
	}
