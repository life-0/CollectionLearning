package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *	Set���� 
 * @author life-1
 * @project_name Collection
 * @type_name SetLearning
 * @creation_time 2019��6��7�� ����7:54:35
 */
public class SetLearning {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//1)	����Set����
		Set<String>	set=new HashSet<>();
		//2)	���Ԫ��
		set.add("HH");
		set.add("XX");
		set.add("78954");
		set.add("MM");
		set.add("KK");
		
		//3)	ֱ�Ӵ�ӡ���洢˳�������˳����ܲ�һ��
		System.out.println(set);//[HH, XX, MM, KK, 78954]
		
		//4)	����ظ�������,�޷�����ظ�������
		set.add("XX");
		set.add("KK");
		System.out.println(set);//[HH, XX, MM, KK, 78954]
		
		//5)	����
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String string = iterator.next();
			System.out.print(string+"\t");//HH	XX	MM	KK	78954
		}
		
	}

}
