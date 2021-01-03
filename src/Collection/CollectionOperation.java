package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 *	collection基本操作 
 * @author life-1
 * @project_name collection1
 * @type_name collection1Operation
 * @creation_time 2019年6月2日 上午10:45:38
 */
/*集合与数组的区别：
 * 	数组特点：大小固定，只能存储相同数据类型的数据
 *	集合特点：大小可动态扩展，可以存储各种类型的数据
 *
 *	对象多了用集合存，数据多了用数组存。
 *	数组是固定长度的，集合是可变长度的。
 *	集合是：只要是对象就可以存，不管是不是同一种对象
 *	而数组只能存储一种类型的对象
 * */
public class CollectionOperation {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//1)创建collection1集合
		//	collection1是一个接口, 需要赋值实现类对象
		Collection	collection1 =new ArrayList();
		
		//2)向集合中添加元素, 集合中添加引用类型数据，只要是Object类型对象就可以添加到集合中
		collection1.add("abc");
		collection1.add(462);	//添加基本数据类型时，系统会自动装箱为包装类对象在添加到集合中
		collection1.add(true);
		
		//3)在实际应用上, 一个集合中一般只存储一个类型的数据，可以通过泛型约束集合中元素的类型
		//	泛型：把数据类型作为参数传递
		Collection<String>	collection2=new ArrayList<>();//通过泛型约束集合只能存储String类型数据
		//向集合中添加数据
		collection2.add("2333333333");
		collection2.add("abc");
		collection2.add("张三");
		collection2.add("String");
		collection2.add("abc");
		//通过泛型约束collection2集合只能储存String,如果添加其他类型数据,就会编译错误
		//泛型的好处是：在编译时,可以进行对数据类型的检查
//		collection2.add(45);//类型 Collection<String> 中的方法 add（String）对于参数（int）不适用
		
		//4)直接 打印
		System.out.println(collection2);//[2333333333, abc, 张三, String, abc]
		/*	当前collection2引用指向的是ArrayList集合的对象
		 *	在调用println()方法时, 把conllection2变量值，即ArrayList对象的引用作为println()方法引用的实参
		 *	在println()方法打印对象时，调用Arraylist对象的toString()方法(继承的AbstractCollection类)
		*/
		
		//5)判断
		System.out.println(collection2.isEmpty());//false	//判断集合是否为空
		System.out.println(collection2.size());//4		//判断集合元素的总个数
		System.out.println(collection2.contains("dd"));//false 		//判断集合中是否包含"dd"字符串

		//6)删除
		collection2.remove("abc");		//只删除第一个匹配的元素
		System.out.println(collection2);//[2333333333, 张三, String, abc] 
		
		//7)转换为数组
		String [] s1=new String[collection2.size()];
		collection2.toArray(s1);
		System.out.println(Arrays.toString(s1));
		
		
		
		
	}

}
