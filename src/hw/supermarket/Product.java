package hw.supermarket;

public class Product {
	private String name;
	private int price;
	private int productCode;
//	private ProductType productType;

	public Product(String name, int price, int productCode) {
		this.name = name;
		this.price = price;
		this.productCode = productCode;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public int getProductCode() {
		return productCode;
	}

	@Override
	public String toString() {
		return "Product name : " + name + " price : " + price;
	}

}
