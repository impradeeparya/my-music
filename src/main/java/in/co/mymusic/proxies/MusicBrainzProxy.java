package in.co.mymusic.proxies;

import com.fasterxml.jackson.databind.JsonNode;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import in.co.mymusic.dto.MusicBrainzResponse;
import in.co.mymusic.utils.ResponseParser;

@Service
public class MusicBrainzProxy {

  @Autowired
  private ApiRequester apiRequester;

  @Value("${musicbraniz.host.url}")
  private String hostUrl;

  private String ARTIST_URL;

  private String urlParams = "&inc=url-rels+release-groups";

  @PostConstruct
  public void init() {
    ARTIST_URL = hostUrl + "artist/";
  }

  public MusicBrainzResponse fetchByMbid(String mbid) {
    String url = ARTIST_URL + mbid + "?" + urlParams;
    ResponseEntity<JsonNode> responseEntity =
        apiRequester.trigger(url, null, JsonNode.class, HttpMethod.GET);
    return ResponseParser.musicBrainz.apply(responseEntity.getBody());
  }
}
