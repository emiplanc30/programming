import java.util.Scanner;

public class program_scan 
{

	public static void main(String[] args) 
	{
		
		
		Circulo circ = new Circulo();
		Cuadrado cuad = new Cuadrado();
		String figura, option;
		
		Scanner scan = new Scanner(System.in);
		while (true)
		{
			System.out.println("Escoga una figura u opción: 1. cuadrado, 2. círculo, ó 3. terminar.");
			int opt = Integer.parseInt(scan.nextLine());
			switch (opt)
			{
			case 1:
				System.out.println("¿Cuánto mide el lado del cuadrado?");
				int lado = Integer.parseInt(scan.nextLine());
				cuad.cambiarLongitud(lado);
				System.out.println("¿Qué desea obtener? (ingrese el número de la opción): ");
				System.out.println("1. perímetro, 2. área, 3. diagonal, ó 4. regresar.");
				int optCuad = Integer.parseInt(scan.nextLine());
				if (optCuad == 1)
				{
					System.out.println("El perímetro es: " + cuad.calcularPerimetro());
				}
				if (optCuad == 2)
				{
					System.out.println("El área es: " + cuad.calcularArea());
				}
				if (optCuad == 3)
				{
					System.out.println("La diagonal es: " + cuad.calcularDiagonal());
				}
				if (optCuad == 4)
				{
					System.out.println("Regresando... ");
					continue;
				}
				break;
				
			case 2:
				System.out.println("¿Cuánto mide el radio?");
				int radio = Integer.parseInt(scan.nextLine());
				circ.cambiarRadio(radio);
				System.out.println("¿Qué desea obtener? (ingrese el número de la opción): ");
				System.out.println("1. circunferencia, 2. área ó 3. regresar.");
				int optCirc = Integer.parseInt(scan.nextLine());
				if (optCirc == 1)
				{
					System.out.println("La circunferencia es: " + circ.calcularCircunferencia());
				}
				if (optCirc == 2)
				{
					System.out.println("El área es: " + circ.calcularArea());
				}
				if (optCirc == 3)
				{
					System.out.println("Regresando... ");
					continue;
				}
				break;
				
			case 3:
				System.out.println("Terminando... ");
				System.exit(0);
				break;
				
			default:
				System.out.println("Opción inválida... escoga otra opción.");
				break;
			}
		}
	}
}