package lessonExamples;
import java.util.Random;
import java.util.Scanner;


public class VacationTime {
	
	public String destination;
	public double pricemin;
	public double pricemax;
	private static String monthString;

	
	public VacationTime (String finaldestination, double pricem, double priceM) { // constructor to create the instances for the variables 
		destination = finaldestination;
		pricemin = pricem;
		pricemax = priceM;	
        }
	

	public void discount() { //method that gives you a discount if you are the 6th client, randomly selected between 1 and 20
		pricemin = pricemin*0.8;
		}
	
                 
	public static void main(String [] args) {
		
		VacationTime [] mydestination =new VacationTime [3];
		mydestination[0]=new VacationTime ("Maldives",2340,3400);	
		mydestination[1]=new VacationTime ("Iceland",1960,2560);
		mydestination[2]=new VacationTime ("Botswana",2980,3960);
		
		
		
		Random rand = new Random();
        int n = rand.nextInt(10) + 1;// randomly select a number between 1 and 20
        System.out.println("Today you are the customer number "+n);//print the random number 
		
		VacationCalculation Vac = new VacationCalculation ();
		Vac.count(); //takes the method from the class VacationCalculation
		
        
		System.out.println("Where do you want to go? 0 for Maldives, 1 for Iceland, 2 for Botswana");
		
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		
		if (A > 2 ){	
		System.out.println("The selections are not correct, please try again");
		return;
		
		} else {
			
	    System.out.println("In which month do you want to go? From 1 for January to 12 for December");
		int B = scan.nextInt();
		
		if (B == 0 || B > 12 ){	
			System.out.println("The selections are not correct, please try again");
			return;
			} else {
		
		     System.out.println("How many people?");
		     int C = scan.nextInt();
		
		     if (C == 0){	
			 System.out.println("The selections are not correct, please try again");
			 return;
			 } else {
		
		switch (B) {
		  
        case 1:  monthString = "January";
                 break;
        case 2:  monthString = "February";
                 break;
        case 3:  monthString = "March";
                 break;
        case 4:  monthString = "April";
                 break;
        case 5:  monthString = "May";
                 break;
        case 6:  monthString = "June";
                 break;
        case 7:  monthString = "July";
                 break;
        case 8:  monthString = "August";
                 break;
        case 9:  monthString = "September";
                 break;
        case 10: monthString = "October";
                 break;
        case 11: monthString = "November";
                 break;
        case 12: monthString = "December";
                 break;
           } 
		

			
		        if (A == 0 && (B == 1 || B == 2 || B == 3 || B == 4 || B == 11 || B == 12)) {
			
  
				System.out.println("It is high season in "+monthString+" in Maldives, the price for "+C+" is " +mydestination[0].pricemax*C+"$");
			    
			       } else {
			    	
			    	if (A == 0 && (B == 5 || B == 6 || B == 7 || B == 8 || B == 9 || B == 10 )) {
		
			           System.out.println("It is low season in "+monthString+" in Maldives, the price for "+C+" is " +mydestination[0].pricemin*C+"$");	
	                  
			    	     } else {
			    	
			    	          if (A == 1 && (B == 1 || B == 2 || B == 3 || B == 7 || B == 8 || B == 9 )) {
				        	
							      System.out.println("It is high season in "+monthString+" in Iceland, the price for "+C+" is " +mydestination[1].pricemax*C+"$");
						           } else {
						    	
						    	     if (A == 1 && (B == 10 || B == 11 || B == 12 || B == 4 || B == 5 || B == 6 )) {
					
						               System.out.println("It is low season in "+monthString+" in Iceland, the price for "+C+" is " +mydestination[1].pricemin*C+"$");	
						             	} else {
						             		
						             	 if (A == 2 && (B == 5 || B == 6 || B == 7 || B == 8 || B == 9 || B == 10 )) {
							        	
										    System.out.println("It is high season in "+monthString+" in Botswana, the price for "+C+" is " +mydestination[2].pricemax*C+"$");
									         } else {
									    	
									         	if (A == 2 && (B == 1 || B == 2 || B == 3 || B == 4 || B == 11 || B == 12 )) {
								
									             System.out.println("It is low season in "+monthString+" in Botswana, the price for "+C+" is " +mydestination[2].pricemin*C+"$");	
							                     } else {	   
							           
							        	         System.out.println("The selections are not correct, please try again");
							                     }
							                    }
						                     }
			                          }
	                           }
			                }
		              }
			
		
		     
		 if (n == 6 && A == 0) {
         	
         	mydestination[0].discount();
         	System.out.println("But since you were the customer number "+n+" to check our offers today you can book at a new special price "+mydestination[0].pricemin*C+"$");
         	
     
            } else {
         	   
         	   if (n == 6 && A == 1) {
		            	
		            	mydestination[1].discount();
		            	System.out.println("But since you were the customer number "+n+" to check our offers today you can book at a new special price "+mydestination[1].pricemin*C+"$");
         	   
         	   
            }  else {
         	   
         	   if (n == 6 && A == 2) {
		            	
		            	mydestination[2].discount();
		            	System.out.println("But since you were the customer number "+n+" to check our offers today you can book at a new special price "+mydestination[2].pricemin*C+"$");
         	   
         	       }  else {
         	    	  return; 
         	   }
     	
            }
            }
 
     }
      }		           
	}
}
			    
			    


