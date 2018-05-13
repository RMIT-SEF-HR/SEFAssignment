package Approval;

public class Approval {
        
    public int state; // values: 0 - new, 1 - assigned, 2 - In progress, 3 - Pending, 4 - Approved, 5 - Disapproved, 6 - cancelled
    public Request request;

    // one constructor
    public Approval(Request a_req) {
        request = a_req;
        state = 0;
    }
        
    // Assess_Approval_state - assess the present state and progress if appropriate
    public void Assess_Approval_state() {
        if (state == 0) state = 1;
        else if (state == 1) state = 2;
        else if (state == 2) state = 3;  // state progress to pending
        // else if (state == 3) state = 4;  // uncomment to auto approve
    }
        
    public String getState() {
        if (state == 0) return "new";
        if (state == 1) return "assigned";
        if (state == 2) return "in progress";
        if (state == 3) return "pending";
        if (state == 4) return "approved";
        if (state == 5) return "disapproved";
        if (state == 6) return "cancelled";
        return "";
    }
        
}