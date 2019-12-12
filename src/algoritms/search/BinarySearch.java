package algoritms.search;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int[] array= {3,7,11,34,23,8,5};
		Scanner in=new Scanner(System.in);
		System.out.println("please enter your search number: ");
		int searchInput=in.nextInt();
		System.out.println("index:"+ binarySearch(array,0,array.length-1, searchInput));
	}
	
	public static int binarySearch(int[] array, int start, int end, int inputSearch) {
		
		Arrays.sort(array);
		int middle=(start+end)/2;
		if (end<start) {
			return -1;
		}
		if (inputSearch == array[middle]) {
			  return middle;
			  }
		else if(inputSearch<array[middle]) {
				return binarySearch(array, start, middle-1, inputSearch);}
		else {
				return binarySearch(array, middle+1, end, inputSearch);
			}
	}

}
