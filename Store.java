public class Store
{
	private String name;
	private Owner owner;
	private Inventory i;

	public Store(String name, Owner owner, Inventory i)
	{
		this.name = name;
		this.owner = owner;
		this.i = i;
	}
}