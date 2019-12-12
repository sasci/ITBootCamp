package algoritms;

public class Methods {
public static void main(String[] args) {
	System.out.println(sum(5,4,7));
}

public static int sum(int...numbers) {
	int result=0;
	for(int number:numbers) {
		result+=number;
	}
	return result;
}
}
