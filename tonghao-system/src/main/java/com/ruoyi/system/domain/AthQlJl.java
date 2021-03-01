package com.ruoyi.system.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

public class AthQlJl implements Serializable {

  private Integer id;
  private Integer qlid;
  private Integer yhid;
  private String xxlx; // 文字 图片
  private String xx;
  private LocalDateTime time;

  public AthQlJl() {
  }

  public AthQlJl(Integer id, Integer qlid, Integer yhid, String xxlx, String xx, LocalDateTime time) {
    this.id = id;
    this.qlid = qlid;
    this.yhid = yhid;
    this.xxlx = xxlx;
    this.xx = xx;
    this.time = time;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getQlid() {
    return qlid;
  }

  public void setQlid(Integer qlid) {
    this.qlid = qlid;
  }

  public Integer getYhid() {
    return yhid;
  }

  public void setYhid(Integer yhid) {
    this.yhid = yhid;
  }

  public String getXxlx() {
    return xxlx;
  }

  public void setXxlx(String xxlx) {
    this.xxlx = xxlx;
  }

  public String getXx() {
    return xx;
  }

  public void setXx(String xx) {
    this.xx = xx;
  }

  public LocalDateTime getTime() {
    return time;
  }

  public void setTime(LocalDateTime time) {
    this.time = time;
  }
}
