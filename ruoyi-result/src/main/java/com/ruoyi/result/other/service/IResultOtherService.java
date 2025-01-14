package com.ruoyi.result.other.service;

import java.util.List;
import com.ruoyi.result.other.domain.ResultOther;

/**
 * 其他上传Service接口
 *
 * @author ruoyi
 * @date 2025-01-14
 */
public interface IResultOtherService
{
    /**
     * 查询其他上传
     *
     * @param id 其他上传主键
     * @return 其他上传
     */
    public ResultOther selectResultOtherById(Long id);

    /**
     * 查询其他上传列表
     *
     * @param resultOther 其他上传
     * @return 其他上传集合
     */
    public List<ResultOther> selectResultOtherList(ResultOther resultOther);

    /**
     * 新增其他上传
     *
     * @param resultOther 其他上传
     * @return 结果
     */
    public int insertResultOther(ResultOther resultOther);

    /**
     * 修改其他上传
     *
     * @param resultOther 其他上传
     * @return 结果
     */
    public int updateResultOther(ResultOther resultOther);

    /**
     * 批量删除其他上传
     *
     * @param ids 需要删除的其他上传主键集合
     * @return 结果
     */
    public int deleteResultOtherByIds(Long[] ids);

    /**
     * 删除其他上传信息
     *
     * @param id 其他上传主键
     * @return 结果
     */
    public int deleteResultOtherById(Long id);
}
