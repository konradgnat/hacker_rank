/*
 * Hacker Rank Challenge Day 13: Abstract Classes
 * Completed: 12/22/16
 */
package hrday13abstractclasses;
import java.util.*;
 
public class HRDay13AbstractClasses 
{
    
    abstract class Book
    {
        String title;
        String author;
        Book(String t,String a){
            title=t;
            author=a;
        }
        abstract void display();


    }
        //Write MyBook Class
    class MyBook extends Book 
    {
        int price;
        MyBook(String t, String a, int p) 
        { 
            super(t, a);
            price = p;
        }   

        public void display() 
        {
            System.out.println("Title: " + super.title + "\nAuthor: " + super.author 
                + "\nPrice: " + price);
        }
    }
    public class Solution
    {

       public static void main(String []args)
       {
          Scanner sc=new Scanner(System.in);
          String title=sc.nextLine();
          String author=sc.nextLine();
          int price=sc.nextInt();
          Book new_novel=new MyBook(title,author,price);
          new_novel.display();

       }
    }
    
}
