/*
 * Hacker Rank Day 15 Linked List
 * Completed 12/28/16
 */
package hrday15linkedlist;

import java.util.Scanner;

/**
 *
 * @author konradgnat
 */
public class Solution { 

    public static  Node insert(Node head,int data) {
            //Complete this method 

            Node newNode = new Node(data);
            Node temp = head;

            if (head == null)
                return newNode;
            else 
                while (temp.next != null) {
                    temp = temp.next;
                }

            temp.next = newNode;
            return head;
        }

	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
} 
