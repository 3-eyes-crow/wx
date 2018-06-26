package com.wx.app.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>ClassName: CostGather</p>
 * <p>Description: 消费汇总实体类</p>
 *
 * @author xuqiquan
 * @version 1.0
 * @date 2018年06月25日 上午09:28:52
 */
@Entity(name = "XQQ_COST_GATHER")
public class CostGather implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String openid;

    private Double cost;

    private Date gatherDate;

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

    public Date getGatherDate() {
        return gatherDate;
    }

    public void setGatherDate(Date gatherDate) {
        this.gatherDate = gatherDate;
    }

    @Override
    public String toString() {
        return "CostGather{" +
                "id=" + id +
                ", openid='" + openid + '\'' +
                ", cost=" + cost +
                ", gatherDate=" + gatherDate +
                '}';
    }
}
    