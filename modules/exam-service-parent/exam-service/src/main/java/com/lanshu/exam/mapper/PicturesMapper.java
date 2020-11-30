package com.lanshu.exam.mapper;

import com.lanshu.common.core.persistence.CrudMapper;
import com.lanshu.exam.api.module.Pictures;
import org.apache.ibatis.annotations.Mapper;

/**
 * 图片mapper
 *
 * @author Uncle Lan
 * @date 2019/6/16 14:50
 */
@Mapper
public interface PicturesMapper extends CrudMapper<Pictures> {
}
