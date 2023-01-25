import java.util.Scanner;

public class Scan 
{

	public static void main(String[] args) 
	{
		System.out.println("¿Qué figura desea hacer?: círculo o cuadrado");
		System.out.println("Recuerda usar únicamente minúsculas y sin acentos.");
		Scanner fig = new Scanner(System.in);
		String figura = fig.nextLine();
		
		if (figura.contains("circulo"))
		{
			System.out.println("¿Cuánto mide el radio?");
			Scanner rad = new Scanner(System.in);
			double radio = rad.nextDouble();
			
			System.out.println("¿Qué desea obtener?: circunferencia o área.");
			Scanner option = new Scanner(System.in);
			String opt = option.nextLine();
			
			if (opt.contains("circunferencia"))
			{
				double circun = radio * (3.1416);
				System.out.println("La circunferencia es: " + circun);
			}
			
			if (opt.contains("area"))
			{
				double area = (3.1416) * Math.pow(radio, 2);
				System.out.println("El area es: " + area);
			}
		}
		
		if (figura.contains("cuadrado"))
		{
			System.out.println("¿Cuánto mide un lado del cuadrado?");
			Scanner side = new Scanner(System.in);
			double lado = side.nextDouble();
			
			System.out.println("¿Qué desea obtener?: diagonal, perímetro o área.");
			Scanner option = new Scanner(System.in);
			String opt = option.nextLine();
			
			if (opt.contains("diagonal"))
			{
				double diag = Math.sqrt((Math.pow(lado, 2))+ (Math.pow(lado, 2)));
				System.out.println("La diagonal es: " + diag);
			}
			if (opt.contains("perimetro"))
			{
				double peri = lado * 4;
				System.out.println("El perímetro es: " + peri);
			}
			if (opt.contains("area"))
			{
				double area = lado * lado;
				System.out.println("El área es: " + area);
			}
		}	
	}

}
