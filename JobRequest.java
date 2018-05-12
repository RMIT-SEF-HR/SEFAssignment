public class JobRequest

{	

    private String jobStatus;

    private String jobRequestCode;

    private String jobRequirement;

    private String jobApplicationDate;

    private int jobHours;

    

    public JobRequest(String jobStatus, String jobRequestCode, String jobRequirement, String jobApplicationDate, int jobHours){

	this.jobStatus = jobStatus;

	this.jobRequestCode = jobRequestCode;

	this.jobRequirement = jobRequirement;

	this.jobApplicationDate = jobApplicationDate;

	this.jobHours = jobHours;
    }

public String getjobRequestCode() {
	return jobRequestCode;
}
public void setjobRequestCode(String jobRequestCode) {
	this.jobRequestCode=jobRequestCode;
}

public String getjobRequirement() {
	return jobRequirement;
}

public void setjobRequirement(String jobRequirement) {
	this.jobRequirement=jobRequirement;
}

public int setjobHours() {
	return jobHours;
}

public void setjobHours(int jobHours) {
	this.jobHours=jobHours;
}
}
