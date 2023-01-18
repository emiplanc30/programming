
public class Cuadrado 
{
	public int ID;
	
	public Cuadrado()
	{
		ID = 177478;
	}
		
		public int calcularArea()
		{
			return ID * ID;
		}
		
		public double calcularDiagonal()
		{
			return Math.sqrt((Math.pow(ID, 2))+ (Math.pow(ID, 2)));
		}
		
		public void cambiarLongitud(int x)
		{
			ID = x;
		}
}
