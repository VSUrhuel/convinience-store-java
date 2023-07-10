import java.util.*;
import java.time.*;
import java.time.format.*;
public class Inventory
{
	private ArrayList<Product> products;
	private ArrayList<Product> expiredProducts;
	private LocalDate currentDate;
	private int currentDateInInt;

	public Inventory()
	{
		this.products = new ArrayList<>();
		this.expiredProducts = new ArrayList<>();
		this.currentDate = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy");
		this.currentDateInInt = Integer.parseInt(currentDate.format(formatter));
	}
	public void addProductInList(Product a)
	{
		if(a.getIsPurchased())
		{
			this.products.add(a);
		}
	}
	public boolean removeProductInList(Product a)
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
	public ArrayList<Product> getExpiredProduct()
	{
		ArrayList<Product> l = new ArrayList<>();
		for(Product product : products)
		{
			if((product.getExpirationDuration() + product.getYearProduced()) < this.currentDateInInt)
			{
				product.setIsExpired(true);
				l.add(product);
			}
		}
		return l;

	}
	public ArrayList<Product> getProducts()
	{
		return this.products;
	}
	public ArrayList<Product> getExpiredProducts()
	{
		return this.expiredProducts;
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