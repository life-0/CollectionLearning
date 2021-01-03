package Set;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * 	TreeSet
 * 		1)TreeSet实现SortedSet接口, 可以对元素自然排序,	要求集合中的元素必须是可比较的
 * 			(1)在创建TreeSet时, 可以指定Comparator比较器
 * 			(2)如果没有指定Comparator比较器,	要求元素的类实现Comparable接口
 * 		2)TreeSet底层是TreeMap
 * 			向TreeSet添加元素,实际上是把该元素作为键添加到了底层的TreeMap中
 * 			TreeSet实际上就是TreeMap键的集合	
 * @author life-1
 * @project_name Collection
 * @type_name TreeSet
 * @creation_time 2019年6月7日 下午8:19:39
 */
public class TreeSetLearning {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//1)创建TreeSet集合,存储String,按字符串降序,指定Comparator比较器
		TreeSet<String>	treeSet=new TreeSet<>(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				
//				return o1.compareTo(o2);//升序
				return o2.compareTo(o1);//降序
			}
		});
		
		treeSet.add("jj");
		treeSet.add("aa");
		treeSet.add("ii");
		treeSet.add("zz");
		treeSet.add("dd");
		//打印集合,按字符串降序排序
		System.out.println(treeSet);//[zz, jj, ii, dd, aa]
		
		
		//2)创建TreeSet集合,如果没有指定Comparator比较器,	要求元素的类实现Comparable接口
		//TreeSet存储String类型字符串,String实现了Comparable接口
		TreeSet<String>	treeSet2=new TreeSet<>();
		treeSet2.addAll(treeSet);	//把treeSet2集合中的元素都添加到treeset2中
		System.out.println(treeSet2);//默认升序[aa, dd, ii, jj, zz]
		//如果换成降序，就要重写Compare()方法
		
	}

}
