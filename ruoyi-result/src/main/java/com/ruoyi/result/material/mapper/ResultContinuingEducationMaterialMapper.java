package com.ruoyi.result.material.mapper;

import java.util.List;
import com.ruoyi.result.material.domain.ResultContinuingEducationMaterial;

/**
 * 继续教育材料Mapper接口
 *
 * @author ruoyi
 * @date 2025-01-14
 */
public interface ResultContinuingEducationMaterialMapper
{
    /**
     * 查询继续教育材料
     *
     * @param id 继续教育材料主键
     * @return 继续教育材料
     */
    public ResultContinuingEducationMaterial selectResultContinuingEducationMaterialById(Long id);

    /**
     * 查询继续教育材料列表
     *
     * @param resultContinuingEducationMaterial 继续教育材料
     * @return 继续教育材料集合
     */
    public List<ResultContinuingEducationMaterial> selectResultContinuingEducationMaterialList(ResultContinuingEducationMaterial resultContinuingEducationMaterial);

    /**
     * 新增继续教育材料
     *
     * @param resultContinuingEducationMaterial 继续教育材料
     * @return 结果
     */
    public int insertResultContinuingEducationMaterial(ResultContinuingEducationMaterial resultContinuingEducationMaterial);

    /**
     * 修改继续教育材料
     *
     * @param resultContinuingEducationMaterial 继续教育材料
     * @return 结果
     */
    public int updateResultContinuingEducationMaterial(ResultContinuingEducationMaterial resultContinuingEducationMaterial);

    /**
     * 删除继续教育材料
     *
     * @param id 继续教育材料主键
     * @return 结果
     */
    public int deleteResultContinuingEducationMaterialById(Long id);

    /**
     * 批量删除继续教育材料
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteResultContinuingEducationMaterialByIds(Long[] ids);
}
