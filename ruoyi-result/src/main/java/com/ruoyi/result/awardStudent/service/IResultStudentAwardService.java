package com.ruoyi.result.awardStudent.service;

import java.util.List;
import com.ruoyi.result.awardStudent.domain.ResultStudentAward;

/**
 * 学生获奖信息Service接口
 *
 * @author ruoyi
 * @date 2025-01-14
 */
public interface IResultStudentAwardService
{
    /**
     * 查询学生获奖信息
     *
     * @param id 学生获奖信息主键
     * @return 学生获奖信息
     */
    public ResultStudentAward selectResultStudentAwardById(Long id);

    /**
     * 查询学生获奖信息列表
     *
     * @param resultStudentAward 学生获奖信息
     * @return 学生获奖信息集合
     */
    public List<ResultStudentAward> selectResultStudentAwardList(ResultStudentAward resultStudentAward);

    /**
     * 新增学生获奖信息
     *
     * @param resultStudentAward 学生获奖信息
     * @return 结果
     */
    public int insertResultStudentAward(ResultStudentAward resultStudentAward);

    /**
     * 修改学生获奖信息
     *
     * @param resultStudentAward 学生获奖信息
     * @return 结果
     */
    public int updateResultStudentAward(ResultStudentAward resultStudentAward);

    /**
     * 批量删除学生获奖信息
     *
     * @param ids 需要删除的学生获奖信息主键集合
     * @return 结果
     */
    public int deleteResultStudentAwardByIds(Long[] ids);

    /**
     * 删除学生获奖信息信息
     *
     * @param id 学生获奖信息主键
     * @return 结果
     */
    public int deleteResultStudentAwardById(Long id);
}
