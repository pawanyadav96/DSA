package Array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Node {

	int data;
	Node next;
	public Node(int data) {
		super();
		this.data = data;
		this.next= null;
	}
	
	public static   Linked_list insert(int data, Linked_list linkedlist)
	{
		Node new_node=new Node(data);
		new_node.next=null;
		
		if(linkedlist.head==null)
		{
			linkedlist.head=new_node;
		}
		else
		{
			Node last=linkedlist.head;
			while(last.next != null)
			{
				last=last.next;
				
			}
			last.next=new_node;
		}
		return linkedlist;
		
	}
	public static void main(String[]args)
	{
		Linked_list list=new Linked_list();
		list=insert(1,list);
	
list=insert(2,list);
System.out.println(Arrays.toString(args));

	}
	
}

