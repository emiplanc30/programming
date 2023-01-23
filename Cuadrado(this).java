
public class Cuadrado 
{
	public int lado;
	
	public Cuadrado()
	{
		this(177478);
	}
	
	public Cuadrado(int x)
	{
		this.lado = x;
	}
	
		public int calcularArea()
		{
			return lado * lado;
		}
		
		public double calcularDiagonal()
		{
			return Math.sqrt((Math.pow(lado, 2))+ (Math.pow(lado, 2)));
		}
		
		public int clacularPerimetro()
		{
			return lado * 4;
		}
		
		public void cambiarLongitud(int x)
		{
			lado = x;
		}
}
