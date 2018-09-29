package in.co.mymusic.dto;

public class CoverArtImage {

  private Object types;
  private boolean front;
  private boolean back;
  private int edit;
  private String image;
  private String comment;
  private boolean approved;
  private Object thumbnails;
  private String id;

  public Object getTypes() {
    return types;
  }

  public CoverArtImage setTypes(Object types) {
    this.types = types;
    return this;
  }

  public boolean isFront() {
    return front;
  }

  public CoverArtImage setFront(boolean front) {
    this.front = front;
    return this;
  }

  public boolean isBack() {
    return back;
  }

  public CoverArtImage setBack(boolean back) {
    this.back = back;
    return this;
  }

  public int getEdit() {
    return edit;
  }

  public CoverArtImage setEdit(int edit) {
    this.edit = edit;
    return this;
  }

  public String getImage() {
    return image;
  }

  public CoverArtImage setImage(String image) {
    this.image = image;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public CoverArtImage setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public boolean isApproved() {
    return approved;
  }

  public CoverArtImage setApproved(boolean approved) {
    this.approved = approved;
    return this;
  }

  public Object getThumbnails() {
    return thumbnails;
  }

  public CoverArtImage setThumbnails(Object thumbnails) {
    this.thumbnails = thumbnails;
    return this;
  }

  public String getId() {
    return id;
  }

  public CoverArtImage setId(String id) {
    this.id = id;
    return this;
  }
}
