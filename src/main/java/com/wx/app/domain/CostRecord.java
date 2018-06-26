package com.wx.app.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>ClassName: CostRecord</p>
 * <p>Description: 消费记录实体类</p>
 *
 * @author xuqiquan
 * @version 1.0
 * @date 2018年06月25日 上午09:24:14
 */
@Entity(name = "XQQ_COST_RECORD")
public class CostRecord implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String openid;

    private Double cost;

    private String costType;

    private Date createDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getCostType() {
        return costType;
    }

    public void setCostType(String costType) {
        this.costType = costType;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public CostRecord() {
    }

    public CostRecord(String openid, Double cost, String costType, Date createDate) {
        this.openid = openid;
        this.cost = cost;
        this.costType = costType;
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "CostRecord{" +
                "id=" + id +
                ", openid='" + openid + '\'' +
                ", cost=" + cost +
                ", costType='" + costType + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}
    