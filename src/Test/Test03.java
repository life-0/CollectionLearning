package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * 有字符串:"01,勇哥,100;02,杜哥,9;03,明哥,91;04,菲菲,56;05,杨哥,60" 
 * 1)把字符串中的学生信息分离出来
 *  01,勇哥,100 
 *  02,杜哥,95
 *  ... 数据为：学号，姓名，成绩 
 * 2)创建List集合,根据分离出来的学生信息创建学生类对象,添加到List集合中
 * 3)通过迭代分别打印集合中的学生信息 
 * 4)判断集合中是否存在 姓名为"明哥"的学生
 * 5)对集合中的学生按成绩降序排序 
 * 6)通过循环打印集合中学生的信息
 * 7)删除姓名为"明哥"的学生 
 * 8)通过foreach循环打印集合中学生的信息
 * 
 * @author life-1
 * @project_name Collection
 * @type_name Test03
 * @creation_time 2019年6月7日 下午9:48:32
 */
public class Test03 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		// 1)把字符串中的学生信息分离出来
		String text = "01,勇哥，100;02,杜哥,99;03,明哥,91;04,菲菲,56;05,杨哥,60;";
		String[] word = text.split("[;,，\\s]+");

//		System.out.print(Arrays.toString(word));

		
		  
		// 2)创建List集合,根据分离出来的学生信息创建学生类对象,添加到List集合中
		List<student> list=new ArrayList<>();
		for (int i = 0; i < word.length; i+=3) {
			student stu=new student(word[i],word[i+1],Integer.parseInt(word[i+2]));
			/*
			 * stu.setCode(word[i]); stu.setName(word[i+1]);
			 * stu.setResult(Integer.parseInt(word[i+2]));
			 */
			list.add(stu);
		  }
		  
		// 3)通过迭代分别打印集合中的学生信息
		Iterator<student> iterator = list.iterator();
		while(iterator.hasNext()){
			student student = (student) iterator.next();
			System.out.println(student);
		  }
		
		//	4)判断集合中是否存在 姓名为"明哥"的学生
		 boolean judge=false;
		 iterator=list.iterator();
		 while (iterator.hasNext()) {
			student student = (student) iterator.next();
			if("明哥".equals(student.getName())) {
				judge=true;
			}
		}
		 System.out.println(judge);
		 
		// 5)对集合中的学生按成绩降序排序  
		 list.sort(new Comparator<student>() {

			@Override
			public int compare(student o1, student o2) {
				// TODO 自动生成的方法存根
				return o2.getResult()-o1.getResult();
			}
		
		 });
		 
		 // 6)通过循环打印集合中学生的信息
		 for (student student : list) {
			System.out.println(student);
		}
		 System.out.println();
		 
		 // 7)删除姓名为"明哥"的学生 
		 	//(1)
		 list.remove(new student("03","明哥",91));
		
		 iterator=list.iterator(); 
		 while (iterator.hasNext()) { 
			 student student =(student) iterator.next();
			 if("明哥".equals(student.getName()))
			 iterator.remove();//迭代删除 
			 
		 }
		 
		 // 8)通过foreach循环打印集合中学生的信息
		 for (student student : list) {
				System.out.println(student);
			}
		 
	}

}
