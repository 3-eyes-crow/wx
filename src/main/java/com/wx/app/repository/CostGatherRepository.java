package com.wx.app.repository;

import com.wx.app.domain.CostGather;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

/**
 * <p>ClassName: CostGatherRepository</p>
 * <p>Description: </p>
 *
 * @author xuqiquan
 * @version 1.0
 * @date 2018年06月26日 下午 16:22:42
 */
public interface CostGatherRepository extends JpaRepository<CostGather, Long> {
    Page<CostGather> queryByOpenid(String openid, Pageable pageable);

    @Modifying
    @Query("insert into xqq_cost_gather(openid,cost,gather_date)  values(?1,?2,DATE_FORMAT(NOW(),'%Y-%m')) " +
            "on  DUPLICATE key update cost=cost+VALUES(cost)")
    void gatherCost(String openid, double cost);
}
    