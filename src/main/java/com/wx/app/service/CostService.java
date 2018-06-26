package com.wx.app.service;

import com.wx.app.domain.CostGather;
import com.wx.app.domain.CostRecord;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * <p>ClassName: CostService</p>
 * <p>Description: 消费service</p>
 *
 * @author xuqiquan
 * @version 1.0
 * @date 2018年06月26日 下午 15:43:05
 */
public interface CostService {

    void newCost(CostRecord record) throws Exception;

    Page<CostRecord> queryRecord(String openid, Pageable pageable) throws Exception;

    Page<CostGather> queryGather(String openid, Pageable pageable) throws Exception;
}
    