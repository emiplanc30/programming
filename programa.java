
public class programa {

	public static void main(String[] args) 
	{
		Estudiante student = new Estudiante();
		
		int[] array = new int[15];
		String[] arrayNames = new String[20];
		Estudiante[] estudiante = new Estudiante[100];
		
		array[11] = 5;
		
		int[] otro = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 3, 2, 1, 1, 1 };
		
		arrayNames[0] = "Francisco";
		arrayNames[10] = "Ivan";
		arrayNames[12] = "Diego";

		student.eliminarNombre(arrayNames);
		
	}

}
