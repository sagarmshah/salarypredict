package salarypredict.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;

@JsonSerialize(include=Inclusion.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown=true)
public class MyResponse {

	String attributionURL;
	String countReturned;
	List<StateStats> stateStats;
	public String getAttributionURL() {
		return attributionURL;
	}
	public void setAttributionURL(String attributionURL) {
		this.attributionURL = attributionURL;
	}
	public String getCountReturned() {
		return countReturned;
	}
	public void setCountReturned(String countReturned) {
		this.countReturned = countReturned;
	}
	public List<StateStats> getStateStats() {
		return stateStats;
	}
	public void setStateStats(List<StateStats> stateStats) {
		this.stateStats = stateStats;
	}
	
	
}
