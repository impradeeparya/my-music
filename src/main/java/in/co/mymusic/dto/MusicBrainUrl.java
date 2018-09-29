package in.co.mymusic.dto;

public class MusicBrainUrl {

  private String resource;
  private String id;

  public String getResource() {
    return resource;
  }

  public MusicBrainUrl setResource(String resource) {
    this.resource = resource;
    return this;
  }

  public String getId() {
    return id;
  }

  public MusicBrainUrl setId(String id) {
    this.id = id;
    return this;
  }
}
