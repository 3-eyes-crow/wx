package com.wx.app.repository;

import com.wx.app.domain.CostRecord;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * <p>ClassName: CostRecordRepository</p>
 * <p>Description: </p>
 *
 * @author xuqiquan
 * @version 1.0
 * @date 2018年06月25日 上午09:33:40
 */
public interface CostRecordRepository extends JpaRepository<CostRecord, Long> {
    List<CostRecord> findByOpenid(String openid);

}
    