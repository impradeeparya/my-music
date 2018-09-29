package in.co.mymusic.proxies;

import javax.annotation.PostConstruct;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiRequester {

  private RestTemplate restTemplate;

  @PostConstruct
  public void init() {
    restTemplate = new RestTemplate();
  }

  public <T> ResponseEntity<T> trigger(String url, HttpEntity<T> requestEntity,
      Class<T> responseType, HttpMethod httpMethod) {
    return restTemplate.exchange(url, httpMethod, requestEntity, responseType);
  }
}
