
import java.util.*;

public class driver
{
    	public void run() {
                Scanner scan = new Scanner (System.in);
System.out.println("HR Management System");
  System.out.println("Enter username");
	    String user = scan.nextLine();
System.out.println("Enter password");
	    String pass = scan.nextLine(); // looks at selected file in scan

	    if (user.equals("admin") && pass.equals("rmit")) {
    	        System.out.print("Successfully logged in!");
                int city=scan.nextInt();
    			  switch (city)
    			  {
    			  case 1:
    				System.out.println("Admin");			
    			  break;
    			  case 2:
    				System.out.println("Course coordinator");
                          String coordinatorname=null;

				String coordinatorID=null;

				courseCoordinator b=new courseCoordinator(coordinatorname,coordinatorID);

				System.out.println("Enter course coordinator's name");

				coordinatorname = scan.nextLine();

				System.out.println("Enter course coordinator's ID");

				coordinatorID=scan.nextLine();

				System.out.println("Review requests made by course coordinator");

				System.out.println("Type in the request that you would like to approve");
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
