
public class JobRequest
{	
    String status;
    String requestCode;
    String requirement;
    String applicationDate;
    int hours;
    
    public JobRequest(String jobStatus, String jobRequestCode, String jobRequirement, String jobApplicationDate, int jobHours){
	status = jobStatus;
	requestCode = jobRequestCode;
	requirement = jobRequirement;
	applicationDate = jobApplicationDate;
	hours = jobHours;
	
    }

    private void submitRequest(){
	//Should write to request file, viewable by approvals
	System.out.print(status + "," + requestCode + "," + requirement + "," + hours);
	
    }
    
    private void sendInformation(){
	
    }
    
    private void sendJobSlot(){
	
    }
}
