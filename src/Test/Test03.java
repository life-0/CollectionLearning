package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * ���ַ���:"01,�¸�,100;02,�Ÿ�,9;03,����,91;04,�Ʒ�,56;05,���,60" 
 * 1)���ַ����е�ѧ����Ϣ�������
 *  01,�¸�,100 
 *  02,�Ÿ�,95
 *  ... ����Ϊ��ѧ�ţ��������ɼ� 
 * 2)����List����,���ݷ��������ѧ����Ϣ����ѧ�������,��ӵ�List������
 * 3)ͨ�������ֱ��ӡ�����е�ѧ����Ϣ 
 * 4)�жϼ������Ƿ���� ����Ϊ"����"��ѧ��
 * 5)�Լ����е�ѧ�����ɼ��������� 
 * 6)ͨ��ѭ����ӡ������ѧ������Ϣ
 * 7)ɾ������Ϊ"����"��ѧ�� 
 * 8)ͨ��foreachѭ����ӡ������ѧ������Ϣ
 * 
 * @author life-1
 * @project_name Collection
 * @type_name Test03
 * @creation_time 2019��6��7�� ����9:48:32
 */
public class Test03 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		// 1)���ַ����е�ѧ����Ϣ�������
		String text = "01,�¸磬100;02,�Ÿ�,99;03,����,91;04,�Ʒ�,56;05,���,60;";
		String[] word = text.split("[;,��\\s]+");

//		System.out.print(Arrays.toString(word));

		
		  
		// 2)����List����,���ݷ��������ѧ����Ϣ����ѧ�������,��ӵ�List������
		List<student> list=new ArrayList<>();
		for (int i = 0; i < word.length; i+=3) {
			student stu=new student(word[i],word[i+1],Integer.parseInt(word[i+2]));
			/*
			 * stu.setCode(word[i]); stu.setName(word[i+1]);
			 * stu.setResult(Integer.parseInt(word[i+2]));
			 */
			list.add(stu);
		  }
		  
		// 3)ͨ�������ֱ��ӡ�����е�ѧ����Ϣ
		Iterator<student> iterator = list.iterator();
		while(iterator.hasNext()){
			student student = (student) iterator.next();
			System.out.println(student);
		  }
		
		//	4)�жϼ������Ƿ���� ����Ϊ"����"��ѧ��
		 boolean judge=false;
		 iterator=list.iterator();
		 while (iterator.hasNext()) {
			student student = (student) iterator.next();
			if("����".equals(student.getName())) {
				judge=true;
			}
		}
		 System.out.println(judge);
		 
		// 5)�Լ����е�ѧ�����ɼ���������  
		 list.sort(new Comparator<student>() {

			@Override
			public int compare(student o1, student o2) {
				// TODO �Զ����ɵķ������
				return o2.getResult()-o1.getResult();
			}
		
		 });
		 
		 // 6)ͨ��ѭ����ӡ������ѧ������Ϣ
		 for (student student : list) {
			System.out.println(student);
		}
		 System.out.println();
		 
		 // 7)ɾ������Ϊ"����"��ѧ�� 
		 	//(1)
		 list.remove(new student("03","����",91));
		
		 iterator=list.iterator(); 
		 while (iterator.hasNext()) { 
			 student student =(student) iterator.next();
			 if("����".equals(student.getName()))
			 iterator.remove();//����ɾ�� 
			 
		 }
		 
		 // 8)ͨ��foreachѭ����ӡ������ѧ������Ϣ
		 for (student student : list) {
				System.out.println(student);
			}
		 
	}

}
