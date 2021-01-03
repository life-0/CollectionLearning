package Collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * 	Collection迭代
 * @author life-1
 * @project_name Collection
 * @type_name CollectionIterator
 * @creation_time 2019年6月2日 下午3:19:55
 */
public abstract class CollectionIterator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//创建一个存储String字符串的Collection集合
		Collection<String>	collection1=new ArrayList<>();
		
		//添加数据
		collection1.add("dd");
		collection1.add("mm");
		collection1.add("dd");
		collection1.add("kk");
		collection1.add("vv");
		collection1.add("kk");
 		
		//迭代遍历集合的每个元素
		Iterator<String> iterator = collection1.iterator();//快捷键 Alt+Shift+L生成前面的
		/*
		 * 获得迭代器后，迭代有一个游标, 指向集合的第一个元素的前面
		 * hasNext()判断是否还有下一个元素
		 * next()返回下个元素,	游标下移
		*/
		while(iterator.hasNext()) {
			String Str=iterator.next();
			System.out.print(Str+"\t");
		}
		System.out.println();
		
		//Collection.remove()只能删除第一个匹配的元素
		collection1.remove("dd");
		System.out.println(collection1);//[mm, dd, kk, vv, kk]
		
		//删除集合中所有的kk，遍历集合中的元素，如果该元素为kk就要删除
		//iterator迭代器的游标,经过while循环后, 指向最后一个元素的后面,需要重新获得迭代器对象
		iterator=collection1.iterator();	//重新获得迭代器后,游标又指向集合第一个元素的前面
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			if("kk".equals(string)) {
				iterator.remove();	
//				collection1.remove("mm");//java.util.ConcurrentModificationException
			}
		}
		System.out.print(collection1);//[mm, dd, vv]
		/*
		 * 注意：当获得Iterator迭代器之后，如果通过Collection集合的add()/remove()/clear()等方法修改了集合的结构
		 * 再使用迭代器的next()方法返回下个元素时，可能会出现java.util.ConcurrentModificationException异常
		*/
		
		
	}

}
