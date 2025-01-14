package com.ruoyi.result.awardStudent.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.result.awardStudent.mapper.ResultStudentAwardMapper;
import com.ruoyi.result.awardStudent.domain.ResultStudentAward;
import com.ruoyi.result.awardStudent.service.IResultStudentAwardService;

/**
 * 学生获奖信息Service业务层处理
 *
 * @author ruoyi
 * @date 2025-01-14
 */
@Service
public class ResultStudentAwardServiceImpl implements IResultStudentAwardService
{
    @Autowired
    private ResultStudentAwardMapper resultStudentAwardMapper;

    /**
     * 查询学生获奖信息
     *
     * @param id 学生获奖信息主键
     * @return 学生获奖信息
     */
    @Override
    public ResultStudentAward selectResultStudentAwardById(Long id)
    {
        return resultStudentAwardMapper.selectResultStudentAwardById(id);
    }

    /**
     * 查询学生获奖信息列表
     *
     * @param resultStudentAward 学生获奖信息
     * @return 学生获奖信息
     */
    @Override
    public List<ResultStudentAward> selectResultStudentAwardList(ResultStudentAward resultStudentAward)
    {
        return resultStudentAwardMapper.selectResultStudentAwardList(resultStudentAward);
    }

    /**
     * 新增学生获奖信息
     *
     * @param resultStudentAward 学生获奖信息
     * @return 结果
     */
    @Override
    public int insertResultStudentAward(ResultStudentAward resultStudentAward)
    {
        return resultStudentAwardMapper.insertResultStudentAward(resultStudentAward);
    }

    /**
     * 修改学生获奖信息
     *
     * @param resultStudentAward 学生获奖信息
     * @return 结果
     */
    @Override
    public int updateResultStudentAward(ResultStudentAward resultStudentAward)
    {
        return resultStudentAwardMapper.updateResultStudentAward(resultStudentAward);
    }

    /**
     * 批量删除学生获奖信息
     *
     * @param ids 需要删除的学生获奖信息主键
     * @return 结果
     */
    @Override
    public int deleteResultStudentAwardByIds(Long[] ids)
    {
        return resultStudentAwardMapper.deleteResultStudentAwardByIds(ids);
    }

    /**
     * 删除学生获奖信息信息
     *
     * @param id 学生获奖信息主键
     * @return 结果
     */
    @Override
    public int deleteResultStudentAwardById(Long id)
    {
        return resultStudentAwardMapper.deleteResultStudentAwardById(id);
    }
}
