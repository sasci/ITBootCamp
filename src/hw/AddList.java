package hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddList {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		System.out.println("Please enter 10 numbers :");
		try(Scanner s=new Scanner(System.in)) {
			for (int i = 0; i < 10; i++) {
				int number=Integer.parseInt(s.nextLine());
				if(!list.contains(number))
					list.add(number);
			}
		} catch (Exception e) {
		}
		list.stream()
		.filter(n->n%2==0)
		.forEach(a->System.out.print(a+" "));
	}
}
