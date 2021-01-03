package Test;

/**
 * Product产品类
 * @author life-1
 * @project_name Collection
 * @type_name Product
 * @creation_time 2019年6月8日 下午12:37:38
 */
//1)	创建Product产品类,包括名称，价格，数量三个字段
public class Product	implements	Comparable<Product> {
	String	name;
	double	price;
	int		amount;

//	重写Comparable接口的抽象方法
	@Override
	public int compareTo(Product o) {
		// TODO 自动生成的方法存根
		return o.amount-this.amount;	//根据数量降序,参数对象大返回整数
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (amount != other.amount)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}
	/**
	 * @param name
	 * @param price
	 * @param amount
	 */
	public Product(String name, double price, int amount) {
		super();
		this.name = name;
		this.price = price;
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "[name=" + name + ", price=" + price + ", amount=" + amount + "]";
	}
	
	
	
}
