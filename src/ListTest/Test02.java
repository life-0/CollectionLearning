package ListTest;

import java.beans.Encoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * 	定义一个List集合，存储employment员工类的信息
 * 	向集合中添加：
 * 				<lisi,18,5000>
 * 				<wangwu,28,9000>
 * 				<zhaoliu,38,8800>
 * 				<yanmingjie,35,10000>
 * 		1	在wangwu工人前面添加一个员工<feifei,28,6666>
 * 		2	删除zhaoliu
 * 		3	迭代遍历所有的员工信息	
 * 	注意：Collection集合存储是不分顺序的，因此无论是在指定位置添加，还删除都无法
 * @author life-1
 * @project_name Collection
 * @type_name StoreEmployment
 * @creation_time 2019年6月7日 上午11:05:30
 */
public class Test02 {
	public static void main(String [] args) {
		
		//集合添加类
		List<Employment>	list=new ArrayList<>();
		list.add(new Employment("lisi",18,5000));
		list.add(new Employment("wangwu",28,4500));
		list.add(new Employment("zhaoliu",38,8800));
		list.add(new Employment("yanmingjie",35,10000));
		
		//1)	在wangwu工人前面添加一个员工<feifei,28,6666>
		list.add(1,new Employment("feifei", 28, 6666));
			//(2)不能在迭代遍历过程中对集合进行修改，否则当再一次调用next(),就会出现混乱
		Iterator<Employment> iterator = list.iterator();
		while (iterator.hasNext()) {
			Employment employment = iterator.next();
				int index=list.indexOf(iterator);
				System.out.println(index);
		//		list.add(1, new Employment("22666", 15, 5000));
			}
		
		for (Employment employment : list) {
			System.out.println(employment);
		}
		
	
		//2)	删除zhaoliu
		list.remove(new Employment("zhaoliu",38,8800));
		
		//3)	迭代遍历所有的员工信息
		iterator = list.iterator();	//添加迭代器
		while (iterator.hasNext()) {
			Employment employment = (Employment) iterator.next();
			System.out.println(employment);
		}
		
		//另外：对员工的工资进行升序排序	拓展：JDK1.8
		list.sort(new Comparator<Employment>() {
		
			@Override
			public int compare(Employment o1, Employment o2) {
				//compare()方法 结果为：
				//			一个负整数，零，或一个正整数作为第一个参数小于，等于或大于第二个。 
				return (int)o1.income-(int)o2.income;
			}
		
		});
		System.out.println();
		for (Employment employment : list) {
			System.out.println(employment);
		}	
		
		//对员工的年龄进行降序排序	JDK1.6
		System.out.println();
		Collections.sort(list, new Comparator<Employment>() {

			@Override
			public int compare(Employment o1, Employment o2) {
				// TODO 自动生成的方法存根
				return o2.age-o1.age;
			}
			
		});
		for (Employment employment : list) {
			System.out.println(employment);
		}
	}	
}
