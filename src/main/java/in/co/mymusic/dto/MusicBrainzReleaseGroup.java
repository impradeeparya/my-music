package in.co.mymusic.dto;

public class MusicBrainzReleaseGroup {

  private String title;
  private String id;

  public String getTitle() {
    return title;
  }

  public MusicBrainzReleaseGroup setTitle(String title) {
    this.title = title;
    return this;
  }

  public String getId() {
    return id;
  }

  public MusicBrainzReleaseGroup setId(String id) {
    this.id = id;
    return this;
  }
}
