package Find;

public class ArrayAscendingOrder {
	public static void main(String[] args) throws Exception {

		int[] arr = { 4, 5, 2, 1, 6, 7 };

		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}