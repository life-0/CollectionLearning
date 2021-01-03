package ListTest;

/**
 *	创建一个学生管理类
 *			通过list集合存储学生信息
 *			添加学生
 *			查找学生 
 *			删除学生
 * @author life-1
 * @project_name Collection
 * @type_name Test01
 * @creation_time 2019年6月5日 下午8:48:43
 */
public class Test01 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//添加学生
		StudentManager student=new StudentManager();
		student.add(new Student("李四", 21, 89));
		student.add(new Student("王五", 18, 60));
		student.add(new Student("张六", 16, 100));
		student.add(new Student("七八", 66, 54));
		
		//显示
		student.show();
		
		//判断是否有指定的学生
		System.out.println(student.Contains(new Student("七八", 66, 54)));
		
		//删除指定的学生
		student.delete(new Student("王五", 18, 60));
		student.showInfo();
		
	
	}

}
