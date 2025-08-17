	package Sridhar;
	import java.util.*;
	
	public class Sample {
	    public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter your name:");
	        String name=sc.nextLine();
	        System.out.println("Hello "+name);
	        String s;
	        int totalbill=0;
	    do {
	        System.out.println("enter your choise:");
	        System.out.println("1.Dall fry-80\n2.Rice-100\n3.Panner Curry-120\n4.Gera Rice-100\n5.Roti-35");
	        int n=sc.nextInt();
	     
	        switch(n)
	        {
	 case 1:
	        	
	        	System.out.println("how much quantity sir:" );
	        	int q=sc.nextInt();
	        	int r=q*80;
	        	
	        	System.out.println("Please pay Rs:"+(r));
	        	int a=sc.nextInt();
	        	if(a ==q*80)
	        	{
	        		System.out.println("Your order is placed sir please wait");
	        		totalbill+=r;
	        		}
	        	else
	        	{
	        		System.out.println("Wrong payment sir.Order cancelled");
	        	}
	        	break;
	 case 2:
	        	
	        	System.out.println("how much quantity sir:" );
	        	 q=sc.nextInt();
	        	 r=q*100;
	        	 
	        	System.out.println("Please pay Rs:"+(r));
	        	 a=sc.nextInt();
	        	if(a ==q*100)
	        	{
	        		System.out.println("Your order is placed sir please wait");
	        		totalbill+=r;
	        	}
	        	else
	        	{
	        		System.out.println("Wrong payment sir.Order cancelled");
	        	}
	        	break;
	 case 3:
	 	
			 	System.out.println("how much quantity sir:" );
			 	q=sc.nextInt();
			 	 r=q*120;
			
			 	System.out.println("Please pay Rs:"+(r));
			 	 a=sc.nextInt();
			 	if(a ==q*120)
			 	{
			 		System.out.println("Your order is placed sir please wait");
			 		totalbill+=r;
			 	}
			 	else
			 	{
			 		System.out.println("Wrong payment sir.Order cancelled");
			 	}
			 	break;
	 case 4:
	 	
			 	System.out.println("how much quantity sir:" );
			 	 q=sc.nextInt();
			 	 r=q*100;
			 
			 	System.out.println("Please pay Rs:"+(r));
			 	 a=sc.nextInt();
			 	if(a ==q*100)
			 	{
			 		System.out.println("Your order is placed sir please wait");
			 		totalbill+=r;
			 	}
			 	else
			 	{
			 		System.out.println("Wrong payment sir.Order cancelled");
			 	}
			 	break;
	 case 5:
		 	
			 	System.out.println("how much quantity sir:" );
			 	 q=sc.nextInt();
			 	 r=q*35;
			 	
			 	System.out.println("Please pay Rs:"+(r));
			 	a=sc.nextInt();
			 	if(a ==q*35)
			 	{
			 		System.out.println("Your order is placed sir please wait");
			 		totalbill+=r;
			 	}
			 	else
			 	{
			 		System.out.println("Wrong payment sir.Order cancelled");
			 	}
		 	    break;
		    
	       
	     }
	        System.out.println("do you want to order more Yes or No");
	        sc.nextLine();
    		 s=sc.nextLine();
    		
	     }
	    while(s.equalsIgnoreCase("Yes"));
	    
	    System.out.println("Your total amount is:"+ totalbill);
	    System.out.println("Thankyou " + (name)+" please visit again");
	    }
	    
	}
	
	     
	       
		       
		    
		

