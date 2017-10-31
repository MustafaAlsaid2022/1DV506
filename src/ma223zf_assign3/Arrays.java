package ma223zf_assign3;

public class Arrays {

	public static void main(String[] args) {
		int[] arr = { 6, 1, 2, 3, 4, 5 };
		int sum = sum(arr);
		System.out.println("sum of arr = " + sum);
		System.out.println("array = " + toString(arr));
		int[] newarray = addN(arr, 3);
		System.out.println("new array = " + toString(newarray));
		int[] reverseArray = reverse(arr);
		System.out.println("reverse array = " + toString(reverseArray));
		System.out.println("arr contains N " + hasN(arr, 2));
		replaceAll(arr, 1, 0);
		System.out.println("replaced array = " + toString(arr));
		int[] sortArray = sort(arr);
		System.out.println("sort array = " + toString(sortArray));
		int[] subArray = { 3, 4, 5 };
        if(hasSubsequence(arr,subArray)){
		System.out.println("The subsequence array is included in the original array");
        }
        else{
        	System.out.println("The subsequence array is not included in the original array");
        }
	}

	public static int sum(int[] arr) { // sum of arr array//
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}

	public static String toString(int[] arr) { // creating a string containing a
												// nice-looking print out of the
												// content of the array//
		StringBuilder str = new StringBuilder();
		for (int n : arr) {
			str.append("[");
			str.append(" " + n);
			str.append(" ]");
		}
		String st = str.toString();
		return st;
	}

	public static int[] addN(int[] arr, int n) { // create new array by add n to
													// each element of the
													// array//
		int[] newArray = new int[arr.length];
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = arr[i] + n;
		}
		return newArray;
	}

	public static int[] reverse(int[] arr) {
		int[] newArray = new int[arr.length]; // New array with same length
		for (int i = 0; i < arr.length; i++)
			newArray[i] = arr[arr.length - 1 - i]; // Insert in reverse order
		return newArray;
	}

	public static boolean hasN(int[] arr, int n) { // check if n is contained in
													// the array arr//
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				return true;
			}
		}
		return false;
	}

	public static void replaceAll(int[] arr, int old, int nw) { // replace all
																// occurrences
																// of old with
																// new in arr//
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == old) {
				arr[i] = nw;
			}
		}
	}

	public static int[] sort(int[] arr) { // create a new sorted array//
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

	public static boolean hasSubsequence(int[] arr, int[] sub) { // check if the
																	// sequence
																	// sub is a
																	// subsequence
																	// of array
																	// arr//
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			// System.out.println("value of arr["+i+"] = "+arr[i]);
			// System.out.println("value of subsequence["+counter+"] =
			// "+sub[counter]);
			if (arr[i] == sub[counter]) {
				if (counter == sub.length - 1) {
					return true;
				}
				counter++;
			}

		}

		return false;
	}

}