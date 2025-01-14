package com.ruoyi.result.other.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.result.other.mapper.ResultOtherMapper;
import com.ruoyi.result.other.domain.ResultOther;
import com.ruoyi.result.other.service.IResultOtherService;

/**
 * 其他上传Service业务层处理
 *
 * @author ruoyi
 * @date 2025-01-14
 */
@Service
public class ResultOtherServiceImpl implements IResultOtherService
{
    @Autowired
    private ResultOtherMapper resultOtherMapper;

    /**
     * 查询其他上传
     *
     * @param id 其他上传主键
     * @return 其他上传
     */
    @Override
    public ResultOther selectResultOtherById(Long id)
    {
        return resultOtherMapper.selectResultOtherById(id);
    }

    /**
     * 查询其他上传列表
     *
     * @param resultOther 其他上传
     * @return 其他上传
     */
    @Override
    public List<ResultOther> selectResultOtherList(ResultOther resultOther)
    {
        return resultOtherMapper.selectResultOtherList(resultOther);
    }

    /**
     * 新增其他上传
     *
     * @param resultOther 其他上传
     * @return 结果
     */
    @Override
    public int insertResultOther(ResultOther resultOther)
    {
        return resultOtherMapper.insertResultOther(resultOther);
    }

    /**
     * 修改其他上传
     *
     * @param resultOther 其他上传
     * @return 结果
     */
    @Override
    public int updateResultOther(ResultOther resultOther)
    {
        return resultOtherMapper.updateResultOther(resultOther);
    }

    /**
     * 批量删除其他上传
     *
     * @param ids 需要删除的其他上传主键
     * @return 结果
     */
    @Override
    public int deleteResultOtherByIds(Long[] ids)
    {
        return resultOtherMapper.deleteResultOtherByIds(ids);
    }

    /**
     * 删除其他上传信息
     *
     * @param id 其他上传主键
     * @return 结果
     */
    @Override
    public int deleteResultOtherById(Long id)
    {
        return resultOtherMapper.deleteResultOtherById(id);
    }
}
