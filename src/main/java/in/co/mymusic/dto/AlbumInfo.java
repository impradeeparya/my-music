package in.co.mymusic.dto;

public class AlbumInfo {

  private String title;
  private String id;
  private String image;

  public String getTitle() {
    return title;
  }

  public AlbumInfo setTitle(String title) {
    this.title = title;
    return this;
  }

  public String getId() {
    return id;
  }

  public AlbumInfo setId(String id) {
    this.id = id;
    return this;
  }

  public String getImage() {
    return image;
  }

  public AlbumInfo setImage(String image) {
    this.image = image;
    return this;
  }
}
