package com.ruoyi.web.websocket.pojo;

import java.io.Serializable;

public class Jxx implements Serializable {

  private String miyhid;
  private String toyhid;
  private String toqlid;

  public Jxx() {
  }

  public Jxx(String miyhid, String toyhid, String toqlid) {
    this.miyhid = miyhid;
    this.toyhid = toyhid;
    this.toqlid = toqlid;
  }

  public String getToqlid() {
    return toqlid;
  }

  public void setToqlid(String toqlid) {
    this.toqlid = toqlid;
  }

  public String getMiyhid() {
    return miyhid;
  }

  public void setMiyhid(String miyhid) {
    this.miyhid = miyhid;
  }

  public String getToyhid() {
    return toyhid;
  }

  public void setToyhid(String toyhid) {
    this.toyhid = toyhid;
  }
}
