package com.ruoyi.result.award.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.result.award.mapper.ResultPersonalAwardMapper;
import com.ruoyi.result.award.domain.ResultPersonalAward;
import com.ruoyi.result.award.service.IResultPersonalAwardService;

/**
 * 个人获奖Service业务层处理
 *
 * @author ruoyi
 * @date 2025-01-14
 */
@Service
public class ResultPersonalAwardServiceImpl implements IResultPersonalAwardService
{
    @Autowired
    private ResultPersonalAwardMapper resultPersonalAwardMapper;

    /**
     * 查询个人获奖
     *
     * @param id 个人获奖主键
     * @return 个人获奖
     */
    @Override
    public ResultPersonalAward selectResultPersonalAwardById(Long id)
    {
        return resultPersonalAwardMapper.selectResultPersonalAwardById(id);
    }

    /**
     * 查询个人获奖列表
     *
     * @param resultPersonalAward 个人获奖
     * @return 个人获奖
     */
    @Override
    public List<ResultPersonalAward> selectResultPersonalAwardList(ResultPersonalAward resultPersonalAward)
    {
        return resultPersonalAwardMapper.selectResultPersonalAwardList(resultPersonalAward);
    }

    /**
     * 新增个人获奖
     *
     * @param resultPersonalAward 个人获奖
     * @return 结果
     */
    @Override
    public int insertResultPersonalAward(ResultPersonalAward resultPersonalAward)
    {
        return resultPersonalAwardMapper.insertResultPersonalAward(resultPersonalAward);
    }

    /**
     * 修改个人获奖
     *
     * @param resultPersonalAward 个人获奖
     * @return 结果
     */
    @Override
    public int updateResultPersonalAward(ResultPersonalAward resultPersonalAward)
    {
        return resultPersonalAwardMapper.updateResultPersonalAward(resultPersonalAward);
    }

    /**
     * 批量删除个人获奖
     *
     * @param ids 需要删除的个人获奖主键
     * @return 结果
     */
    @Override
    public int deleteResultPersonalAwardByIds(Long[] ids)
    {
        return resultPersonalAwardMapper.deleteResultPersonalAwardByIds(ids);
    }

    /**
     * 删除个人获奖信息
     *
     * @param id 个人获奖主键
     * @return 结果
     */
    @Override
    public int deleteResultPersonalAwardById(Long id)
    {
        return resultPersonalAwardMapper.deleteResultPersonalAwardById(id);
    }
}
