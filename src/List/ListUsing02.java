package List;

import java.util.ArrayList;
import java.util.List;

/**
 *	List����Ϊÿ��Ԫ��ָ����һ������ֵ,��Ҫ�����˶�����ֵ�Ĳ��� 
 * @author life-1
 * @project_name Collection
 * @type_name ListUsing02
 * @creation_time 2019��6��2�� ����4:36:18
 */
public class ListUsing02 {

	public static <E> void main(String[] args) {
		// TODO �Զ����ɵķ������
		//1)����List����,�����д洢String����
		List<String> list=new ArrayList<>();
		
		//2)�������
		list.add("abc");
		list.add("eee");
		list.add("&&");
		list.add("45");
		list.add("&&");
				
		//3)������ָ��������ֵ�������
		list.add(0,"ABC");
		System.out.println(list);//[ABC, abc, eee, 45, &&]
		
		list.add(list.size(),"YY");
		System.out.println(list);//[ABC, abc, eee, 45, &&, YY]
		
		//4)ɾ��ָ��λ�õ�Ԫ��
		list.remove(1);	//������ֵ�������±���ͬ
		System.out.println(list);//[ABC, eee, &&, 45, &&, YY]
		
		//5)����Ԫ�ص�һ�γ��ֵ�λ��
		System.out.println(list.indexOf("&&"));//2
		System.out.println(list.lastIndexOf("&&"));//4
		
		//6)����ָ��λ�õ�Ԫ��
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+"\t");//ABC	eee	45	&&	&&	YY
		}
		
	}

}
