package in.co.mymusic.proxies;

import com.fasterxml.jackson.databind.JsonNode;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import in.co.mymusic.dto.CoverArtResponse;
import in.co.mymusic.utils.ResponseParser;

@Service
public class CoverArtProxy {

  @Autowired
  private ApiRequester apiRequester;

  @Value("${coverart.host.url}")
  private String hostUrl;

  private String RELEASE_GROUP_URL;


  @PostConstruct
  public void init() {
    RELEASE_GROUP_URL = hostUrl + "release-group/";
  }

  public CoverArtResponse fetchByMbid(String mbid) {
    String url = RELEASE_GROUP_URL + mbid;
    System.out.println("hitting CoverArt url " + url);
    CoverArtResponse coverArtResponse = null;
    try {
      ResponseEntity<JsonNode> responseEntity =
          apiRequester.trigger(url, null, JsonNode.class, HttpMethod.GET);
      coverArtResponse = ResponseParser.coverArt.apply(responseEntity.getBody());
    } catch (Exception e) {
      System.out.println("error while fetching coverart for" + mbid);
      e.printStackTrace();
    }
    return coverArtResponse;
  }
}
