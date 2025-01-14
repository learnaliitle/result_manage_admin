package com.ruoyi.result.publication.mapper;

import java.util.List;
import com.ruoyi.result.publication.domain.ResultPublication;

/**
 * 著作信息Mapper接口
 *
 * @author ruoyi
 * @date 2025-01-14
 */
public interface ResultPublicationMapper
{
    /**
     * 查询著作信息
     *
     * @param id 著作信息主键
     * @return 著作信息
     */
    public ResultPublication selectResultPublicationById(Long id);

    /**
     * 查询著作信息列表
     *
     * @param resultPublication 著作信息
     * @return 著作信息集合
     */
    public List<ResultPublication> selectResultPublicationList(ResultPublication resultPublication);

    /**
     * 新增著作信息
     *
     * @param resultPublication 著作信息
     * @return 结果
     */
    public int insertResultPublication(ResultPublication resultPublication);

    /**
     * 修改著作信息
     *
     * @param resultPublication 著作信息
     * @return 结果
     */
    public int updateResultPublication(ResultPublication resultPublication);

    /**
     * 删除著作信息
     *
     * @param id 著作信息主键
     * @return 结果
     */
    public int deleteResultPublicationById(Long id);

    /**
     * 批量删除著作信息
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteResultPublicationByIds(Long[] ids);
}
