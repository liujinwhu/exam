package com.lanshu.exam.mapper;

import com.lanshu.common.core.persistence.CrudMapper;
import com.lanshu.exam.api.module.SubjectCategory;
import org.apache.ibatis.annotations.Mapper;

/**
 * 题目分类Mapper
 *
 * @author Uncle Lan
 * @date 2018/12/4 21:48
 */
@Mapper
public interface SubjectCategoryMapper extends CrudMapper<SubjectCategory> {
}
