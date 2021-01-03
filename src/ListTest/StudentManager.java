package ListTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 	学生管理类
 * 	注意：List集合中的contains()和remove()等方法，需要调用对象的equals()方法
 * 		如果集合中存储的是自定义类型对象, 需要重写equals方法()
 * @author life-1
 * @project_name Collection
 * @type_name Test12
 * @creation_time 2019年6月5日 下午8:53:40
 */
public class StudentManager {

		// TODO 自动生成的方法存根
		//定义一个list集合,保存学生信息
		List<Student>	list;
		
		public  StudentManager() {
			list=new ArrayList<>();
		}
		
		//添加学生
		public void add(Student	stu) {
			list.add(stu);
		}
		//删除学生
		public void delete(Student stu) {
			list.remove(stu);
		}
		//查找学生
		public boolean Contains(Student stu) {
			return list.contains(stu);
		}
		//显示学生信息
		public void showInfo() {
			for (Student student : list) {
				System.out.println(student);
			}
		}
		public void show() {
		Iterator<Student> iterator = list.iterator();	//使用迭代器寻找学生类
		while (iterator.hasNext()) {
			Student student = (Student) iterator.next();
			System.out.println(student);
		}
		}

}
