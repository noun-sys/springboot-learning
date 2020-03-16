package org.nounsys.nounservice.datasource.account.mapper;

import org.nounsys.nounservice.datasource.account.entity.EnterpriseVerification;

public interface EnterpriseVerificationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EnterpriseVerification record);

    int insertSelective(EnterpriseVerification record);

    EnterpriseVerification selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(EnterpriseVerification record);

    int updateByPrimaryKey(EnterpriseVerification record);
}