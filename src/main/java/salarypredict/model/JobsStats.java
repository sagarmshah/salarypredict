package salarypredict.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;

@JsonSerialize(include=Inclusion.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown=true)
public class JobsStats {
	
	String success;
	String status;
	String jsessionid;
	MyResponse response;
	
	public String getSuccess() {
		return success;
	}
	public void setSuccess(String success) {
		this.success = success;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getJsessionid() {
		return jsessionid;
	}
	public void setJsessionid(String jsessionid) {
		this.jsessionid = jsessionid;
	}
	public MyResponse getResponse() {
		return response;
	}
	public void setResponse(MyResponse response) {
		this.response = response;
	}
	
	

}
