package assignment_2;

public class MySpecialLinkedListUtils {
	public static  double[] summary(LinkedListNode head) {
		double d[]= {0};
		int sum=0;
		int c=1;
		LinkedListNode n=head;
	//sum
		while (n.next!=null) {
			c++;
			sum+=n.data;
			n=n.next;
		}
		sum+=n.data;
		
//average
		double average ;
		average=(double)sum/c;
	   //median 
	    double median;
		LinkedListNode med;
		med=head;
		int s=1;
		if(c%2==0) {
			while(s<c/2) {med=med.next;s++;}
		median =((double)med.data+(double)med.next.data)/2;
	
	
		}
		else {
			while(s<c/2) {med=med.next;s++;}
			median=(double)med.data;
			
			}
	   //max&min
		int max=head.data;
		int min=head.data;
		LinkedListNode x;
		x=head;
		while(x.next!=null) {
			if(x.data>max) {
				max=x.data;
			}
			if(x.data<min) {
				min=x.data;
			}
			x=x.next;
		}
		
		d[0]=sum;
		d[1]=average;
	    d[2]=median;
	    d[3]=max;
	    d[4]=min;
	   return d;
	}
	
	
	public static LinkedListNode reverse(LinkedListNode head) {

		LinkedListNode current=head;
		LinkedListNode previous=null;
		LinkedListNode next=null;
		
		while(current!=null) {
			next=current.next;
			current.next=previous;
			previous=current;
			current=next;
		}
		return previous;
	}
	public static LinkedListNode evenIndexedElements(LinkedListNode head)
	{
		LinkedListNode n =head;
		
		while(n!=null)
		{
		n.next=(n.next).next;
		n=n.next;
	}
	
		return head;}
	
	public static LinkedListNode insertionSort(LinkedListNode head) {
		LinkedListNode ptr1=head;
		LinkedListNode ptr2=head.next;
		LinkedListNode n=head;
	
	

		while(ptr2!=null) {
		ptr1=head;
		while(ptr1!=null)
		{	if(ptr2.data<ptr1.data) {
			int temp =ptr2.data;
			ptr2.data=ptr1.data;
			ptr1.data=temp;
		}ptr1=ptr1.next;
		}
		ptr2=ptr2.next;
		}
		
		return head;
	}
	
//////////////////////////////////////////////////////////////
	/////MERGE//////////////////////////////
	public static LinkedListNode middlenode(LinkedListNode n)
	{ int s=0,c=0;
		LinkedListNode x=n;
		while(n!=null) {
			c++;
			n=n.next;
		}
		while(s!=(c/2)-1) {
			s++;
			x=x.next;
		}
	
	return x;
	}
	public static LinkedListNode sortedMerge(LinkedListNode a, LinkedListNode b)  
    { 
		LinkedListNode result = null; 
        if (a == null) 
            return b; 
        if (b == null) 
            return a; 
        if (a.data <= b.data)  
        { 
            result = a; 
            result.next = sortedMerge(a.next, b); 
        }  
        else 
        { 
            result = b; 
            result.next = sortedMerge(a, b.next); 
        } 
        return result; 
  
    } 
	
	public static LinkedListNode mergeSort(LinkedListNode head)  
    { LinkedListNode h=head;
        if (h == null || h.next == null) 
        { 
            return h; 
        } 
 
        LinkedListNode middle = middlenode(h); 
        LinkedListNode next = middle.next; 
        middle.next = null; 
        LinkedListNode left = mergeSort(h); 
        LinkedListNode right = mergeSort(next); 
        LinkedListNode sortedlist = sortedMerge(left, right); 
        return sortedlist; 
    } 
	//////////////////////////////////////////////////////
	///removecentralnode/////
	public static LinkedListNode removeCentralNode(LinkedListNode head) {
		LinkedListNode n=head;
		int c=0;
		LinkedListNode x=head;
		LinkedListNode p=x;
		int s=0;
		while(n!=null) {
			c++;
			n=n.next;
		}
if(c%2!=0) {		while(s!=(c/2)-1) {
			x=x.next;
			s++;
		}
	
		p=x.next;
		x.next=p.next;
}
else {
	while(s!=(c/2)-1) {
		x=x.next;
		s++;
	}
	p=x.next;
	x.next=p.next.next;
}


	return head;
	}
	
	public static boolean palindrome(LinkedListNode head) {
		LinkedListNode ptr1=head;
		LinkedListNode ptr2=head;
		LinkedListNode n=head;
		int s=0;
		while(n!=null) {
			n=n.next;
			s++;
		}
		
		
		for(int i=s;i>0;i--) {
			ptr2=head;
			int c=0;
			while(c!=i-1) {
				ptr2=ptr2.next;
				c++;
				
			}
			if(ptr1.data!=ptr2.data) {
				return false;
			}
			ptr1=ptr1.next;
		}
		return true;
	}
		
	
	
	
}
