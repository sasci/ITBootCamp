package algoritms;

public class SortAlgoritms {
	public static void main(String[] args) {
		int[] a= {3,5,6,7,83,2,1};
		//bubbleSort(a);
		//selectionSort(a);
		insertionSort(a);
	}
	
	private static void insertionSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int key=array[i];
			int j =i-1;
			while (j >= 0 && array[j]>key) {
				array[j+1]=array[j];
				j--;
			}
			array[j+1]=key;
		}
		printArray(array);
	}
	
	private static void printArray(int[] array) {
		for(int e:array) {
			System.out.print(e+" ");
		}
	}
	
	private static void selectionSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int min=i;
			for (int j = i+1; j < array.length; j++) {
				if (array[min] > array[j]) {
					min=j;
					swap(min, i, array);
				}
				
			}
		}
		printArray(array);
	}


	private static void bubbleSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					swap(j, j + 1, array);
				}
			}
		}
		printArray(array);
	}

	
	
	private static void swap(int i,int j,int[] array) {
		int temp=array[i];
		array[i]=array[j];
		array[j]=temp;
	}
}
