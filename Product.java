public class Product
{
	private String name;
	private double price;
	private int quantity;
	private int expirationDuration;
	private int yearProduced;
	private boolean isExpired;
	private boolean isPurchased;

	public Product(String name, double price, int quantity, int expirationDuration, int yearProduced){
		this.name = name;
		this.yearProduced = yearProduced;
		setPrice(price);
		setQuantity(quantity);
		setExpirationDuration(expirationDuration);
		this.isExpired = false;
		this.isPurchased = false;
	}

	public double getPrice(){
		return this.price;
	}
	public int getQuantity(){
		return this.quantity;
	}
	public int getExpirationDuration(){
		return this.expirationDuration;
	}
	public void setPrice(double price){
		this.price = (price > 0) ? price : 0;
	}
	public void setQuantity(int quantity){
		this.quantity = (quantity > 0) ? quantity : 0;
	}
	public void setExpirationDuration(int expirationDuration){
		this.expirationDuration = (expirationDuration > 0) ? expirationDuration : 0;
	}
	public int getYearProduced()
	{
		return this.yearProduced;
	}
	public String getName()
	{
		return this.name;
	}
	public boolean getIsExpired()
	{
		return this.isExpired;
	}
	public void setIsExpired(boolean s)
	{
		this.isExpired = s;
	}
	public boolean getIsPurchased()
	{
		return this.isPurchased;
	}
	public void setIsPurchased(boolean s)
	{
		this.isPurchased = s;
	}
	@Override
	public boolean equals(Object obj)
	{
		return (obj instanceof Product) ? ((((Product)obj).getName().equals(this.name)) ? true : false) : false;
	}
	@Override
	public String toString(){
		return "Name: " + this.name + " | Price: " + this.price + " | Quantity: " + this.quantity + " | Expiration Duration: " + this.expirationDuration + ".\n";
	}
}