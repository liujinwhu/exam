package com.lanshu.exam.mapper;

import com.lanshu.common.core.persistence.CrudMapper;
import com.lanshu.exam.api.module.Answer;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 答题Mapper
 *
 * @author Uncle Lan
 * @date 2018/11/8 21:09
 */
@Mapper
public interface AnswerMapper extends CrudMapper<Answer> {

    /**
     * 根据用户ID、考试ID、考试记录ID、题目ID查找答题
     *
     * @param answer answer
     * @return Answer
     * @author Uncle Lan
     * @date 2019/01/21 19:38
     */
    Answer getAnswer(Answer answer);

    /**
     * 根据examRecordId查询
     * @param examRecordId examRecordId
     * @return List
     * @author Uncle Lan
     * @date 2020/2/21 1:08 下午
     */
    List<Answer> findListByExamRecordId(Long examRecordId);
}
