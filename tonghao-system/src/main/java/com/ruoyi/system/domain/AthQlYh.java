package com.ruoyi.system.domain;

import java.io.Serializable;
import java.time.LocalDateTime;


public class AthQlYh implements Serializable {

  private Integer id;
  private Integer qlid;
  private Integer yhid;
  private LocalDateTime jqsj;

  public AthQlYh() {
  }

  public AthQlYh(Integer id, Integer qlid, Integer yhid, LocalDateTime jqsj) {
    this.id = id;
    this.qlid = qlid;
    this.yhid = yhid;
    this.jqsj = jqsj;
  }

  public LocalDateTime getJqsj() {
    return jqsj;
  }

  public void setJqsj(LocalDateTime jqsj) {
    this.jqsj = jqsj;
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
}
