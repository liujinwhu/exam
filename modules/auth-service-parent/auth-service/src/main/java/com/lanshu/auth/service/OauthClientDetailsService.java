package com.lanshu.auth.service;

import com.lanshu.auth.api.module.OauthClientDetails;
import com.lanshu.auth.mapper.OauthClientDetailsMapper;
import com.lanshu.common.core.service.CrudService;
import org.springframework.stereotype.Service;

/**
 * Oauth2客户端Service
 *
 * @author Uncle Lan
 * @date 2019/3/30 16:48
 */
@Service
public class OauthClientDetailsService extends CrudService<OauthClientDetailsMapper, OauthClientDetails> {
}
