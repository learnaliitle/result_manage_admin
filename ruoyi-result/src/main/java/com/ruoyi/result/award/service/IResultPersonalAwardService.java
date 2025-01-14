package com.ruoyi.result.award.service;

import java.util.List;
import com.ruoyi.result.award.domain.ResultPersonalAward;

/**
 * 个人获奖Service接口
 *
 * @author ruoyi
 * @date 2025-01-14
 */
public interface IResultPersonalAwardService
{
    /**
     * 查询个人获奖
     *
     * @param id 个人获奖主键
     * @return 个人获奖
     */
    public ResultPersonalAward selectResultPersonalAwardById(Long id);

    /**
     * 查询个人获奖列表
     *
     * @param resultPersonalAward 个人获奖
     * @return 个人获奖集合
     */
    public List<ResultPersonalAward> selectResultPersonalAwardList(ResultPersonalAward resultPersonalAward);

    /**
     * 新增个人获奖
     *
     * @param resultPersonalAward 个人获奖
     * @return 结果
     */
    public int insertResultPersonalAward(ResultPersonalAward resultPersonalAward);

    /**
     * 修改个人获奖
     *
     * @param resultPersonalAward 个人获奖
     * @return 结果
     */
    public int updateResultPersonalAward(ResultPersonalAward resultPersonalAward);

    /**
     * 批量删除个人获奖
     *
     * @param ids 需要删除的个人获奖主键集合
     * @return 结果
     */
    public int deleteResultPersonalAwardByIds(Long[] ids);

    /**
     * 删除个人获奖信息
     *
     * @param id 个人获奖主键
     * @return 结果
     */
    public int deleteResultPersonalAwardById(Long id);
}
