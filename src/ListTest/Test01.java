package ListTest;

/**
 *	����һ��ѧ��������
 *			ͨ��list���ϴ洢ѧ����Ϣ
 *			���ѧ��
 *			����ѧ�� 
 *			ɾ��ѧ��
 * @author life-1
 * @project_name Collection
 * @type_name Test01
 * @creation_time 2019��6��5�� ����8:48:43
 */
public class Test01 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//���ѧ��
		StudentManager student=new StudentManager();
		student.add(new Student("����", 21, 89));
		student.add(new Student("����", 18, 60));
		student.add(new Student("����", 16, 100));
		student.add(new Student("�߰�", 66, 54));
		
		//��ʾ
		student.show();
		
		//�ж��Ƿ���ָ����ѧ��
		System.out.println(student.Contains(new Student("�߰�", 66, 54)));
		
		//ɾ��ָ����ѧ��
		student.delete(new Student("����", 18, 60));
		student.showInfo();
		
	
	}

}
