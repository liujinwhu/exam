package com.lanshu.exam.handler;

import com.lanshu.exam.api.dto.SubjectDto;
import com.lanshu.exam.api.module.Answer;
import com.lanshu.exam.enums.SubjectTypeEnum;

import java.util.List;

/**
 * 统计成绩
 * @author Uncle Lan
 * @date 2019/12/8 9:56 下午
 */
public interface IAnswerHandler {

	String TRUE = Boolean.TRUE.toString();

	String FALSE = Boolean.FALSE.toString();

	/**
	 * 统计成绩
	 * @param answers answers
	 * @return HandleResult
	 */
	AnswerHandleResult handle(List<Answer> answers);

	/**
	 * 获取题目类型
	 * @return SubjectTypeEnum
	 */
	SubjectTypeEnum getSubjectType();

	/**
	 * 获取题目列表
	 * @param answers answers
	 * @return List
	 */
	List<SubjectDto> getSubjects(List<Answer> answers);

	/**
	 * 判断逻辑
	 * @param answer answer
	 * @param subject subject
	 * @param rightScore rightScore
	 */
	void judge(Answer answer, SubjectDto subject, List<Double> rightScore);

	/**
	 * 判断答题是否正确
	 * @param answer answer
	 * @param subject subject
	 */
	boolean judgeRight(Answer answer, SubjectDto subject);
}
