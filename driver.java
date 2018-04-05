
import java.util.*;

public class driver
{
    	public void run() {
    	    Scanner scan = new Scanner (new File("the\\dir\\myFile.extension"));
    	    Scanner keyboard = new Scanner (System.in);
    	    String user = scan.nextLine();
    	    String pass = scan.nextLine(); // looks at selected file in scan

    	    String inpUser = keyboard.nextLine();
    	    String inpPass = keyboard.nextLine(); // gets input from user

    	    if (inpUser.equals(user) && inpPass.equals(pass)) {
    	        System.out.print("Successfully logged in!");
                int city=scan.nextInt();
    			  switch (city)
    			  {
    			  case 1:
    				System.out.println("Admin");			
    			  break;
    			  case 2:
    				System.out.println("Course coordinator");
    				break;
    			  case 3:
    				System.out.println("Approvals");
    				String approvalsname=null;
    				String approvalsID=null;
    				approval a=new approval(approvalsname,approvalsID);
    				System.out.println("Enter approvals name");
    				approvalsname = keyboard.nextLine();
    				System.out.println("Enter approvals ID");
    				approvalsID=keyboard.nextLine();
    				System.out.println("Review requests made by course coordinator");
    				System.out.println("Type in the request that you would like to approve");
    				break;
    			  case 4:
    				 System.out.println("Casual staff");
    				break;
    			  }
    	    }
    	else {
    		System.out.println("Logout!");
    	}
    	}
}
