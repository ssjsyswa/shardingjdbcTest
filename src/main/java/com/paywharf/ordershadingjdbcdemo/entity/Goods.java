package com.paywharf.ordershadingjdbcdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author CodeGenerator
 * @since 2020-11-11
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Goods implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 主键id
     */
    private String gid;

    /**
     * 商品名称
     */
    private String gname;

    /**
     * 用户有id
     */
    private String userId;

    /**
     * 商品状态
     */
    private String gstatus;

    private Long id;

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getGstatus() {
        return gstatus;
    }

    public void setGstatus(String gstatus) {
        this.gstatus = gstatus;
    }
    
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
    public String toString() {
        return "Goods{" +
        "gid=" + gid +
        ", gname=" + gname +
        ", userId=" + userId +
        ", gstatus=" + gstatus +
        ", id=" + id +
        "}";
    }
}
