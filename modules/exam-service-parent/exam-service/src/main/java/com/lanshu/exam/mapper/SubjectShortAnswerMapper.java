package com.lanshu.exam.mapper;

import com.lanshu.common.core.persistence.CrudMapper;
import com.lanshu.exam.api.module.SubjectShortAnswer;
import org.apache.ibatis.annotations.Mapper;

/**
 * 简答题Mapper
 *
 * @author Uncle Lan
 * @date 2016/6/16 14:52
 */
@Mapper
public interface SubjectShortAnswerMapper extends CrudMapper<SubjectShortAnswer> {

    /**
     * 物理删除
     *
     * @param subjectShortAnswer subjectShortAnswer
     * @return int
     * @author Uncle Lan
     * @date 2019/06/16 22:54
     */
    int physicalDelete(SubjectShortAnswer subjectShortAnswer);

    /**
     * 物理批量删除
     *
     * @param ids ids
     * @return int
     * @author Uncle Lan
     * @date 2019/06/16 22:54
     */
    int physicalDeleteAll(Long[] ids);
}
