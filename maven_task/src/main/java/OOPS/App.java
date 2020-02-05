package OOPS;
import java.util.Scanner;
import mysweets.*;
class App 
{
  public static void main(String []args)
  {
	  Scanner s=new Scanner(System.in);
	  String firstname=new String();
	  System.out.println("Hey what's your name?");
	  firstname=s.next();  
	  
	  System.out.println("Enter number of Chocolates");
	  int ch=s.nextInt();
	  
	  Chocolates choco=new Chocolates();
	  	  for(int i=0;i<ch;i++)
	  	  {
	   System.out.println("Enter name of Chocolate");
	   String name=s.next();
	   System.out.println("Enter weight of Chocolate");
	  	int weight=s.nextInt();
	  	choco.setdetails(name,weight);

	  	  }
	  	Cookies yumm=new Cookies();
	  	 System.out.println("Enter number of Cookies");
		   ch=s.nextInt();
		  	  for(int i=0;i<ch;i++)
		  	  {
		   System.out.println("Enter brand of Cookie");
		   String name=s.next();
		
		  System.out.println("Enter weight of Cookie");
		  	int weight=s.nextInt();
		  	yumm.setdetails(name,weight);
		 
		  	
		  }
		  	Candies candy=new Candies();
		  	 System.out.println("Enter number of Candies");
		      ch=s.nextInt();
			  	  for(int i=0;i<ch;i++)
			  	  {
			   System.out.println("Enter name of Candy");
			   String name=s.next();
			  System.out.println("Enter weight of Candy");
			  	int weight=s.nextInt();
				candy.setdetails(name, weight);
			  	
			  }
			  	   
			  	  
			  	  String cho="y";
			  	  do
			  	  {
			  		System.out.println("\n\nENTER YOUR CHOICE\n\n1.Sort Sweets by Name\n2.Sort Sweets by Weight\n3.Total Weight");
				  	  int choice=s.nextInt();
			  	  switch(choice)
			  	  {
			  	  case 1:
			  		  choco.byname();			  			  
			  		  break;  			  
			  	  case 2:
			  		  	choco.byweight();
			  		  	break;
			  	  case 3:
			  choco.totalweight();
			  break;

			  	default:
			  		System.out.println("Wrong choice");
			  		
			  	  }
			  	  System.out.println("Hey "+firstname+ " do you want to search for Something else?  y/n?");
			  	  cho=s.next();
			  	  }while(cho.equals("y"));
			  	  System.out.println("Thank You!!!");
		s.close();
	 
	  
  }
}
