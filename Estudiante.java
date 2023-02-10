import java.lang.reflect.Array;
import java.util.Scanner;

public class Estudiante 
{
	public Estudiante()
	{
		int ID = 177478;
		String nombre = "Emiliano";
	}
	
	public void imprimirIntArray(int[] array)
	{
		int i;
		for (i = 0; i < 15; i++)
		{
			System.out.println(array[i]);
		}
	}
	
	public void imprimirStringArray(String[] array)
	{
		int i;
		for (i = 0; i < 20; i++)
		{
			System.out.println(array[i]);
		}
	}
	
	public void imprimirEstudiante(Estudiante[] student)
	{
		int i;
		for (i = 0; i < 100; i++)
		{
			System.out.println(student[i]);
		}
	}
	
	Scanner scan = new Scanner(System.in);
	
	public int buscarValor(int[] array, int n)
	{
		int casilla = -1;
		int i;
		// System.out.println("¿Qué valor busca? ");
		
		for (i = 0; i < 15; i++)
		{
			if (n == array[i])
			{
				casilla = i;
				break;
			}
		}
		
		return casilla;
	}
	
	public int buscarNombre(String[] array, String nombre)
	{
		int nombreLugar = -1;
		int i;
		// System.out.println("¿Qué nombre está buscando?");
		// String nombre = scan.nextLine();
		// String nombre = scan.next

		
		for (i = 0; i < 20; i++)
		{
			if (nombre == array[i])
			{
				nombreLugar = i;
			}
		}
		
		return nombreLugar;
	}
	
	public Estudiante buscarEstudiante(Estudiante[] array)
	{
		Estudiante student = null;
		int i;
		System.out.println("¿Qué número de estudiante quiere buscar?");
		int estudiante = scan.nextInt();
		for (i = 0; i < 100; i++)
		{
			if (estudiante == i)
			{
				student = array[i];
			}
		}
		return student;
	}
	
	public void eliminarValorInt(int[] array)
	{
		int i = 0;
		int j = 0;
		int t = 0;
		int length = 15;
		System.out.println("¿Qué valor desea borrar?");
		int sc = scan.nextInt();
		scan.nextLine();
		
		int n = buscarValor(array, sc);
		
		while (n != -1)
		{
			t++;
			for (i = n; i < length - t; i++)
			{
				array[i] = array[i+1];
			}
			
			for (j = i; j < length; j++)
			{
				array[j] = 0;
			}
			
			n = buscarValor(array, sc);
		}
		
		imprimirIntArray(array);
	}
	
	public void eliminarNombre(String[] array)
	{
		int i = 0;
		int j = 0;
		int t = 0;
		int length = 20;
		String[] newArray = new String[20];
		System.out.println("¿Qué nombre desea borrar?");
		String sc = scan.nextLine();
		scan.next();
		
		int n = buscarNombre(array, sc);
		
		for (i = 0; i < length; i++)
		{
			newArray[i] = array[i];
		}
		
		while (n != -1)
		{
			t++;
			for (i = n; i < length - t; i++)
			{
				newArray[i] = newArray[i+1];
			}
			
			for (j = i; j < length; j++)
			{
				newArray[j] = null;
			}
			
			n = buscarNombre(array, sc);
		}
		
		imprimirStringArray(newArray);
	}
}

