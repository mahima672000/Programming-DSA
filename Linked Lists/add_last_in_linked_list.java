/* Insertion in linked lists */
/* You are given a partially written LinkedList class.
You are required to complete the body of addLast function. This function is supposed to add an element to the end of LinkedList.
You are required to update head, tail and size as required. */


import java.io.*;
import java.util.*;

public class Main{
  public static class Node{
    int data;  // declaration of data from node class
    Node next; //declaration of pointer from node class
  }

  public static class LinkedList{
    Node head; //declaration of head & tail node from linked list class
    Node tail;
    int size; // declaration of intial size of linked list
    
    
    void addLast(int val){
    Node temp = new Node();// creating a temp node
    temp.data = val; // making its data equal to val
    temp.next = null; // making its address point to null
      
    if(size==0){ //if intially the linked list was empty 
      head = tail= temp; //all the three nodes are same then
    }else{  // if intialy linked list was not empty
      tail.next = temp; //address of tail point to temp so that temp now becomes the new tail
      tail = temp; // why tail = temp & not temp = tail??   tail = temp .."tail of the linked list is temp"
    }
      size ++;
  }
  
  public static void testList(LinkedList list){
    for(Node temp=list.head; temp!=null; tempt.next){
      System.out.println(temp.data);
    }
    System.out.println(list.size);
    
    if(list.size>0){
      System.out.println(list.tail.data);
    }
  }
    
    public static void main(String [] args) throws Exception{
      BufferedReader br = new BufferedReader(newInputStreamReader(System.in));
      LinkedList list = new LinkedList();
      
      String str = br.readLine();
      
      
    
    
