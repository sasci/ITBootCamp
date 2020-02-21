package hw.linkedList;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class LinkedListRunner {

	public static void main(String[] args) {
		runTestCases();
	}

	public static void runTestCases() {
		Set<Integer> set=new LinkedHashSet<>();
			
		try(Scanner scanner=new Scanner(System.in);) {
			System.out.println("Please enter number of test cases");
			int numberOfTestCase=scanner.nextInt();

			for (int i = 0; i < numberOfTestCase; i++) {
				set.clear();
				System.out.println("Please enter number of queries");
				int numberOfQueries=scanner.nextInt();
			
				for (int j = 0; j < numberOfQueries; j++) {
					char querySymbol=scanner.next().charAt(0);
					if (querySymbol=='a') {
						int number=scanner.nextInt();
						set.add(number);
					}
					else if (querySymbol=='b') {
						Set<Integer> treeSet=new TreeSet<>(set);
						treeSet.forEach(n->System.out.print(n+" "));
					}
					else if (querySymbol=='c') {
						int number=scanner.nextInt();
						set.remove(number);
					}
					else if (querySymbol=='d') {
						int number=scanner.nextInt();
						int isPresent=set.contains(number)?1:-1;
						System.out.print(isPresent+" ");
					}
					else if (querySymbol=='e') {
						System.out.println(set.size());
					}
					else if (querySymbol=='f') {
						for (Integer integer : set) {
							System.out.print(integer+" ");
						}
					}else {
						System.out.println("please enter correct query symbol");
					}
				}
			}
		}
		catch (Exception e) {
		}
	}
}
