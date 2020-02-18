package hw.linkedList;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class LinkedListRunner {

	public static void main(String[] args) {
		Set<Integer> set=new LinkedHashSet<>();
		try(Scanner scan=new Scanner(System.in)){
			int testNumber=scan.nextInt();
			
			for (int i = 0; i < testNumber; i++) {
				
				int testCase=scan.nextInt();
	
				for (int j = 0; j < testCase; j++) {
					String method=scan.next();
					if (method.equals("a")) {
						int number=Integer.parseInt(scan.next());
						set.add(number);
					}else if(method.equals("b")) {
						List<Integer> list=set.stream().sorted().collect(Collectors.toList());
						System.out.println(list);
					}else if (method.equals("c")) {
						int number=Integer.parseInt(scan.next());
						set.remove(number);
					}else if (method.equals("f"))  {
						System.out.println(set);
					}else {
						System.out.println("You entered undefined method symbol");
					}
				}
			}
		}catch(Exception e) {}
	}
}
