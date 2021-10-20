package com.paywharf.ordershadingjdbcdemo.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author CodeGenerator
 * @since 2020-11-30
 */
public class Tabrecord implements Serializable {

    private static final long serialVersionUID=1L;

    private Long id;

    private String tname;


    private String remark;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }


    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Tabrecord{" +
        "id=" + id +
        ", tname=" + tname +
        ", remark=" + remark +
        "}";
    }
}
