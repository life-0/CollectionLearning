package Set;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * 	TreeSet
 * 		1)TreeSetʵ��SortedSet�ӿ�, ���Զ�Ԫ����Ȼ����,	Ҫ�󼯺��е�Ԫ�ر����ǿɱȽϵ�
 * 			(1)�ڴ���TreeSetʱ, ����ָ��Comparator�Ƚ���
 * 			(2)���û��ָ��Comparator�Ƚ���,	Ҫ��Ԫ�ص���ʵ��Comparable�ӿ�
 * 		2)TreeSet�ײ���TreeMap
 * 			��TreeSet���Ԫ��,ʵ�����ǰѸ�Ԫ����Ϊ����ӵ��˵ײ��TreeMap��
 * 			TreeSetʵ���Ͼ���TreeMap���ļ���	
 * @author life-1
 * @project_name Collection
 * @type_name TreeSet
 * @creation_time 2019��6��7�� ����8:19:39
 */
public class TreeSetLearning {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//1)����TreeSet����,�洢String,���ַ�������,ָ��Comparator�Ƚ���
		TreeSet<String>	treeSet=new TreeSet<>(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				
//				return o1.compareTo(o2);//����
				return o2.compareTo(o1);//����
			}
		});
		
		treeSet.add("jj");
		treeSet.add("aa");
		treeSet.add("ii");
		treeSet.add("zz");
		treeSet.add("dd");
		//��ӡ����,���ַ�����������
		System.out.println(treeSet);//[zz, jj, ii, dd, aa]
		
		
		//2)����TreeSet����,���û��ָ��Comparator�Ƚ���,	Ҫ��Ԫ�ص���ʵ��Comparable�ӿ�
		//TreeSet�洢String�����ַ���,Stringʵ����Comparable�ӿ�
		TreeSet<String>	treeSet2=new TreeSet<>();
		treeSet2.addAll(treeSet);	//��treeSet2�����е�Ԫ�ض���ӵ�treeset2��
		System.out.println(treeSet2);//Ĭ������[aa, dd, ii, jj, zz]
		//������ɽ��򣬾�Ҫ��дCompare()����
		
	}

}
