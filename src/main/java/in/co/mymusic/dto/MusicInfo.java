package in.co.mymusic.dto;

import java.util.List;

public class MusicInfo {

  private String mbid;
  private String description;
  private List<AlbumInfo> albums;

  public String getMbid() {
    return mbid;
  }

  public MusicInfo setMbid(String mbid) {
    this.mbid = mbid;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public MusicInfo setDescription(String description) {
    this.description = description;
    return this;
  }

  public List<AlbumInfo> getAlbums() {
    return albums;
  }

  public MusicInfo setAlbums(List<AlbumInfo> albums) {
    this.albums = albums;
    return this;
  }
}
