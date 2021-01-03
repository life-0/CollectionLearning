package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *	Set集合 
 * @author life-1
 * @project_name Collection
 * @type_name SetLearning
 * @creation_time 2019年6月7日 下午7:54:35
 */
public class SetLearning {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//1)	创建Set集合
		Set<String>	set=new HashSet<>();
		//2)	添加元素
		set.add("HH");
		set.add("XX");
		set.add("78954");
		set.add("MM");
		set.add("KK");
		
		//3)	直接打印，存储顺序与添加顺序可能不一样
		System.out.println(set);//[HH, XX, MM, KK, 78954]
		
		//4)	添加重复的数据,无法添加重复的数据
		set.add("XX");
		set.add("KK");
		System.out.println(set);//[HH, XX, MM, KK, 78954]
		
		//5)	迭代
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String string = iterator.next();
			System.out.print(string+"\t");//HH	XX	MM	KK	78954
		}
		
	}

}
