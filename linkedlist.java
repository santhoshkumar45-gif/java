import java.util.*;

class node
{
  int data;
  node next;
    node (int d)
  {
	data = d;
	next = null;
  }
}

class linkedlist
{
  node head = null;
  void insertb (int d)
  {
	node nnode = new node (d);
	  nnode.next = head;
	  head = nnode;
  }

  void insertl (int d)
  {
	node nnode = new node (d);
	if (head == null)
	  {
		head = nnode;
	  }
	else
	  {
		node temp = head;
		while (temp.next != null)
		  {
			temp = temp.next;
		  }
		temp.next = nnode;
	  }
  }

  void insertm (int p, int d)
  {
	node nnode = new node (d);
	if (head == null)
	  {
		head = nnode;
	  }
	else
	  {
	      if(p<0)
	      {
	           System.out.println("Position cannot be negative");
              return; 
	      }
		node temp = head;
		for (int i = 1; i < p; i++)
		  {
			temp = temp.next;
			if(temp==null)
			{
			   System.out.println("Position doesnot exsit");
              return; 
			}
		  }
		nnode.next = temp.next;
		temp.next = nnode;
	  }
  }
  
  void deleteb()
  {
      if(head==null)
      {
          System.out.println("List is Empty");
          return;
      }
      else
      {
          int d=head.data;
          System.out.println("Deleted data "+d);
          head=head.next;
      }
  }
  
  void deletel()
  {
      if(head==null)
      {
           System.out.println("List is Empty");
          return;
      }
      else
      {
          node temp=head;
          node prev=null;
          while(temp.next!=null)
          {
              prev=temp;
              temp=temp.next;
          }
          System.out.println("Deleted data "+temp.data);
          prev.next=null;
      }
  }
  
  
  void deletem(int p)
  {
      if(head==null)
      {
           System.out.println("List is Empty");
          return;
      }
      else{ 
          if(p<0)
	      {
	           System.out.println("Position cannot be negative");
              return; 
	      }
      node temp=head;
      node prev=null;
      for(int i=0;i<p-1;i++)
      {
          prev=temp;
          temp=temp.next;
          if(temp==null)
          {
              System.out.println("Position doesnot exsit");
              return;
          }
      }
       System.out.println("Deleted data "+temp.data);
      prev.next=temp.next;
      }
  }
  
  void sum()
  {
      int s=0;
      node temp=head;
      if(head==null)
      {
           System.out.println("List is Empty");
          return;
      }
      else
      {
      while(temp!=null)
      {
          s=s+temp.data;
          temp=temp.next;
      }
      System.out.println("Sum elements in the linkedlist "+s);
      }
  }
  
  void search(int k)
  {
     if(head==null)
      {
           System.out.println("List is Empty");
          return;
      }
      else
      {
          node temp=head;
          while(temp!=null)
          {
              if(temp.data==k)
              {
                  System.out.println("Value found");
                  break;
              }
              temp=temp.next;
          }
          if(temp==null)
          System.out.println("Value not found");
          
      }
  }
  
  void reverse()
  {
      if(head==null)
      {
          System.out.println("List is empty");
          return;
      }
      else
      {
          node prev=null;
          node current=head;
          node next=null;
          while(current!=null)
          {
              next=current.next;
              current.next=prev;
              prev=current;
              current=next;
          }
          head=prev;
      }
  }

  void display ()
  {
	node temp = head;
	if(head==null)
      {
           System.out.println("List is Empty");
          return;
      }
      else{
          
	while (temp != null)
	  {
		System.out.print (temp.data + " ");
		temp = temp.next;
	  }
	  System.out.print("\n");
  }
  }
}

public class Main
{
  public static void main (String[]args)
  {
	linkedlist l1 = new linkedlist ();
	
	  l1.insertl (80);
	  l1.insertl (650);
	  l1.insertl (160);
	  l1.insertl (60);
	  l1.insertm (2, 50);
	  l1.display();
	  l1.reverse();
	  l1.display();
	   
  }
}
