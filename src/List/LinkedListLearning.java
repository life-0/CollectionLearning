package List;

import java.util.LinkedList;

/**
 *	LinkedList 
 * @author life-1
 * @project_name Collection
 * @type_name LinkedList
 * @creation_time 2019年6月7日 下午1:53:05
 */
public class LinkedListLearning {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		LinkedList<String>	linkedlist=new LinkedList<>();
		
		linkedlist.add("hello");
		linkedlist.add("world");
		linkedlist.add("yes");
		linkedlist.add("no");
		System.out.println(linkedlist);
		
		//分别在头部和尾部添加元素
		linkedlist.addFirst("123");
		linkedlist.addLast("987");
		System.out.println(linkedlist);//[123, hello, world, yes, no, 987]
		
		//返回第一个和第二个元素
		System.out.println(linkedlist.getFirst());//123
		System.out.println(linkedlist.getLast());//987
		
		//删除第一个和第二个元素，在remove()删除时，会把删除的元素返回
		System.out.println(linkedlist.removeFirst());//123
		System.out.println(linkedlist.removeLast());//987
		System.out.println(linkedlist);//[hello, world, yes, no]
		
		//模拟栈
		linkedlist.push("XXX");
		System.out.println(linkedlist );//[XXX, hello, world, yes, no]
		System.out.println(linkedlist.pop());//出栈
		System.out.println(linkedlist);//[hello, world, yes, no]
		
		//模拟队列
		linkedlist.offer("SSS");
		System.out.println(linkedlist);//[hello, world, yes, no, SSS]
		System.out.println(linkedlist.poll());//出队：hello
		System.out.println(linkedlist);//[world, yes, no, SSS]
	}

}
