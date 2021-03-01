package com.ruoyi.system.domain;

import java.io.Serializable;

public class AthUser implements Serializable {

  private Integer id;
  private String yhm;
  private String mm;
  private String email;
  private String tx;
  private String je;

  public AthUser() {
  }

  public AthUser(Integer id, String yhm, String mm, String email, String tx, String je) {
    this.id = id;
    this.yhm = yhm;
    this.mm = mm;
    this.email = email;
    this.tx = tx;
    this.je = je;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getYhm() {
    return yhm;
  }

  public void setYhm(String yhm) {
    this.yhm = yhm;
  }

  public String getMm() {
    return mm;
  }

  public void setMm(String mm) {
    this.mm = mm;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getTx() {
    return tx;
  }

  public void setTx(String tx) {
    this.tx = tx;
  }

  public String getJe() {
    return je;
  }

  public void setJe(String je) {
    this.je = je;
  }
}
