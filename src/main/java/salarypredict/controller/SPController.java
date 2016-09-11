package salarypredict.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import salarypredict.model.JobsStats;
import salarypredict.service.SPService;


@Controller
@ResponseBody
@RequestMapping(value="/salary-predict", produces=MediaType.APPLICATION_JSON_VALUE)
public class SPController {
	
	@RequestMapping(value="/")
	public String welcomeMessage(){
		String welcomeMsg="Welcome To Salary Prediction App";
		String steps="\nEnter a job type following the url";
		return welcomeMsg+steps;
	}
	
	

	@Autowired
	private SPService spService;
	
	

	@RequestMapping(value="/usa/{jobTitle}")
	public String getSalary(@PathVariable("jobTitle") final String jobTitle){
		return spService.getSalary(jobTitle);
	}
	
	
	
}
