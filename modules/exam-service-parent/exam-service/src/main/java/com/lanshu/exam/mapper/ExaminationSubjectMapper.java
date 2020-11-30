package com.lanshu.exam.mapper;

import com.lanshu.common.core.persistence.CrudMapper;
import com.lanshu.exam.api.module.ExaminationSubject;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 考试题目关联mapper
 *
 * @author Uncle Lan
 * @date 2019/6/16 15:37
 */
@Mapper
public interface ExaminationSubjectMapper extends CrudMapper<ExaminationSubject> {

    /**
     * 根据题目ID删除
     *
     * @param examinationSubject examinationSubject
     * @return int
     * @author Uncle Lan
     * @date 2019/06/16 21:58
     */
    int deleteBySubjectId(ExaminationSubject examinationSubject);

    /**
     * 根据题目ID查询
     *
     * @param examinationSubject examinationSubject
     * @return List
     * @author Uncle Lan
     * @date 2019/06/17 12:18
     */
    List<ExaminationSubject> findListBySubjectId(ExaminationSubject examinationSubject);

    /**
     * 根据考试id查询题目id列表
     *
     * @param examinationId examinationId
     * @return List
     * @author Uncle Lan
     * @date 2019/06/18 14:37
     */
    List<ExaminationSubject> findListByExaminationId(Long examinationId);

    /**
     * 根据考试ID和题目序号查询
     *
     * @param examinationSubject examinationSubject
     * @return ExaminationSubject
     * @author Uncle Lan
     * @date 2019/06/18 23:17
     */
    ExaminationSubject findByExaminationIdAndSubjectId(ExaminationSubject examinationSubject);

    /**
     * 根据上一题ID查询下一题
     *
     * @param examinationSubject examinationSubject
     * @return ExaminationSubject
     * @author Uncle Lan
     * @date 2019-09-14 16:41
     */
    ExaminationSubject getByPreviousId(ExaminationSubject examinationSubject);

    /**
     * 根据当前题目ID查询上一题
     *
     * @param examinationSubject examinationSubject
     * @return ExaminationSubject
     * @author Uncle Lan
     * @date 2019/10/07 20:40:16
     */
    ExaminationSubject getPreviousByCurrentId(ExaminationSubject examinationSubject);

    /**
     * 根据分类id查询
     *
     * @param examinationSubject examinationSubject
     * @return List
     * @author Uncle Lan
     * @date 2019/10/24 21:47:24
     */
    List<ExaminationSubject> findListByCategoryId(ExaminationSubject examinationSubject);
}
