package salarypredict.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import salarypredict.util.JsonUtils;

@Service
public class SPDaoImp implements SPDao {

	private static final Logger log = LoggerFactory.getLogger(SPDaoImp.class);

	@Value("${gd.endpoint}")
	private String gdEndpoint;
	@Value("${gd.partnerId}")
	private String partnerId;
	@Value("${gd.partnerKey}")
	private String partnerKey;
	@Value("${gd.endUserIP}")
	private String endUserIP;
	@Value("${gd.jsonFormat}")
	private String jsonFormat;
	@Value("${gd.action}")
	private String action;

	@Autowired
	protected RestTemplate restTemplate;

	protected JsonUtils jsonUtils;

	@Override
	public String getSalary(String jobTitle) {
		
		String URL = "%st.p=%s&t.k=%s&userip=%s&useragent=&format=%s&v=1&action=%s&countryId=1&jobTitle=%s";
		URL = String.format(URL, gdEndpoint, partnerId, partnerKey, endUserIP, jsonFormat, action, jobTitle);

		log.info("url - " + URL);

		String salary = jsonUtils.getSalaryFromJSON(restTemplate.getForObject(URL, String.class));

		return salary;
	}

}
