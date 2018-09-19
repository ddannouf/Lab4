import java.util.Arrays; 


public class Lab4{
	
	
	public static void main (String[] args)  
	{
		int[] array = {-1, 7, 4, -2, 5};
		sortArray(array);

	}

	public static void sortArray(int[] array)
	{
		int a = 0;
		for (int i  = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]){
					a = array[j];
					array[j] = array[i];
					array[i] = a;
				}
			}
		}
		
		for (int num : array){
			System.out.println(num);
		}
		
		
	}
}

			
					


