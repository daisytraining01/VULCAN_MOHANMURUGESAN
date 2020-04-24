package com.picnic_drill.one;
import java.util.*; 

class LIFOandFIFO { 

 static void add(Stack<Integer> stack) 
 { 
     for (int i = 0; i < 5; i++) { 
         stack.push(i); 
         
         System.out.println("Adding " + i);
     } 
 } 


 static void removeWithPop(Stack<Integer> stack) 
 { 

	 System.out.println("Last in First Out");
     for (int i = 0; i < 5; i++) { 
         Integer y = (Integer)stack.pop(); 
         System.out.println("Remove " +y); 
     } 
 } 
 
 
 static void removeWithRemove(Stack<Integer> stack) 
 { 
	 System.out.println("First in First Out");

     for (int i = 0; i < 5; i++) { 
         stack.remove(i); 
         System.out.println("Remove " +i); 
     } 
 } 


 static void firstPosition(Stack<Integer> stack) 
 { 
     Integer element = (Integer)stack.peek(); 
     System.out.println("Element on First Position : " + element); 
 } 

 static void find(Stack<Integer> stack, int element) 
 { 
     Integer pos = (Integer)stack.search(element); 

     if (pos == -1) 
         System.out.println("Element not found"); 
     else
         System.out.println("Element is found at position " + pos); 
 } 

 public static void main(String[] args) 
 { 
     Stack<Integer> stack = new Stack<Integer>(); 

     add(stack); 
     removeWithPop(stack); 
     add(stack); 
     removeWithRemove(stack);
     firstPosition(stack); 


 } 
} 


/***************************OUTPUT********************************/
/*
Adding 0
Adding 1
Adding 2
Adding 3
Adding 4
Last in First Out
Remove 4
Remove 3
Remove 2
Remove 1
Remove 0
Adding 0
Adding 1
Adding 2
Adding 3
Adding 4
First in First Out
Remove 0
Remove 1
Remove 2
Remove 3
Remove 4


*/
/*****************************************************************/ 






