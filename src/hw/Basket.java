package hw;

import java.util.ArrayList;
import java.util.List;

enum Item {
	GIYIM (10),
	HAZIR_GIDA(5),
	TEMIZLIK(4),
	MANAV(3);
	
	private final int price;
	
	Item(final int price){
		this.price=price;
	}

	public int getPrice() {
		return price;
	}
}

public class Basket {
	
	private static List<Item> items=new ArrayList<Item>();
	private static  int totalPrice;
	
	public Basket() {
	}
	
		
	void addItem(Item item, int numberOfItem ) {
		for (int i = 0; i < numberOfItem; i++) {
			items.add(item);
		}
	}
	
	void removeItem(Item item, int numberOfItem ) {
		int nofItems=0;
		for (Item item2 : items) {
			if (item2==item) {
				nofItems++;
			}
		}
		
		
		for (int i = 0; i < numberOfItem; i++) {
			if (nofItems>=numberOfItem) {
				items.remove(item);
				nofItems--;
				numberOfItem--;
			}
		}
	}
	
	public int totalPrice() {
		
		for (Item item : items) {
			totalPrice+=item.getPrice();
		}
		return totalPrice;
	}
	
	public static void main(String[] args) {
		Basket b1=new Basket();
		Basket b2=new Basket();
		b1.addItem(Item.GIYIM, 2);
		b1.addItem(Item.MANAV, 3);
		int price = b1.totalPrice();
		System.out.println(price);
	}
}
