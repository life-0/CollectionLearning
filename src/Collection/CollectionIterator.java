package Collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * 	Collection����
 * @author life-1
 * @project_name Collection
 * @type_name CollectionIterator
 * @creation_time 2019��6��2�� ����3:19:55
 */
public abstract class CollectionIterator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//����һ���洢String�ַ�����Collection����
		Collection<String>	collection1=new ArrayList<>();
		
		//�������
		collection1.add("dd");
		collection1.add("mm");
		collection1.add("dd");
		collection1.add("kk");
		collection1.add("vv");
		collection1.add("kk");
 		
		//�����������ϵ�ÿ��Ԫ��
		Iterator<String> iterator = collection1.iterator();//��ݼ� Alt+Shift+L����ǰ���
		/*
		 * ��õ������󣬵�����һ���α�, ָ�򼯺ϵĵ�һ��Ԫ�ص�ǰ��
		 * hasNext()�ж��Ƿ�����һ��Ԫ��
		 * next()�����¸�Ԫ��,	�α�����
		*/
		while(iterator.hasNext()) {
			String Str=iterator.next();
			System.out.print(Str+"\t");
		}
		System.out.println();
		
		//Collection.remove()ֻ��ɾ����һ��ƥ���Ԫ��
		collection1.remove("dd");
		System.out.println(collection1);//[mm, dd, kk, vv, kk]
		
		//ɾ�����������е�kk�����������е�Ԫ�أ������Ԫ��Ϊkk��Ҫɾ��
		//iterator���������α�,����whileѭ����, ָ�����һ��Ԫ�صĺ���,��Ҫ���»�õ���������
		iterator=collection1.iterator();	//���»�õ�������,�α���ָ�򼯺ϵ�һ��Ԫ�ص�ǰ��
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			if("kk".equals(string)) {
				iterator.remove();	
//				collection1.remove("mm");//java.util.ConcurrentModificationException
			}
		}
		System.out.print(collection1);//[mm, dd, vv]
		/*
		 * ע�⣺�����Iterator������֮�����ͨ��Collection���ϵ�add()/remove()/clear()�ȷ����޸��˼��ϵĽṹ
		 * ��ʹ�õ�������next()���������¸�Ԫ��ʱ�����ܻ����java.util.ConcurrentModificationException�쳣
		*/
		
		
	}

}
