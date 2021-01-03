package ListTest;
	
/**
 * 	存储
 * @author life-1
 * @project_name Collection
 * @type_name Employment
 * @creation_time 2019年6月7日 上午11:29:10
 */
public class Employment {
	String	name;
	int		age;
	double	income;
	
	/**
	 * @param name
	 * @param age
	 * @param income
	 */
	public Employment(String name, int age, double income) {
		super();
		this.name = name;
		this.age = age;
		this.income = income;
	}
	
	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + ", income=" + income + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		long temp;
		temp = Double.doubleToLongBits(income);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Employment other = (Employment) obj;
		if (age != other.age)
			return false;
		if (Double.doubleToLongBits(income) != Double.doubleToLongBits(other.income))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
