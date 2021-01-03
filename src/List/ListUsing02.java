package List;

import java.util.ArrayList;
import java.util.List;

/**
 *	List集合为每个元素指定了一个索引值,主要增加了对索引值的操作 
 * @author life-1
 * @project_name Collection
 * @type_name ListUsing02
 * @creation_time 2019年6月2日 下午4:36:18
 */
public class ListUsing02 {

	public static <E> void main(String[] args) {
		// TODO 自动生成的方法存根
		//1)创建List集合,集合中存储String对象
		List<String> list=new ArrayList<>();
		
		//2)添加数据
		list.add("abc");
		list.add("eee");
		list.add("&&");
		list.add("45");
		list.add("&&");
				
		//3)可以在指定的索引值添加数据
		list.add(0,"ABC");
		System.out.println(list);//[ABC, abc, eee, 45, &&]
		
		list.add(list.size(),"YY");
		System.out.println(list);//[ABC, abc, eee, 45, &&, YY]
		
		//4)删除指定位置的元素
		list.remove(1);	//其索引值与数组下标相同
		System.out.println(list);//[ABC, eee, &&, 45, &&, YY]
		
		//5)返回元素第一次出现的位置
		System.out.println(list.indexOf("&&"));//2
		System.out.println(list.lastIndexOf("&&"));//4
		
		//6)返回指定位置的元素
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+"\t");//ABC	eee	45	&&	&&	YY
		}
		
	}

}
