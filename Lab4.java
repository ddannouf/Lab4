import java.util.Arrays; 


public class Lab4{
	
	
	public static void main (String[] args)  
	{
		int[] array1 = {32, 33, 34, 65, 21};
		int[] array2 = null;	
		int[] array3 = {0,0,0,0,0};
		int[] array4 = {};
		int[] array5 = {-1, 7, 4, -2, 5};
		
		System.out.println("Array 1");
		sortArray(array1);
		
		try {
			System.out.println("Array 2");
			sortArray(array2);
		}
		
		catch (NullPointerException ex){
			System.out.println("Can't be null");
		}
		
		System.out.println("Array 3");
		sortArray(array3);
		
		System.out.println("Array 4");
		sortArray(array4);
		
		System.out.println("Array 5");
		sortArray(array5);

	}

	public static void sortArray(int[] arr)
	{
		int [] b  = arr;
		int a = 0;
		for (int i  = 0; i < b.length - 1; i++) {
			for (int j = i + 1; j < b.length; j++) {
				if (b[i] < b[j]){
					a = b[j];
					b[j] = b[i];
					b[i] = a;
				}
			}
		}
		
		for (int num : b){
			System.out.println(num);
		}
		
		
	}
}

			
					


