public class Main{
	public static void main(String[] args){
		Product itemA =  new Product("Milk", 12.20, 10, 5, 2011);
		Product itemB =  new Product("Corn", 55.20, 15, 10, 2021);
		Product itemC =  new Product("Bread", 14.15, 1, 3, 2022);
		Inventory i = new Inventory();
		Owner rhuel = new Owner("rhuel", 50000, i);
		rhuel.purchaseProduct(itemA);
		rhuel.purchaseProduct(itemB);
		rhuel.purchaseProduct(itemC);
		i.getExpiredProduct();
		System.out.println(i.getProducts().toString());
		System.out.println(i.getExpiredProduct().toString());
		rhuel.restockProducts(itemB, 10);
		System.out.println(rhuel);
	}
}