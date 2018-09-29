package in.co.mymusic.dto;

public class MusicBrainzRelation {

  private MusicBrainUrl url;
  private String type;

  public MusicBrainUrl getUrl() {
    return url;
  }

  public MusicBrainzRelation setUrl(MusicBrainUrl url) {
    this.url = url;
    return this;
  }

  public String getType() {
    return type;
  }

  public MusicBrainzRelation setType(String type) {
    this.type = type;
    return this;
  }
}
