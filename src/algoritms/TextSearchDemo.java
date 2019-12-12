package algoritms;

import java.util.Scanner;

public class TextSearchDemo {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Please enter your sentence");
String phrase = scanner.nextLine();
System.out.println("your sentence is "+phrase);
System.out.println("Please enter your search word");
String search=scanner.nextLine();
System.out.println("your search text is:"+search);

if(search.length()>phrase.length()) {
	System.out.println("You can not search in a smaller phrase");
}
else {
	int count=0;
	int i=0;
	while(i <= phrase.length()-search.length()) {
		if(phrase.substring(i, i+search.length()).equals(search)) {
			count++;
		}
		i++;
	}
	System.out.println("Nmber of "+ search + "'s in phrase: " +count);
}

scanner.close();
	}

}
