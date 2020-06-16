package lecture9.assignment;

public class SecondLargetElement {

	public static int secondLargestElement(int arr[]) { 
		int i, first, second; 

		if (arr.length < 2) {  
			return Integer.MIN_VALUE; 
		} 

		first = second = Integer.MIN_VALUE; 
		for (i = 0; i < arr.length ; i++) { 
			if (arr[i] > first) { 
				second = first; 
				first = arr[i]; 
			} 
			
			else if (arr[i] > second && arr[i] != first) {
				second = arr[i]; 
			}
		} 
		
		return second;
	} 

	public static void main(String[] args) {
		
		int arr[] = {0};
		int value = secondLargestElement(arr);
		System.out.println(value);

	}

}
