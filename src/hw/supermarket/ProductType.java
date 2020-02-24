package hw.supermarket;

public enum ProductType {
	GROCERY(101),
	CLEANING(102),
	ELECTRONIC(103);
	
	private int code;
	
	private ProductType(int code) {
		this.code=code;
	}

	public int getCode() {
		return code;
	}
	
	
}
