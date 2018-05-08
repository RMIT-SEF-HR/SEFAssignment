
import java.util.*;

public class driver
{
    	public static void main(String[] args) {
                Scanner scan = new Scanner (System.in);
System.out.println("HR Management System");
  System.out.println("Enter username");
	    String user = scan.nextLine();
System.out.println("Enter password");
	    String pass = scan.nextLine(); // looks at selected file in scan

	    if (user.equals("admin") && pass.equals("rmit")) {
    	        System.out.print("Successfully logged in!");
		    System.out.println("Enter choice");
	        System.out.println("1. Admin");
	        System.out.println("2.Course coordinator");
	        System.out.println("3. Approvals");
	        System.out.println("4. Casual staff");
                int city=scan.nextInt();
    			  switch (city)
    			  {
    			  case 1:
    				System.out.println("Admin");	
			        System.out.println("Feature under maintanence");
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
/*In the rest of this feature, the course coordinator has to make the job request. After that, he has to make it 
				available to the casual staff.
				 */
	
    				break;
    			  case 3:
    				System.out.println("Approvals");
    				String approvalsname=null;
    				String approvalsID=null;
    				approval a=new approval(approvalsname,approvalsID);
    				System.out.println("Enter approvals name");
    				approvalsname = scan.nextLine();
    				System.out.println("Enter approvals ID");
    				approvalsID=scan.nextLine();
    				System.out.println("Review requests made by course coordinator");
			        /* In this feature, the approval should be able to see all the requests made by the course coordinator
	 and also label like A. Request 1 and B. Request 2 that enables the approver to select which request he wants to consider.
				 */
    				System.out.println("Type in the request that you would like to approve");
		 /* This feature should link to the job request class and if he hits 1, the message approved is sent, or else
                 then the message disapproved will be sent. Before that, he/she must select which request he wants to approve/
                 disapprove first.
                 */
    				break;
    			  case 4:
    				 System.out.println("Casual staff");
			          System.out.println("See job requests");
				 /*In this feature, job requests need to be made available to the casual staff (time, duration of work, etc.) 
				   They will choose in the number formula e.g. 1. (Tutor for 3 months), 2. (Practical assistant for 1 month) and so on.
				  */
				 String staffname=null;
				 String staffID=null;
				 casualstaff c= new casualstaff(staffname,staffID);
				 System.out.println("Enter your name");
				 staffname=scan.nextLine();
				 System.out.println("Enter your ID");
				 staffID=scan.nextLine();
				 System.out.println("Hit 1 if you want to submit the request or hit 2 to cancel");
				 /*In this feature, he/she should be able to submit to course coordinator (Casual staff class to job request class to 
				  course coordinator class, if he/she hits 2, then it would return to the main menu.
				  */
    				break;
    			  default:

		System.out.println("Wrong number! Please try again!");
		break;
			  }

	}
	    else {
	    	System.out.println("Logout!");
	    }
	}
}
