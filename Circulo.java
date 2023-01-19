
public class Circulo {
	
	public int ID;
	
	public Circulo()
	{
		ID = 177478;
	}
	
	// esta operación obtiene el radio.
	double radio = ID * (0.5);
	
	public double calcularCircunferencia() 
	{
		// el ID se toma como el díametro del círculo.
		return ID * (3.1416);
	}
	
	public double calcularArea()
	{
		return (3.1416) * Math.pow(radio, 2);
	}
	
	public void  cambiarDiametro(int x)
	{
		ID = x;
	}

}
