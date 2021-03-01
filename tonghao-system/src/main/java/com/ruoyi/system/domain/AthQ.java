package com.ruoyi.system.domain;

import java.io.Serializable;

public class AthQ implements Serializable {

  private Integer id;
  private String name;
  private Integer qzid;
  private String tx;
  private String js;


  public String getJs() {
    return js;
  }

  public void setJs(String js) {
    this.js = js;
  }

  public String getTx() {
    return tx;
  }

  public void setTx(String tx) {
    this.tx = tx;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getQzid() {
    return qzid;
  }

  public void setQzid(Integer qzid) {
    this.qzid = qzid;
  }

  public AthQ() {
  }

  public AthQ(Integer id, String name, Integer qzid) {
    this.id = id;
    this.name = name;
    this.qzid = qzid;
  }
}
