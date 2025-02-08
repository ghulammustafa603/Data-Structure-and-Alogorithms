import java.util.*;
public class DeleteSingleLL 
{
	public static class Node
	{
			int data;
			Node next; 
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}	
	Node head =null;

	public void create_Node()
	{
		int data ,n;
		Scanner sc=new Scanner(System.in);
		do
	   {
		System.out.println("Enter data");
		data=sc.nextInt();
		Node new_node=new Node(data);
		if(head==null)
		{
			head=new_node;
		}
		else
		{
			new_node.next=head;
			head=new_node;
		}

			System.out.println("do you want add more node then press 1 otherwise enter other then 1");
		        n=sc.nextInt();
	    }
		while(n==1);
		
	}

		
	public void deleteAtBeg()
	{
		int n,m;
		System.out.println("Deletion from begining");
		if(head==null)
		{
			System.out.println("LL doesnot exist!");
		}
	else
	 {		
		System.out.println("Press 1 to delete from begining, press 2 to delete from ending! and press 3 to delete at specific location:");
		Scanner sc=new Scanner(System.in);
		m=sc.nextInt();
		switch(m)
		{
			case 1:
			Node temp1=head;
			temp1=temp1.next;
			temp1=head;
			break;
			case 2:
			Node cur=head;
				while(cur.next.next!=null)
				{
					cur=cur.next;
				}
				cur.next=null;
				
			break;
			case 3:
			System.out.println("Enter the location at which you want to delete node:");
			n=sc.nextInt();
			Node temp2=head;
			Node cur2=temp2.next;
			while(cur2.data!=n)
			{
				temp2=cur2;
				cur2=cur2.next;
			}
			
			temp2.next=cur2.next;
			break;
		}	
	 }	
	 
	}
		public void display(){
		if(head==null)
		{
			System.out.println("LL doesnot exist");
		}
		else
		     {
				 Node temp=head;
				 while(temp!=null)
				 {
				System.out.print(temp.data+" ");
				temp=temp.next;
				 }
		     }
		
		

	}
		public static void main(String args [])
		{
			SingleLL a=new SingleLL();
			a.create_Node();
			a.deleteAtBeg();
			a.display();	
		}	


}