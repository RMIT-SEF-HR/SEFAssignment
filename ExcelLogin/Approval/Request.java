package Approval;

public class Request {
    
    public int request_type; // values: 0 - job request, 1 - course request, etc
    public String request_description;

    // one constructor
    public Request(int a_req_type, String a_req_desc) {
        request_type = a_req_type;
        request_description = a_req_desc;
    }
}
