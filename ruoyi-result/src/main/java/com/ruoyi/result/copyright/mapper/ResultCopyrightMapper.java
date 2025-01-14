package com.ruoyi.result.copyright.mapper;

import java.util.List;

import com.ruoyi.result.copyright.domain.ResultCopyright;

/**
 * 软件著作权Mapper接口
 *
 * @author ruoyi
 * @date 2025-01-14
 */
public interface ResultCopyrightMapper
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
     * 删除软件著作权
     *
     * @param id 软件著作权主键
     * @return 结果
     */
    public int deleteResultCopyrightById(Long id);

    /**
     * 批量删除软件著作权
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteResultCopyrightByIds(Long[] ids);
}
