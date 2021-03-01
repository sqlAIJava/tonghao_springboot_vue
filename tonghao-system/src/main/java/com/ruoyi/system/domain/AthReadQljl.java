package com.ruoyi.system.domain;

import java.io.Serializable;

public class AthReadQljl implements Serializable {

  private Integer id;
  private Integer qljlid;
  private Integer yhid;
  private Integer isread; // 1：读了；0：没读

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getQljlid() {
    return qljlid;
  }

  public void setQljlid(Integer qljlid) {
    this.qljlid = qljlid;
  }

  public Integer getYhid() {
    return yhid;
  }

  public void setYhid(Integer yhid) {
    this.yhid = yhid;
  }

  public Integer getIsread() {
    return isread;
  }

  public void setIsread(Integer isread) {
    this.isread = isread;
  }

  public AthReadQljl() {
  }

  public AthReadQljl(Integer id, Integer qljlid, Integer yhid, Integer isread) {
    this.id = id;
    this.qljlid = qljlid;
    this.yhid = yhid;
    this.isread = isread;
  }
}
