package arrays;


//{ Driver Code Starts


//{ Driver Code Starts


import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node{
 int data;
 Node left;
 Node right;
 Node(int data){
     this.data = data;
     left=null;
     right=null;
 }
}

class Demo {
 
 static Node buildTree(String str){
     
     if(str.length()==0 || str.charAt(0)=='N'){
         return null;
     }
     
     String ip[] = str.split(" ");
     // Create the root of the tree
     Node root = new Node(Integer.parseInt(ip[0]));
     // Push the root to the queue
     
     Queue<Node> queue = new LinkedList<>(); 
     
     queue.add(root);
     // Starting from the second element
     
     int i = 1;
     while(queue.size()>0 && i < ip.length) {
             
         // Get and remove the front of the queue
         Node currNode = queue.peek();
         queue.remove();
             
         // Get the current node's value from the string
         String currVal = ip[i];
             
         // If the left child is not null
         if(!currVal.equals("N")) {
                 
             // Create the left child for the current node
             currNode.left = new Node(Integer.parseInt(currVal));
             // Push it to the queue
             queue.add(currNode.left);
         }
             
         // For the right child
         i++;
         if(i >= ip.length)
             break;
             
         currVal = ip[i];
             
         // If the right child is not null
         if(!currVal.equals("N")) {
                 
             // Create the right child for the current node
             currNode.right = new Node(Integer.parseInt(currVal));
                 
             // Push it to the queue
             queue.add(currNode.right);
         }
         i++;
     }
     
     return root;
 }
 static void printInorder(Node root){
     if(root == null)
         return;
         
     printInorder(root.left);
     System.out.print(root.data+" ");
     
     printInorder(root.right);
 }
 
	public static void main (String[] args) throws IOException {
	        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
	        while(t-- > 0){
	            String s= br.readLine();
	            Node root = buildTree(s);
	            
	            Tree tr=new Tree();
	            ArrayList<Integer> A=new ArrayList<Integer>();
	            tr.serialize(root, A);
	            
	            Node getRoot=tr.deSerialize(A);
	            printInorder(getRoot);
	            System.out.println();
	        }
	}
}// } Driver Code Ends
/*Complete the given function
Node is as follows:
class Tree{
	int data;
	Tree left,right;
	Tree(int d){
		data=d;
		left=right=null;
	}
}*/
//This Code is developed by: Suman Rana
class Tree {
	public void serialize(Node root, ArrayList<Integer> list) {
	    String s = serialize(root);
	    System.out.println("s : " + s);
	    String[] arr = s.split(" ");
	    for(int i=0;i<arr.length;i++){
	        list.add(Integer.parseInt(arr[i]));
	    }
	    System.out.println("list : " + list);
	}
	
	String serialize(Node node){
	    if(node == null){
	        return "-1 ";
	    }
	    
	    return node.data + " " + serialize(node.left) + serialize(node.right);
	}
	
	int i;
 public Node deSerialize(ArrayList<Integer> A){
     i = 0;
     return deSerializeHelper(A);
 }
 
 Node deSerializeHelper(ArrayList<Integer> A){
     if(A.get(i) == -1){
    	 i++;
         return null;
     }
     Node node = new Node(A.get(i));
     i++;
     node.left = deSerializeHelper(A);
     node.right = deSerializeHelper(A);
     return node;
 }
}