package com.dao.mapper;

import com.dao.entity.CrlLoanFeeRecordsEntity;

public interface CrlLoanFeeRecordsEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CrlLoanFeeRecordsEntity record);

    int insertSelective(CrlLoanFeeRecordsEntity record);

    CrlLoanFeeRecordsEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CrlLoanFeeRecordsEntity record);

    int updateByPrimaryKey(CrlLoanFeeRecordsEntity record);
}