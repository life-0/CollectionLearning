package Test;

/**
 * Product��Ʒ��
 * @author life-1
 * @project_name Collection
 * @type_name Product
 * @creation_time 2019��6��8�� ����12:37:38
 */
//1)	����Product��Ʒ��,�������ƣ��۸����������ֶ�
public class Product	implements	Comparable<Product> {
	String	name;
	double	price;
	int		amount;

//	��дComparable�ӿڵĳ��󷽷�
	@Override
	public int compareTo(Product o) {
		// TODO �Զ����ɵķ������
		return o.amount-this.amount;	//������������,��������󷵻�����
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
