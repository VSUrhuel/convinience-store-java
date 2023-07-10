public class Owner
{
	private Inventory storeInventory;
	private String name;
	private double money;

	public Owner(String name, double money, Inventory storeInventory)
	{
		this.name = name;
		this.money = money;
		this.storeInventory = storeInventory;
	}
	public boolean purchaseProduct(Product p)
	{
		if(p.getPrice() < this.money)
		{
			p.setIsPurchased(true);
			this.storeInventory.addProductInList(p);
			this.money -= p.getPrice();
			return true;
		}
		return false;
	}
	public void removeProductInStore(Product p)
	{
		this.storeInventory.removeProductInList(p);
	}
	public boolean restockProducts(Product a, int quantity)
	{
		for(Product product : this.storeInventory.getProducts())
		{
			if(product.equals(a))
			{
				product.setQuantity(product.getQuantity() + quantity);
				return true;
			}
		}
		return false;
	}
	public boolean removeExpiredProduct(Product p)
	{
		for(Product product : this.storeInventory.getProducts())
		{
			if(product.equals(p) && product.getIsExpired())
			{
				this.storeInventory.getExpiredProduct().add(p);
				this.storeInventory.removeProductInList(p);
				return true;
			}
		}
		return false;
	}
}