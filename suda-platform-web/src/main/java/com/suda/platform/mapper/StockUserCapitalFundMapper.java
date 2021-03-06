package com.suda.platform.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.suda.platform.entity.StockUserCapitalFund;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * <p>
 * 个人可提现资产 Mapper 接口
 * </p>
 *
 * @author 张龙飞
 * @since 2019-04-16
 */
public interface StockUserCapitalFundMapper extends BaseMapper<StockUserCapitalFund> {
    /**
     * 根据记录id更新资产
     *
     * @param id
     * @param money
     * @return
     */
    int updateRechargeById(@Param("id") Long id, @Param("money") BigDecimal money);
}
