package in.co.mymusic.dto;

import java.util.List;

public class MusicBrainzResponse {

  private String type;
  private String sortName;
  private Object ipis;
  private Object endArea;
  private List<MusicBrainzReleaseGroup> releaseGroups;
  private String country;
  private String typeId;
  private String genderId;
  private Object area;
  private String disambiguation;
  private String id;
  private String name;
  private String gender;
  private Object beginArea;
  private Object isnis;
  private List<MusicBrainzRelation> relations;
  private Object lifeSpan;

  public String getType() {
    return type;
  }

  public MusicBrainzResponse setType(String type) {
    this.type = type;
    return this;
  }

  public String getSortName() {
    return sortName;
  }

  public MusicBrainzResponse setSortName(String sortName) {
    this.sortName = sortName;
    return this;
  }

  public Object getIpis() {
    return ipis;
  }

  public MusicBrainzResponse setIpis(Object ipis) {
    this.ipis = ipis;
    return this;
  }

  public Object getEndArea() {
    return endArea;
  }

  public MusicBrainzResponse setEndArea(Object endArea) {
    this.endArea = endArea;
    return this;
  }

  public List<MusicBrainzReleaseGroup> getReleaseGroups() {
    return releaseGroups;
  }

  public MusicBrainzResponse setReleaseGroups(List<MusicBrainzReleaseGroup> releaseGroups) {
    this.releaseGroups = releaseGroups;
    return this;
  }

  public String getCountry() {
    return country;
  }

  public MusicBrainzResponse setCountry(String country) {
    this.country = country;
    return this;
  }

  public String getTypeId() {
    return typeId;
  }

  public MusicBrainzResponse setTypeId(String typeId) {
    this.typeId = typeId;
    return this;
  }

  public String getGenderId() {
    return genderId;
  }

  public MusicBrainzResponse setGenderId(String genderId) {
    this.genderId = genderId;
    return this;
  }

  public Object getArea() {
    return area;
  }

  public MusicBrainzResponse setArea(Object area) {
    this.area = area;
    return this;
  }

  public String getDisambiguation() {
    return disambiguation;
  }

  public MusicBrainzResponse setDisambiguation(String disambiguation) {
    this.disambiguation = disambiguation;
    return this;
  }

  public String getId() {
    return id;
  }

  public MusicBrainzResponse setId(String id) {
    this.id = id;
    return this;
  }

  public String getName() {
    return name;
  }

  public MusicBrainzResponse setName(String name) {
    this.name = name;
    return this;
  }

  public String getGender() {
    return gender;
  }

  public MusicBrainzResponse setGender(String gender) {
    this.gender = gender;
    return this;
  }

  public Object getBeginArea() {
    return beginArea;
  }

  public MusicBrainzResponse setBeginArea(Object beginArea) {
    this.beginArea = beginArea;
    return this;
  }

  public Object getIsnis() {
    return isnis;
  }

  public MusicBrainzResponse setIsnis(Object isnis) {
    this.isnis = isnis;
    return this;
  }

  public List<MusicBrainzRelation> getRelations() {
    return relations;
  }

  public MusicBrainzResponse setRelations(List<MusicBrainzRelation> relations) {
    this.relations = relations;
    return this;
  }

  public Object getLifeSpan() {
    return lifeSpan;
  }

  public MusicBrainzResponse setLifeSpan(Object lifeSpan) {
    this.lifeSpan = lifeSpan;
    return this;
  }
}
