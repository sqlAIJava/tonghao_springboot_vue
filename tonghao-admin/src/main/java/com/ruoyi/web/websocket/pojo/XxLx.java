package com.ruoyi.web.websocket.pojo;

import java.io.Serializable;

public class XxLx implements Serializable {

  private Boolean toGr;
  private Boolean toQl;
  private Toxx toxx;

  private Boolean jGr;
  private Boolean jQl;
  private Jxx jxx;


  public XxLx(Boolean toGr, Boolean toQl, Toxx toxx, Boolean jGr, Boolean jQl, Jxx jxx) {
    this.toGr = toGr;
    this.toQl = toQl;
    this.toxx = toxx;
    this.jGr = jGr;
    this.jQl = jQl;
    this.jxx = jxx;
  }

  public Toxx getToxx() {
    return toxx;
  }

  public void setToxx(Toxx toxx) {
    this.toxx = toxx;
  }

  public Jxx getJxx() {
    return jxx;
  }

  public void setJxx(Jxx jxx) {
    this.jxx = jxx;
  }

  public XxLx() {
  }



  public XxLx(Boolean toGr, Boolean toQl, Boolean jGr, Boolean jQl) {
    this.toGr = toGr;
    this.toQl = toQl;
    this.jGr = jGr;
    this.jQl = jQl;
  }

  public Boolean getToGr() {
    return toGr;
  }

  public void setToGr(Boolean toGr) {
    this.toGr = toGr;
  }

  public Boolean getToQl() {
    return toQl;
  }

  public void setToQl(Boolean toQl) {
    this.toQl = toQl;
  }

  public Boolean getjGr() {
    return jGr;
  }

  public void setjGr(Boolean jGr) {
    this.jGr = jGr;
  }

  public Boolean getjQl() {
    return jQl;
  }

  public void setjQl(Boolean jQl) {
    this.jQl = jQl;
  }
}
