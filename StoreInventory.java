import java.util.*;
import java.time.*;
import java.time.format.*;
public class Inventory
{
	private ArrayList<Product> products;
	private ArrayList<Product> expiredProducts;
	private LocalDate currentDate;
	private int currentDateInInt;

	public StoreInventory()
	{
		this.products = new ArrayList<>();
		this.expiredProducts = new ArrayList<>();
		this.currentDate = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
		this.currentDateInInt = Integer.parseInt(currentDate.format(formatter));
		System.out.println(this.currentDateInInt);

	}
	public void addProduct(Product a)
	{
		this.products.add(a);
	}
	public boolean removeProduct(Product a)
	{
		for(Product product : products)
		{
			if(product.equals(a))
			{
				products.remove(a);
				return true;
			}
		}
		return false;
	}
	public boolean restockProducts(Product a, int quantity)
	{
		for(Product product : products)
		{
			if(product.equals(a))
			{
				product.setQuantity(product.getQuantity() + quantity);
				return true;
			}
		}
		return false;
	}
	public void removeExpiredProduct()
	{
		for(Product product : products)
		{
			if(product.getExpirationDuration() + product.getYearProduced() < this.currentDateInInt)
			{
				this.expiredProducts.add(product);
				removeProduct(product);
			}
		}
	}
	
	@Override
	public String toString()
	{
		String s = "";
		for(Product product : products)
		{
			s += product.toString();
		}
		return s;
	}
}