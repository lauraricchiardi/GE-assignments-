package lessonExamples;
import java.util.Scanner;

public class Library2 {
    public String type;
	public int pages; 
	public int quantity;
	
	public Library2 (String typebook, int qtybook) {
	type = typebook;
	quantity = qtybook;
	pages = 25;
	}	
		
	public void borrowing() {
	quantity--;
	}
	
	public void returning() {
		quantity++;
		}

	public void changepages() {
	
		pages = pages - 10; 
		}

	
	
	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Borrowing or Returning? 0 for Borrow, 1 for Return, 2 for Buy");
		int A = scan.nextInt();
		System.out.println("Which type of book is? 0 for Fiction, 1 for Horror, 2 for Romance");
		int B = scan.nextInt();
		
		
		Library2 mybook1 = new Library2 ("fiction",5);
		Library2 mybook2 = new Library2 ("horror",8);
		Library2 mybook3 = new Library2 ("romance",10);
		
		
		
        if (A == 0 && B == 0) {
        	
			mybook1.borrowing();
			System.out.println("The new quantity of "+mybook1.type+" books is "+mybook1.quantity);
		    } else {
        
        if (A == 0 && B == 1) {
			
        	mybook2.borrowing();
        	System.out.println("The new quantity of "+mybook2.type+" books is "+mybook2.quantity);
		   
        } else {
			   
        	if (A == 0 && B == 2) {
    			
            	mybook3.borrowing();
            	System.out.println("The new quantity of "+mybook3.type+" books is "+mybook3.quantity);
    		   
            	   
            } else {
    			   
            	if (A == 1 && B == 0) {
        			
                	mybook1.returning();
                	System.out.println("The new quantity of "+mybook1.type+" books is "+mybook1.quantity);
		   
            } else {
 			   
            	if (A == 1 && B == 1) {
        			
                	mybook2.returning();
                	System.out.println("The new quantity of "+mybook2.type+" books is "+mybook2.quantity);
		    } else {
 			   
            	if (A == 1 && B == 2) {
        			
                	mybook3.returning();
                	System.out.println("The new quantity of "+mybook3.type+" books is "+mybook3.quantity);
            	} else {
            		System.out.println("The selection done is not corret, please try again"); 
            	}
	   
	}
         
            }
            }
            }
        }
        
        
		
        
            }	
}