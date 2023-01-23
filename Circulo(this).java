
public class Circulo {
	
	public int radio;
	
	public Circulo()
	{
		this(177478);
	}
	
	public Circulo(int x)
	{
		this.radio = x;
	}
	
	public double calcularCircunferencia() 
	{
		// el ID se toma como el díametro del círculo.
		return radio * (3.1416);
	}
	
	public double calcularArea()
	{
		return (3.1416) * Math.pow(radio, 2);
	}
	
	public void  cambiarDiametro(int x)
	{
		radio = x;
	}

}
