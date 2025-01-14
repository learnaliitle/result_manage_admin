package com.ruoyi.result.patents.mapper;

import java.util.List;

import com.ruoyi.result.patents.domain.ResultPatents;

/**
 * 专利信息Mapper接口
 *
 * @author ruoyi
 * @date 2025-01-14
 */
public interface ResultPatentsMapper
{
    /**
     * 查询专利信息
     *
     * @param id 专利信息主键
     * @return 专利信息
     */
    public ResultPatents selectResultPatentsById(Long id);

    /**
     * 查询专利信息列表
     *
     * @param resultPatents 专利信息
     * @return 专利信息集合
     */
    public List<ResultPatents> selectResultPatentsList(ResultPatents resultPatents);

    /**
     * 新增专利信息
     *
     * @param resultPatents 专利信息
     * @return 结果
     */
    public int insertResultPatents(ResultPatents resultPatents);

    /**
     * 修改专利信息
     *
     * @param resultPatents 专利信息
     * @return 结果
     */
    public int updateResultPatents(ResultPatents resultPatents);

    /**
     * 删除专利信息
     *
     * @param id 专利信息主键
     * @return 结果
     */
    public int deleteResultPatentsById(Long id);

    /**
     * 批量删除专利信息
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteResultPatentsByIds(Long[] ids);
}
