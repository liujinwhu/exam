package com.lanshu.auth.mapper;

import com.lanshu.auth.api.module.OauthClientDetails;
import com.lanshu.common.core.persistence.CrudMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * Oauth2客户端mapper
 *
 * @author Uncle Lan
 * @date 2019/3/30 16:39
 */
@Mapper
public interface OauthClientDetailsMapper extends CrudMapper<OauthClientDetails> {
}
