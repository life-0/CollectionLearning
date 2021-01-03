package Test;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * 	1.	TreeSet要求元素是可比较的，TreeSet集合先看是否有Comparator比较器
 * 		如果没有Comparator比较器，再查找元素的类是否实现Comparable接口
 * 	2.	应如何选择Comparable还是Comparator？？
 * 			一般情况下，类实现Comparable接口定义一个默认的比较规则
 * 			可以通过Comparator定义很多不同的规则
 *	3.	在TreeSet集合中，判断是否同一个对象根据Comparator/Comparable的比较结果是否为0进行判断的
 *			如果若为0，就认为是同一个元素
 *
 * 	1)	创建Product产品类,包括名称，价格，数量三个字段
 * 	2)	创建TreeSet集合,存储Product产品，默认按价格升序排序，向集合中添加一些Product对象
 * 	3)	对TreeSet集合中的产品根据数量降序再次排序
 * @author life-1
 * @project_name Collection
 * @type_name Test04
 * @creation_time 2019年6月8日 下午12:33:50
 */
public class Test04 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		2)	创建TreeSet集合,存储Product产品，默认按价格升序排序，向集合中添加一些Product对象
		//在创建TreeSet集合时，可以指定Comparator比较器 
/*		TreeSet<Product>	set=new TreeSet<Product>(new Comparator<Product>() {

			@Override
			public int compare(Product o1, Product o2) {
				// TODO 自动生成的方法存根
				if(o1.getPrice()-o2.getPrice()>0) {
					return 1;
				}else if(o1.getPrice()-o2.getPrice()<0) {
					return -1;
				}else {
					return 0;
				}		
			}
		});*/
		
	//	如果在创建TreeSet集合时，没有指定Comparator比较器，要求元素的类实现Comparable接口
		//(如果指定Comparator比较器，并且实现Comparable接口，则会优先使用Comparable比较器)
		TreeSet<Product>	set=new TreeSet<>();
		set.add(new Product("旺旺雪饼",2.5,100));
		set.add(new Product("可乐",3.5,50));
		set.add(new Product("辣条",5,200));
		set.add(new Product("鸡爪",10.5,60));
		
		Iterator<Product> iterator = set.iterator();
		while (iterator.hasNext()) {
			Product product = (Product) iterator.next();
			System.out.println(product);
		}
	
		//注意：TreeSet集合不能存储重复的元素，即集合中如果已经存在该元素，不再添加
		//当前TreeSet集合根据数量，价格，名称比较，
		//如果两个Product对象的数量，价格，名称(其中一个)一样，就认为是同一个对象
		//现在集合中热狗的价格与旺旺雪饼一样,就认为对象一样
		Product hotdog=new Product("热狗", 2.5, 100);
		set.add(hotdog);
		System.out.println(set.size());
		System.out.println(set.contains(hotdog));//true
		
		Product	xx=new Product("红茶", 5.6, 60);
		set.add(xx);
		System.out.println(set.contains(xx));//true

		iterator = set.iterator();
		while (iterator.hasNext()) {
			Product product = (Product) iterator.next();
			System.out.println(product);
		}
		/*
			[name=辣条, price=5.0, amount=200]
			[name=旺旺雪饼, price=2.5, amount=100]
			[name=鸡爪, price=10.5, amount=60]
			[name=可乐, price=3.5, amount=50]

		说明新增的对象中的属性与set中的对象属性任一值相同, 则不能添加到TreeSet中
		*/

	}

}
