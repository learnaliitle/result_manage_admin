package com.ruoyi.result.copyright.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ResultCopyrightMapper;
import com.ruoyi.system.domain.ResultCopyright;
import com.ruoyi.system.service.IResultCopyrightService;

/**
 * 软件著作权Service业务层处理
 *
 * @author ruoyi
 * @date 2025-01-14
 */
@Service
public class ResultCopyrightServiceImpl implements IResultCopyrightService
{
    @Autowired
    private ResultCopyrightMapper resultCopyrightMapper;

    /**
     * 查询软件著作权
     *
     * @param id 软件著作权主键
     * @return 软件著作权
     */
    @Override
    public ResultCopyright selectResultCopyrightById(Long id)
    {
        return resultCopyrightMapper.selectResultCopyrightById(id);
    }

    /**
     * 查询软件著作权列表
     *
     * @param resultCopyright 软件著作权
     * @return 软件著作权
     */
    @Override
    public List<ResultCopyright> selectResultCopyrightList(ResultCopyright resultCopyright)
    {
        return resultCopyrightMapper.selectResultCopyrightList(resultCopyright);
    }

    /**
     * 新增软件著作权
     *
     * @param resultCopyright 软件著作权
     * @return 结果
     */
    @Override
    public int insertResultCopyright(ResultCopyright resultCopyright)
    {
        return resultCopyrightMapper.insertResultCopyright(resultCopyright);
    }

    /**
     * 修改软件著作权
     *
     * @param resultCopyright 软件著作权
     * @return 结果
     */
    @Override
    public int updateResultCopyright(ResultCopyright resultCopyright)
    {
        return resultCopyrightMapper.updateResultCopyright(resultCopyright);
    }

    /**
     * 批量删除软件著作权
     *
     * @param ids 需要删除的软件著作权主键
     * @return 结果
     */
    @Override
    public int deleteResultCopyrightByIds(Long[] ids)
    {
        return resultCopyrightMapper.deleteResultCopyrightByIds(ids);
    }

    /**
     * 删除软件著作权信息
     *
     * @param id 软件著作权主键
     * @return 结果
     */
    @Override
    public int deleteResultCopyrightById(Long id)
    {
        return resultCopyrightMapper.deleteResultCopyrightById(id);
    }
}
