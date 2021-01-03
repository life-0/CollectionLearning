package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 *	collection�������� 
 * @author life-1
 * @project_name collection1
 * @type_name collection1Operation
 * @creation_time 2019��6��2�� ����10:45:38
 */
/*���������������
 * 	�����ص㣺��С�̶���ֻ�ܴ洢��ͬ�������͵�����
 *	�����ص㣺��С�ɶ�̬��չ�����Դ洢�������͵�����
 *
 *	��������ü��ϴ棬���ݶ���������档
 *	�����ǹ̶����ȵģ������ǿɱ䳤�ȵġ�
 *	�����ǣ�ֻҪ�Ƕ���Ϳ��Դ棬�����ǲ���ͬһ�ֶ���
 *	������ֻ�ܴ洢һ�����͵Ķ���
 * */
public class CollectionOperation {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//1)����collection1����
		//	collection1��һ���ӿ�, ��Ҫ��ֵʵ�������
		Collection	collection1 =new ArrayList();
		
		//2)�򼯺������Ԫ��, ��������������������ݣ�ֻҪ��Object���Ͷ���Ϳ�����ӵ�������
		collection1.add("abc");
		collection1.add(462);	//��ӻ�����������ʱ��ϵͳ���Զ�װ��Ϊ��װ���������ӵ�������
		collection1.add(true);
		
		//3)��ʵ��Ӧ����, һ��������һ��ֻ�洢һ�����͵����ݣ�����ͨ������Լ��������Ԫ�ص�����
		//	���ͣ�������������Ϊ��������
		Collection<String>	collection2=new ArrayList<>();//ͨ������Լ������ֻ�ܴ洢String��������
		//�򼯺����������
		collection2.add("2333333333");
		collection2.add("abc");
		collection2.add("����");
		collection2.add("String");
		collection2.add("abc");
		//ͨ������Լ��collection2����ֻ�ܴ���String,������������������,�ͻ�������
		//���͵ĺô��ǣ��ڱ���ʱ,���Խ��ж��������͵ļ��
//		collection2.add(45);//���� Collection<String> �еķ��� add��String�����ڲ�����int��������
		
		//4)ֱ�� ��ӡ
		System.out.println(collection2);//[2333333333, abc, ����, String, abc]
		/*	��ǰcollection2����ָ�����ArrayList���ϵĶ���
		 *	�ڵ���println()����ʱ, ��conllection2����ֵ����ArrayList�����������Ϊprintln()�������õ�ʵ��
		 *	��println()������ӡ����ʱ������Arraylist�����toString()����(�̳е�AbstractCollection��)
		*/
		
		//5)�ж�
		System.out.println(collection2.isEmpty());//false	//�жϼ����Ƿ�Ϊ��
		System.out.println(collection2.size());//4		//�жϼ���Ԫ�ص��ܸ���
		System.out.println(collection2.contains("dd"));//false 		//�жϼ������Ƿ����"dd"�ַ���

		//6)ɾ��
		collection2.remove("abc");		//ֻɾ����һ��ƥ���Ԫ��
		System.out.println(collection2);//[2333333333, ����, String, abc] 
		
		//7)ת��Ϊ����
		String [] s1=new String[collection2.size()];
		collection2.toArray(s1);
		System.out.println(Arrays.toString(s1));
		
		
		
		
	}

}
