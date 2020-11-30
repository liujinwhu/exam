package com.lanshu.user.mapper;

import com.lanshu.common.core.persistence.CrudMapper;
import com.lanshu.user.api.module.Student;
import org.apache.ibatis.annotations.Mapper;

/**
 * 学生Mapper
 *
 * @author Uncle Lan
 * @date 2019/07/09 15:27
 */
@Mapper
public interface StudentMapper extends CrudMapper<Student> {
}
