/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package activity_2;




import java.util.Scanner;

class Node {
  String Authors_name;
  String Book_Title;
  String ISBN;
   Node next;
  
  
  public Node (String Authors_name, String Book_Title,String ISBN) {
      this.Authors_name = Authors_name;
      this.Book_Title = Book_Title;
      this.ISBN = ISBN;
      this.next = null;
      
  }
   
}
class Simple_lib {
    
   Node list;
 
   
   public void addNode(String Authors_name, String Book_Title, String ISBN){
        Node newNode = new Node(Authors_name, Book_Title, ISBN);
     if(list==null) {
         list=newNode;
         
     } else {
     Node cur = list;
     while(cur.next!=null){
     cur = cur.next;
         
     } cur.next = newNode; 
         
    }   
  } 
   
public void Display () {
   if (list == null) {
       System.out.println("Book list is empty");
       
       
   } else {
       System.out.println("======Book List=======");
       Node cur = list;
       
       while (cur != null){
      
       System.out.println("Author's Name: "+ cur.Authors_name);
       System.out.println("Book Title: "+ cur.Book_Title);
       System.out.println("ISBN: "+ cur.ISBN);
      cur = cur.next;  
       }
        } 
    
    }
}


/**
 *
 * @author User
 */
public class Activity_2 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Simple_lib booklist = new Simple_lib();
        Scanner in = new Scanner (System.in);
        
        while (true) {
        System.out.println("Press 1 for adding books ");
        System.out.println("Press 2 for displaying book you add "); 
           
              int number = in.nextInt();
              in.nextLine();
        
        switch (number){
            
            case 1:
        System.out.print("Author's Name: ");
          String Authors_name = in.nextLine();
        System.out.print("Book Title: ");
          String Book_Title = in.nextLine();
        System.out.print("ISBN: ");
          String ISBN = in.nextLine();
        booklist.addNode(Authors_name, Book_Title, ISBN);
                System.out.println("Add Succesfully!");
        
        break;
            case 2:
                booklist.Display();
        break;
       
            default:
                
                System.out.println("Invalid Number");
            
        } 
        
        
            
        }
    }
    
}
