package com.rides.model;

public class ThemeParkRide {

  private Long id;
  private String name;
  private String description;
  private int thrillFactor;
  private int vomitFactor;

  public ThemeParkRide(
      Long id,
      String name,
      String description,
      int thrillFactor,
      int vomitFactor
  ) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.thrillFactor = thrillFactor;
    this.vomitFactor = vomitFactor;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public int getThrillFactor() {
    return thrillFactor;
  }

  public void setThrillFactor(int thrillFactor) {
    this.thrillFactor = thrillFactor;
  }

  public int getVomitFactor() {
    return vomitFactor;
  }

  public void setVomitFactor(int vomitFactor) {
    this.vomitFactor = vomitFactor;
  }
}
