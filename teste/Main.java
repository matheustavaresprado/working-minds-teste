package teste;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] array = {32, 47, 41, 7, 47, 9, 36, 32, 20, 15, 11, 9, 6, 37, 9, 39, 45, 29, 29, 19, 28, 21, 50, 19, 43};
		int min = 1;
		int max = 50;
		
		int[] missingNumbers = missingNumbers(array, min, max);
		
		printArray(missingNumbers);
	}

	private static int[] missingNumbers(int[] array, int min, int max) {
		int[] missingNumbers = new int[max-min];
		
		Arrays.sort(array);
		
		int j = 0;
		for(int i = min; i <= max; i++) {
			if(inArray(array, i)) {
				missingNumbers[j++] = i;
			}
		}
		
		return Arrays.copyOf(missingNumbers, j);
	}

	private static boolean inArray(int[] array, int number) {
		for(int i = 0; i < array.length; i++) {
			if(array[i] == number) {
				return false;
			}
		}
		return true;
	}
	
	private static void printArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
