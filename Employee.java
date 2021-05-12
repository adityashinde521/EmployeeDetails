import java.io.*;
import java.util.*;

public class Employee {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int s=0;
		while(s<3) {
		System.out.println("\n---Here is the menu---");
		System.out.println("press 1 for inputing the data ");
		System.out.println("press 2 for displaying the data that has been entered ");
		System.out.println("press 3 for delete information");
		System.out.println("press 4 for edit");
		System.out.println("press 5 for exit");
		System.out.println("\n--Please enter the choice what you want--");
		
		s=scan.nextInt();
		
		
		if(s==1) {
		
	System.out.println("\nEnter the the no. of the element you want to enter: ");
	
		int y=scan.nextInt();
		String Name[]=new String[y]; 
		String Sal[]=new String[y];
		int id[]=new int[y];
		String Designation[]=new String[y];
		
			
		int i;
		
		System.out.println("\nStart Enter the Detail of the Employee--");
	
		for(i=0;i<y;i++) {
			
			System.out.println("Enter the Name of the Employee :- ");
			Name[i]=scan.next();
			System.out.println("Enter the Salary of Employee :- ");
			Sal[i]=scan.next(); 
			System.out.println("Enter the id of Employee :-");
			id[i]=scan.nextInt();
			
			System.out.println("Enter the desigination of Employee :-");
			Designation[i]=scan.next();
			System.out.println("----Data Saved----\n");
			
						}
		  String F;
	      System.out.println("Enter the File name which you want to make :-" );
	      F=scan.next();
		  for(i=0;i<y;i++) {
		
		  try {
	         
	         File f1 = new File(F+".txt");
	         if(!f1.exists()) {
	            f1.createNewFile();
	         }

	         FileWriter fileWritter = new FileWriter(f1.getName(),true);
	         BufferedWriter bw = new BufferedWriter(fileWritter);
	         bw.write(Name[i] + "\t" +Sal[i]+ "\t"+id[i] +"\t"+Designation[i]+"\n");
	         bw.close();
	         
	      } catch(IOException e){
	         e.printStackTrace();
	      }
		  }
		  }
		
		else if(s==2) {
			
			   
		         
		        try {	String Fl;
		                System.out.println("Enter the File name that you want to Display :" );
		        		Fl=scan.next();
		        		System.out.println("\nName\t Salary\t ID\t Designation");
		        	
		        	FileReader fileReader = new FileReader(Fl+".txt");
		            char [] a = new char[2048];
		            fileReader.read(a);   
		               
		            for(char c : a) {
		                System.out.print(c);	}
		            fileReader.close();
		        } catch(Exception e) {
		        }
		}
		
		else if(s==3) 
		{
    		System.out.println("");
		}
	
		
		else if(s==4) 
		    {
			 try {	String Fl;
             System.out.println("Enter the File name that you want to Display :" );
     		Fl=scan.next();
     		System.out.println("Enter the ID to be Changed:");
     		System.out.println("\nName\t Salary\t ID\t Designation");
     	    
     	FileReader fileReader = new FileReader(Fl+".txt");
         char [] a = new char[2048];
         fileReader.read(a);   
            
         for(char c : a) {
             System.out.print(c);	}
         fileReader.close();
     } catch(Exception e) {
     }
}
		
		else {
			System.out.println("exit...");
			  
            System.exit(0);
	}
		
		}
		


	}

}
