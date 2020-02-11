package hw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

enum Item {
	GIYIM (10),
	HAZIR_GIDA(5),
	TEMIZLIK(4),
	MANAV(3);
	
	private final int price;
	

	private Item(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}
	
}

public class Basket {
	private List<Item> items;
	private static int totalPrice=0;
	
	public Basket() {
		this.items=new ArrayList<Item>();
	}
		
	public void addItem(Item item, int numberOfItem ) {
		for (int i = 0; i < numberOfItem; i++) {
			items.add(item);
			totalPrice+=item.getPrice();
		}
	}
	
	public void removeItem(Item item, int numberOfItem ) {
		
		int nofItemsInList=0;
		for (Item item2 : items) {
			if (item2==item) {
				nofItemsInList++;
			}
		}
		int nOfRemoved=numberOfItem;
		for (int i = 0; i < nOfRemoved; i++) {
			if (nofItemsInList>=numberOfItem) {
				items.remove(item);
				nofItemsInList--;
				numberOfItem--;
				totalPrice-=item.getPrice();
			}
		}
	}
	
	public int totalPrice() {
		return totalPrice;
	}
	
	public static void main(String[] args) {
		Basket b1=new Basket();
		Basket b2=new Basket();
		b1.addItem(Item.GIYIM, 2);
		b1.addItem(Item.MANAV, 3);
		int price = b1.totalPrice();
		System.out.println(price);
		b1.removeItem(Item.MANAV, 3);
		System.out.println(b1.totalPrice());
	}
}
