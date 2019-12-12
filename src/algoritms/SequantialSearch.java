package algoritms;

import java.util.Scanner;

public class SequantialSearch {

	public static void main(String[] args) {
		int[] array= {3,7,11,34,23,8,5};
		Scanner in=new Scanner(System.in);
		System.out.println("please enter your search number: ");
		int searchInput=in.nextInt();
		int index=seqSearch(array, searchInput);
		if (index<0) {
			System.out.println("Not Found"); 
		}else {
			System.out.println("Found at index "+ index);
		}
		in.close();
		
	}
	
	public static int seqSearch(int[] array, int searchInput) {
		int index=-1;
		int count=0;
		for (int i = 0; i < array.length; i++) {
			count++;
			if(array[i]==searchInput) {
				index=i;
				break;
						
			}
			
		}
		System.out.println("Count : "+count);
		return index;
		
	}
	
	

}
