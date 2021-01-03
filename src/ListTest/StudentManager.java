package ListTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 	ѧ��������
 * 	ע�⣺List�����е�contains()��remove()�ȷ�������Ҫ���ö����equals()����
 * 		��������д洢�����Զ������Ͷ���, ��Ҫ��дequals����()
 * @author life-1
 * @project_name Collection
 * @type_name Test12
 * @creation_time 2019��6��5�� ����8:53:40
 */
public class StudentManager {

		// TODO �Զ����ɵķ������
		//����һ��list����,����ѧ����Ϣ
		List<Student>	list;
		
		public  StudentManager() {
			list=new ArrayList<>();
		}
		
		//���ѧ��
		public void add(Student	stu) {
			list.add(stu);
		}
		//ɾ��ѧ��
		public void delete(Student stu) {
			list.remove(stu);
		}
		//����ѧ��
		public boolean Contains(Student stu) {
			return list.contains(stu);
		}
		//��ʾѧ����Ϣ
		public void showInfo() {
			for (Student student : list) {
				System.out.println(student);
			}
		}
		public void show() {
		Iterator<Student> iterator = list.iterator();	//ʹ�õ�����Ѱ��ѧ����
		while (iterator.hasNext()) {
			Student student = (Student) iterator.next();
			System.out.println(student);
		}
		}

}
