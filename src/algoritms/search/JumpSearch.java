package algoritms.search;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class JumpSearch {

	public static void main(String[] args) {
		int[] array = { 33, 34, 11, 12, 35, 5, 7, 8, 45, 56, 1, 2, 3,  9, 15, 23, 23, 67 };
		Scanner in = new Scanner(System.in);
		System.out.println("please enter your search number: ");
		int key = in.nextInt();
		Arrays.sort(array);
		System.out.println("index:" + jumpSearch(array, 0, key));
		in.close();
	}

	public static int jumpSearch(int[] array, int start, int key) {
		
		int index = -1;
		int jump = Math.round((float) Math.sqrt(array.length - 1));
		if (start < array.length) {

			if (array[start] == key) {
				index = start;
			} else if (array[start] < key) {
				start += jump;
				return jumpSearch(array, start, key);
			} else if (array[start] > key) {
				for (int i = start; i >= 0; i--) {
					if (key == array[i]) {
						index = i;
						break;
					}
				}
			}
		}
		return index;
	}

}
