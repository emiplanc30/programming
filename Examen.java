import java.util.Scanner;

public class Examen 
{
	private static final String String = null;

	public Examen()
	{
		String frase;
	}
	
	Scanner scan = new Scanner(System.in);
	
	public String primeraMayuscula()
	{
		System.out.println("Ingrese su frase: ");
		String frase = scan.nextLine();
		int length = frase.length();
		char firstChar = frase.charAt(0);
		char upperChar = Character.toUpperCase(firstChar);
		String deletFrase = frase.substring(1, length);
		String newFrase = upperChar + deletFrase;
		return newFrase;
	}
	
	public String invertirCadena()
	{
		System.out.println("Ingrese una frase: ");
		String frase = scan.nextLine();
		int length = frase.length();
		char[] letters = new char[length];
		for (int i = 0; i < length; i++)
		{
			letters[length - i - 1] = frase.charAt(i);
		}
		System.out.println("Tu frase al revés es: ");
		return String.copyValueOf(letters);
	}
	
	public String vocalesMayuscula()
	{
		    System.out.println("Ingresa una cadena de texto: ");
		    String frase = scan.nextLine();
		    int length = frase.length();
		    String newFrase = "";
		    
		    for (int i = 0; i < length; i++) 
		    {
		      char letter = frase.charAt(i);
		      if (letter == 'a' || letter == 'A' || letter == 'e' || letter ==  'E' || letter == 'i' || letter == 'I' || letter == 'o' || letter == 'O' || letter == 'u' || letter == 'U') 
		      {
		        newFrase += Character.toUpperCase(letter);
		      } 
		      else 
		      {
		        newFrase += letter;
		      }
		    }
		    
		    return newFrase;
	}
	
	public String fizzBuzz()
	{
		String fizz = "FIZZ";
		String buzz = "BUZZ";
		String fizzBuzz = "FIZZBUZZ";
		String fin = "fin del programa";
		
		for (int i = 1; i <= 100; i++)
		{
			if (i % 3 == 0)
			{
				System.out.println(fizz);
			}
			if (i % 5 == 0)
			{
				System.out.println(buzz);
			}
			if (i % 3 == 0 && i % 5 == 0)
			{
				System.out.println(fizzBuzz);
			}
			if (i % 3 != 0 && i % 5 != 0)
			{
				System.out.println(i);
			}
		}
		return fin;
	}
	
	public String palindromo()
	{
		System.out.println("Ingrese una palabra: ");
		System.out.println("(Recuerda que solo funciona con palabras, no frases)");
		String frase = scan.nextLine();
		String fin = ":)";
		int length = frase.length();
		int i = 0, t = 0;
		char[] normalFrase = new char[length];
		char[] backwardsFrase = new char[length];
		
		for (i = 0; i < length; i++)
		{
			normalFrase[i] = frase.charAt(i);
		}
		
		for (i = 0; i < length; i++)
		{
			backwardsFrase[length - i - 1] = frase.charAt(i);
		}
		
		for (i = 0; i < length; i++)
		{
			if (normalFrase[i] == backwardsFrase[i])
			{
				t++;
			}
		}
		if (t == length)
		{
			System.out.println("La palabra es un palíndromo. ");
		}
		else
		{
			System.out.println("La palabra NO es un palíndromo. ");
		}
		return fin;
		
	}


}

