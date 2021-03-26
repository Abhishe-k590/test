package programs;

public class Bubblesort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 20, 30, 40, 10 };
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}

			}
		}
		System.out.println("first max number "+arr[0]);
		System.out.println("Second max number "+arr[1]);
		 
	}
}