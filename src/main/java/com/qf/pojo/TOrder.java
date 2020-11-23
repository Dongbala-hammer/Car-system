package com.qf.pojo;

import lombok.Data;

@Data
public class TOrder {

  private Integer oid;
  private Integer cid;
  private Integer uid;
  private Integer tgetid;
  private Integer tbackid;
  private Double oprice;
  private String ostatus;


}
