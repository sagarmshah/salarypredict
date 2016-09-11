package salarypredict.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import salarypredict.dao.SPDao;
import salarypredict.model.JobsStats;
import salarypredict.util.JsonUtils;

@Service
public class SPServiceImp implements SPService {

	@Autowired
	SPDao spDao;

	private static final Logger log = LoggerFactory.getLogger(JsonUtils.class);	

	
	public String getSalary(String jobTitle){
		
		return spDao.getSalary(jobTitle);
	}
	
	
	

	

}
