package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 	List集合的基本使用
 * @author life-1
 * @project_name Collection
 * @type_name ListUsing
 * @creation_time 2019年6月2日 下午4:18:42
 */
public class ListUsing01 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//1)创建List集合,List集合是一个接口,List接口引用需要赋值实现类对象
		List<String> list=new ArrayList<>();
		
		//2)添加数据
		list.add("dd");
		list.add("jj");
		list.add("ff");
		list.add("gg");
		list.add("gg");
		list.add("gg");
		list.add("gg");
		
		//3)list集合是有序的,可重复的,添加的数据与存储的顺序一致
		System.out.println(list);//[dd, jj, ff, gg, gg, gg, gg]
		
		//4)判断
		System.out.println(list.size());
		System.out.println(list.contains("ff"));
		System.out.println(list.isEmpty());
		
		//5)删除
		list.remove("gg");
		System.out.println(list);//[dd, jj, ff, gg, gg, gg]
		
		//6)迭代
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			if("gg".equals(string)){
				iterator.remove();//迭代删除
			}
	}
		
		
		
		
	}

}
