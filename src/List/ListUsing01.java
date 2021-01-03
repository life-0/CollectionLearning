package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 	List���ϵĻ���ʹ��
 * @author life-1
 * @project_name Collection
 * @type_name ListUsing
 * @creation_time 2019��6��2�� ����4:18:42
 */
public class ListUsing01 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//1)����List����,List������һ���ӿ�,List�ӿ�������Ҫ��ֵʵ�������
		List<String> list=new ArrayList<>();
		
		//2)�������
		list.add("dd");
		list.add("jj");
		list.add("ff");
		list.add("gg");
		list.add("gg");
		list.add("gg");
		list.add("gg");
		
		//3)list�����������,���ظ���,��ӵ�������洢��˳��һ��
		System.out.println(list);//[dd, jj, ff, gg, gg, gg, gg]
		
		//4)�ж�
		System.out.println(list.size());
		System.out.println(list.contains("ff"));
		System.out.println(list.isEmpty());
		
		//5)ɾ��
		list.remove("gg");
		System.out.println(list);//[dd, jj, ff, gg, gg, gg]
		
		//6)����
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			if("gg".equals(string)){
				iterator.remove();//����ɾ��
			}
	}
		
		
		
		
	}

}
