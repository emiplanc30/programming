import java.util.Scanner;

public class program_scan 
{

	public static void main(String[] args) 
	{
		Circulo circ = new Circulo();
		Cuadrado cuad = new Cuadrado();
		String figura, option;
		
		System.out.println("¿Qué desea hacer?: cuadrado o círculo.");
		System.out.println("Recuerda no usar acentos y escribir todo en minúsculas.");
		Scanner scan = new Scanner(System.in);
		figura = scan.nextLine();
		
		if (figura.contains("cuadrado"))
		{
			System.out.println("¿Cuánto mide el lado del cuadrado?");
			String value = scan.nextLine();
			int lado = Integer.parseInt(value);
			cuad.cambiarLongitud(lado);
			System.out.println("¿Qué desea obtener?: perímetro, área o diagonal.");
			option = scan.nextLine();
			
			if (option.contains("perimetro"))
			{
				System.out.println("El perímetro es: " + cuad.calcularPerimetro());
			}
			if (option.contains("area"))
			{
				System.out.println("El area es: " + cuad.calcularArea());
			}
			if (option.contains("diagonal"))
			{
				System.out.println("La diagonal es: " + cuad.calcularDiagonal());
			}
			
		}
		
		if (figura.contains("circulo"))
		{
			System.out.println("¿Cuánto mide el radio?");
			String value = scan.nextLine();
			int radio = Integer.parseInt(value);
			circ.cambiarRadio(radio);
			System.out.println("¿Qué desa obtener?: circunferencia o área");
			option = scan.nextLine();
			
			if (option.contains("circunferencia"))
			{
				System.out.println("La circunferencia es: " + circ.calcularCircunferencia());
			}
			if (option.contains("area"))
			{
				System.out.println("El área es: " + circ.calcularArea());
			}
		}
	}
}
