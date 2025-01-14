package com.ruoyi.result.patents.service.impl;

import java.util.List;

import com.ruoyi.result.patents.domain.ResultPatents;
import com.ruoyi.result.patents.mapper.ResultPatentsMapper;
import com.ruoyi.result.patents.service.IResultPatentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 专利信息Service业务层处理
 *
 * @author ruoyi
 * @date 2025-01-14
 */
@Service
public class ResultPatentsServiceImpl implements IResultPatentsService
{
    @Autowired
    private ResultPatentsMapper resultPatentsMapper;

    /**
     * 查询专利信息
     *
     * @param id 专利信息主键
     * @return 专利信息
     */
    @Override
    public ResultPatents selectResultPatentsById(Long id)
    {
        return resultPatentsMapper.selectResultPatentsById(id);
    }

    /**
     * 查询专利信息列表
     *
     * @param resultPatents 专利信息
     * @return 专利信息
     */
    @Override
    public List<ResultPatents> selectResultPatentsList(ResultPatents resultPatents)
    {
        return resultPatentsMapper.selectResultPatentsList(resultPatents);
    }

    /**
     * 新增专利信息
     *
     * @param resultPatents 专利信息
     * @return 结果
     */
    @Override
    public int insertResultPatents(ResultPatents resultPatents)
    {
        return resultPatentsMapper.insertResultPatents(resultPatents);
    }

    /**
     * 修改专利信息
     *
     * @param resultPatents 专利信息
     * @return 结果
     */
    @Override
    public int updateResultPatents(ResultPatents resultPatents)
    {
        return resultPatentsMapper.updateResultPatents(resultPatents);
    }

    /**
     * 批量删除专利信息
     *
     * @param ids 需要删除的专利信息主键
     * @return 结果
     */
    @Override
    public int deleteResultPatentsByIds(Long[] ids)
    {
        return resultPatentsMapper.deleteResultPatentsByIds(ids);
    }

    /**
     * 删除专利信息信息
     *
     * @param id 专利信息主键
     * @return 结果
     */
    @Override
    public int deleteResultPatentsById(Long id)
    {
        return resultPatentsMapper.deleteResultPatentsById(id);
    }
}
