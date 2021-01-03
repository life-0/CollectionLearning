package List;

import java.util.LinkedList;

/**
 *	LinkedList 
 * @author life-1
 * @project_name Collection
 * @type_name LinkedList
 * @creation_time 2019��6��7�� ����1:53:05
 */
public class LinkedListLearning {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		LinkedList<String>	linkedlist=new LinkedList<>();
		
		linkedlist.add("hello");
		linkedlist.add("world");
		linkedlist.add("yes");
		linkedlist.add("no");
		System.out.println(linkedlist);
		
		//�ֱ���ͷ����β�����Ԫ��
		linkedlist.addFirst("123");
		linkedlist.addLast("987");
		System.out.println(linkedlist);//[123, hello, world, yes, no, 987]
		
		//���ص�һ���͵ڶ���Ԫ��
		System.out.println(linkedlist.getFirst());//123
		System.out.println(linkedlist.getLast());//987
		
		//ɾ����һ���͵ڶ���Ԫ�أ���remove()ɾ��ʱ�����ɾ����Ԫ�ط���
		System.out.println(linkedlist.removeFirst());//123
		System.out.println(linkedlist.removeLast());//987
		System.out.println(linkedlist);//[hello, world, yes, no]
		
		//ģ��ջ
		linkedlist.push("XXX");
		System.out.println(linkedlist );//[XXX, hello, world, yes, no]
		System.out.println(linkedlist.pop());//��ջ
		System.out.println(linkedlist);//[hello, world, yes, no]
		
		//ģ�����
		linkedlist.offer("SSS");
		System.out.println(linkedlist);//[hello, world, yes, no, SSS]
		System.out.println(linkedlist.poll());//���ӣ�hello
		System.out.println(linkedlist);//[world, yes, no, SSS]
	}

}
