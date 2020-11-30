package com.lanshu.user.mapper;

import com.lanshu.common.core.persistence.CrudMapper;
import com.lanshu.user.api.module.Attachment;
import org.apache.ibatis.annotations.Mapper;

/**
 * 附件mapper
 *
 * @author Uncle Lan
 * @date 2018/10/30 20:55
 */
@Mapper
public interface AttachmentMapper extends CrudMapper<Attachment> {
}
