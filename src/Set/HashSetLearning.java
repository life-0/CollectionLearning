package Set;

import java.util.HashSet;

/**
 * 	HashSet
 * 		1)	HashSet的底层是HsahMap
 * 		2)	向Hashset中添加元素,实际上把该元素作为键添加到底层的HashMap中
 * 		3)	HashSet就是HashMap键的集合
 * @author life-1
 * @project_name Collection
 * @type_name HashSetLearning
 * @creation_time 2019年6月7日 下午8:08:30
 */
public class HashSetLearning {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		HashSet<String>	hashset=new HashSet<>();
		hashset.add("bb");
		hashset.add("DD");
	}

}
