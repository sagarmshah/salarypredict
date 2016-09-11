package salarypredict.util;


import java.io.IOException;
import java.net.URI;

import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RequestCallback;
import org.springframework.web.client.ResponseExtractor;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Component
public class CustomRestTemplate extends RestTemplate {
	 
    private MediaType defaultResponseContentType = MediaType.APPLICATION_XML;
 
    public CustomRestTemplate() {
        super();
    }
 
    public CustomRestTemplate(ClientHttpRequestFactory requestFactory) {
        super(requestFactory);
    }
 
    public void setDefaultResponseContentType(String defaultResponseContentType) {
        this.defaultResponseContentType = MediaType.parseMediaType(defaultResponseContentType);
    }
 
    @Override
    protected <T> T doExecute(URI url, HttpMethod method, RequestCallback requestCallback, final ResponseExtractor<T> responseExtractor)
            throws RestClientException {
 
        return super.doExecute(url, method, requestCallback, new ResponseExtractor<T>() {
            public T extractData(ClientHttpResponse response) throws IOException {
                response.getHeaders().setContentType(defaultResponseContentType);
                return responseExtractor.extractData(response);
            }
        });
    }
}
