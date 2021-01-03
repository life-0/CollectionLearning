package Test;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * 	1.	TreeSetҪ��Ԫ���ǿɱȽϵģ�TreeSet�����ȿ��Ƿ���Comparator�Ƚ���
 * 		���û��Comparator�Ƚ������ٲ���Ԫ�ص����Ƿ�ʵ��Comparable�ӿ�
 * 	2.	Ӧ���ѡ��Comparable����Comparator����
 * 			һ������£���ʵ��Comparable�ӿڶ���һ��Ĭ�ϵıȽϹ���
 * 			����ͨ��Comparator����ܶ಻ͬ�Ĺ���
 *	3.	��TreeSet�����У��ж��Ƿ�ͬһ���������Comparator/Comparable�ıȽϽ���Ƿ�Ϊ0�����жϵ�
 *			�����Ϊ0������Ϊ��ͬһ��Ԫ��
 *
 * 	1)	����Product��Ʒ��,�������ƣ��۸����������ֶ�
 * 	2)	����TreeSet����,�洢Product��Ʒ��Ĭ�ϰ��۸����������򼯺������һЩProduct����
 * 	3)	��TreeSet�����еĲ�Ʒ�������������ٴ�����
 * @author life-1
 * @project_name Collection
 * @type_name Test04
 * @creation_time 2019��6��8�� ����12:33:50
 */
public class Test04 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
//		2)	����TreeSet����,�洢Product��Ʒ��Ĭ�ϰ��۸����������򼯺������һЩProduct����
		//�ڴ���TreeSet����ʱ������ָ��Comparator�Ƚ��� 
/*		TreeSet<Product>	set=new TreeSet<Product>(new Comparator<Product>() {

			@Override
			public int compare(Product o1, Product o2) {
				// TODO �Զ����ɵķ������
				if(o1.getPrice()-o2.getPrice()>0) {
					return 1;
				}else if(o1.getPrice()-o2.getPrice()<0) {
					return -1;
				}else {
					return 0;
				}		
			}
		});*/
		
	//	����ڴ���TreeSet����ʱ��û��ָ��Comparator�Ƚ�����Ҫ��Ԫ�ص���ʵ��Comparable�ӿ�
		//(���ָ��Comparator�Ƚ���������ʵ��Comparable�ӿڣ��������ʹ��Comparable�Ƚ���)
		TreeSet<Product>	set=new TreeSet<>();
		set.add(new Product("����ѩ��",2.5,100));
		set.add(new Product("����",3.5,50));
		set.add(new Product("����",5,200));
		set.add(new Product("��צ",10.5,60));
		
		Iterator<Product> iterator = set.iterator();
		while (iterator.hasNext()) {
			Product product = (Product) iterator.next();
			System.out.println(product);
		}
	
		//ע�⣺TreeSet���ϲ��ܴ洢�ظ���Ԫ�أ�������������Ѿ����ڸ�Ԫ�أ��������
		//��ǰTreeSet���ϸ����������۸����ƱȽϣ�
		//�������Product������������۸�����(����һ��)һ��������Ϊ��ͬһ������
		//���ڼ������ȹ��ļ۸�������ѩ��һ��,����Ϊ����һ��
		Product hotdog=new Product("�ȹ�", 2.5, 100);
		set.add(hotdog);
		System.out.println(set.size());
		System.out.println(set.contains(hotdog));//true
		
		Product	xx=new Product("���", 5.6, 60);
		set.add(xx);
		System.out.println(set.contains(xx));//true

		iterator = set.iterator();
		while (iterator.hasNext()) {
			Product product = (Product) iterator.next();
			System.out.println(product);
		}
		/*
			[name=����, price=5.0, amount=200]
			[name=����ѩ��, price=2.5, amount=100]
			[name=��צ, price=10.5, amount=60]
			[name=����, price=3.5, amount=50]

		˵�������Ķ����е�������set�еĶ���������һֵ��ͬ, ������ӵ�TreeSet��
		*/

	}

}
