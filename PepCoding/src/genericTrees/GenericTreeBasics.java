package genericTrees;

import java.util.ArrayList;

import java.util.Stack;

public class GenericTreeBasics {
	
	

   public void main(String[] args) {
//	   Scanner s = new Scanner(System.in);
//	   int n = s.nextInt();
//	   int[] arr = new int[n];
//	   for(int i=0;i<n;i++) {
//		   arr[i]=s.nextInt();
//	   }
	   
	   int arr[] = {10,20,50,-1,60,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,100,-1,-1};
	   Node root = null;
	   Stack<Node> st = new Stack(); 
	   
	   for(int i=0;i<arr.length;i++) {
		   
		   if(arr[i]==-1) {
			   st.pop();
		   }
		   else {
			   Node t = new Node();
			   t.data=arr[i];
			   
			   if(st.isEmpty()) {
				  root=t;
			   }
			   else {
				   st.peek().children.add(t);
				  
			   }
			   st.push(t);
		   }
			 
		   
	   }

	Node.display(root);
   }
   

}

