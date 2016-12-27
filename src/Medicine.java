

public class Medicine {
	public int id;
	public String name;
	public String stock;
	public String price;
	public String amount;

	@Override
	public String toString() {
		return  name + "数量:   "+amount+"价格: " + price;
	}
}
