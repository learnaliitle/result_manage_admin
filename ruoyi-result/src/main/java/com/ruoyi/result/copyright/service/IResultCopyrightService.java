package com.ruoyi.result.copyright.service;

import java.util.List;

import com.ruoyi.result.copyright.domain.ResultCopyright;

/**
 * 软件著作权Service接口
 *
 * @author ruoyi
 * @date 2025-01-14
 */
public interface IResultCopyrightService
{
    /**
     * 查询软件著作权
     *
     * @param id 软件著作权主键
     * @return 软件著作权
     */
    public ResultCopyright selectResultCopyrightById(Long id);

    /**
     * 查询软件著作权列表
     *
     * @param resultCopyright 软件著作权
     * @return 软件著作权集合
     */
    public List<ResultCopyright> selectResultCopyrightList(ResultCopyright resultCopyright);

    /**
     * 新增软件著作权
     *
     * @param resultCopyright 软件著作权
     * @return 结果
     */
    public int insertResultCopyright(ResultCopyright resultCopyright);

    /**
     * 修改软件著作权
     *
     * @param resultCopyright 软件著作权
     * @return 结果
     */
    public int updateResultCopyright(ResultCopyright resultCopyright);

    /**
     * 批量删除软件著作权
     *
     * @param ids 需要删除的软件著作权主键集合
     * @return 结果
     */
    public int deleteResultCopyrightByIds(Long[] ids);

    /**
     * 删除软件著作权信息
     *
     * @param id 软件著作权主键
     * @return 结果
     */
    public int deleteResultCopyrightById(Long id);
}
