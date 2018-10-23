/*****
 * 
 * @author include
 *
 */
class Phone implements Commodity{
	private String name;
	private int amount;
	private double price;
	public Phone(String name, int amount, double price) {
		super();
		this.name = name;
		this.amount = amount;
		this.price = price;
	}
	@Override
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
};
