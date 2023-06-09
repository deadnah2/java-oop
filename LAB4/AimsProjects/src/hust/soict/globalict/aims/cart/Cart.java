package hust.soict.globalict.aims.cart;


import java.util.ArrayList;
import hust.soict.globalict.aims.media.Media;

public class Cart {
	public static final int MAX_NUMBERS_ORDER =20;
	private	ArrayList<Media> itemsOrdered = new ArrayList<Media>() ;
	private int qtyOrdered=0;
	
	public int getNum_of_items() {
		return qtyOrdered;
	}
	
	public void addMedia(Media media) {
		if (qtyOrdered<	20)
			itemsOrdered.add(media);
			qtyOrdered+=1;
		}
	
	public void addMedia(Media... args) {
		for (Media media:args) {
			if (qtyOrdered<20) {
				itemsOrdered.add(media);
				qtyOrdered+=1;
			}else {
				break;
			}
		}
	}
	
	public void removeMedia(Media media) {
		if (itemsOrdered.contains(media)) {
				itemsOrdered.remove(media);
				qtyOrdered-=1;
			}
	}
	
	public float totalCost() {
		float cost=0;
		for (Media media : itemsOrdered) {
			cost+=media.getCost();
		}
		return cost;
	}
	
	public void print() {
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items: ");
		for (Media media : itemsOrdered) {
			System.out.println(media.toString());
		}
		System.out.println("Total cost: " + this.totalCost());
		System.out.println("***************************************************");
	}
	
	public Media search(int id) {
		for (Media media: itemsOrdered) {
			if (media.getId()==id){
				System.out.println(media.toString());
				return media;
			}
		}
		System.out.println("No match is found!");
		return null;
	}
	
	public Media search(String title) {
		for (Media media :itemsOrdered) {
			if (media.getTitle().equals(title)){
				return media;
			}
		}
		System.out.println("No match is found!");
		return null;
	}

	public ArrayList<Media> getItemsOrdered() {
		return itemsOrdered;
	}
	public void empty() {
		this.itemsOrdered = new ArrayList<Media>();
	}
}