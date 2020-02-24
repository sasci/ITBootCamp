package hw.supermarket;

public class Supermarket {
	public static void main(String[] args) {
		Basket basket=new Basket();
		
		Product p1=new Product("lettuce", 1, ProductType.GROCERY.getCode());
		Product p2 = new Product("Tursil", 5, ProductType.CLEANING.getCode());
		Product p3 = new Product("HeadPhone", 20, ProductType.ELECTRONIC.getCode());
		
		basket.getList().add(p1);
		basket.getList().add(p2);
		basket.getList().add(p3);
		
		int totalprice=0;
		for (Product product : basket.getList()) {
			totalprice+=product.getPrice();
			System.out.println(product.getName() +" : "+ product.getPrice());
		}
		
		System.out.println("Total price : "+totalprice);
	}
}
