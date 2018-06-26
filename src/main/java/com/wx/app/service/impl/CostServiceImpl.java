package com.wx.app.service.impl;

import com.wx.app.domain.CostGather;
import com.wx.app.domain.CostRecord;
import com.wx.app.repository.CostGatherRepository;
import com.wx.app.repository.CostRecordRepository;
import com.wx.app.service.CostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Date;

/**
 * <p>ClassName: CostServiceImpl</p>
 * <p>Description: 消费service实现类</p>
 *
 * @author xuqiquan
 * @version 1.0
 * @date 2018年06月26日 下午 16:20:06
 */
public class CostServiceImpl implements CostService {

    @Autowired
    CostRecordRepository costRecordRepository;

    @Autowired
    CostGatherRepository costGatherRepository;

    @Override
    public void newCost(CostRecord record) throws Exception {
        Date date = new Date();
        record.setCreateDate(date);
        costRecordRepository.save(record);
        costGatherRepository.gatherCost(record.getOpenid(),record.getCost());
    }

    @Override
    public Page<CostRecord> queryRecord(String openid, Pageable pageable) throws Exception {
        return null;
    }

    @Override
    public Page<CostGather> queryGather(String openid, Pageable pageable) throws Exception {
        return null;
    }
}
    