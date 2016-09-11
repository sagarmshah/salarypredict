package salarypredict.util;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class JsonUtils {

	private static final Logger LOGGER = LoggerFactory.getLogger(JsonUtils.class);	
	private static JSONObject jObject;

	
	public static String getSalaryFromJSON(String output) {
		try {
			if(output==null) {
				return null;
			}
			
			jObject  = new JSONObject(output);			
			JSONObject data = jObject.getJSONObject("response");


			return data.get("payMedian").toString();

		} catch (Exception e) {
			LOGGER .warn(e.getMessage(), e);
			return null;
		}
    }







}
