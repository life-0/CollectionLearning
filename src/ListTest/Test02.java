package ListTest;

import java.beans.Encoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * 	����һ��List���ϣ��洢employmentԱ�������Ϣ
 * 	�򼯺�����ӣ�
 * 				<lisi,18,5000>
 * 				<wangwu,28,9000>
 * 				<zhaoliu,38,8800>
 * 				<yanmingjie,35,10000>
 * 		1	��wangwu����ǰ�����һ��Ա��<feifei,28,6666>
 * 		2	ɾ��zhaoliu
 * 		3	�����������е�Ա����Ϣ	
 * 	ע�⣺Collection���ϴ洢�ǲ���˳��ģ������������ָ��λ����ӣ���ɾ�����޷�
 * @author life-1
 * @project_name Collection
 * @type_name StoreEmployment
 * @creation_time 2019��6��7�� ����11:05:30
 */
public class Test02 {
	public static void main(String [] args) {
		
		//���������
		List<Employment>	list=new ArrayList<>();
		list.add(new Employment("lisi",18,5000));
		list.add(new Employment("wangwu",28,4500));
		list.add(new Employment("zhaoliu",38,8800));
		list.add(new Employment("yanmingjie",35,10000));
		
		//1)	��wangwu����ǰ�����һ��Ա��<feifei,28,6666>
		list.add(1,new Employment("feifei", 28, 6666));
			//(2)�����ڵ������������жԼ��Ͻ����޸ģ�������һ�ε���next(),�ͻ���ֻ���
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
		
	
		//2)	ɾ��zhaoliu
		list.remove(new Employment("zhaoliu",38,8800));
		
		//3)	�����������е�Ա����Ϣ
		iterator = list.iterator();	//��ӵ�����
		while (iterator.hasNext()) {
			Employment employment = (Employment) iterator.next();
			System.out.println(employment);
		}
		
		//���⣺��Ա���Ĺ��ʽ�����������	��չ��JDK1.8
		list.sort(new Comparator<Employment>() {
		
			@Override
			public int compare(Employment o1, Employment o2) {
				//compare()���� ���Ϊ��
				//			һ�����������㣬��һ����������Ϊ��һ������С�ڣ����ڻ���ڵڶ����� 
				return (int)o1.income-(int)o2.income;
			}
		
		});
		System.out.println();
		for (Employment employment : list) {
			System.out.println(employment);
		}	
		
		//��Ա����������н�������	JDK1.6
		System.out.println();
		Collections.sort(list, new Comparator<Employment>() {

			@Override
			public int compare(Employment o1, Employment o2) {
				// TODO �Զ����ɵķ������
				return o2.age-o1.age;
			}
			
		});
		for (Employment employment : list) {
			System.out.println(employment);
		}
	}	
}
