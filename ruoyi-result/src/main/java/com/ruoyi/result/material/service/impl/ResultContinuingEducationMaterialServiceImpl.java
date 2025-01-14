package com.ruoyi.result.material.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.result.material.mapper.ResultContinuingEducationMaterialMapper;
import com.ruoyi.result.material.domain.ResultContinuingEducationMaterial;
import com.ruoyi.result.material.service.IResultContinuingEducationMaterialService;

/**
 * 继续教育材料Service业务层处理
 *
 * @author ruoyi
 * @date 2025-01-14
 */
@Service
public class ResultContinuingEducationMaterialServiceImpl implements IResultContinuingEducationMaterialService
{
    @Autowired
    private ResultContinuingEducationMaterialMapper resultContinuingEducationMaterialMapper;

    /**
     * 查询继续教育材料
     *
     * @param id 继续教育材料主键
     * @return 继续教育材料
     */
    @Override
    public ResultContinuingEducationMaterial selectResultContinuingEducationMaterialById(Long id)
    {
        return resultContinuingEducationMaterialMapper.selectResultContinuingEducationMaterialById(id);
    }

    /**
     * 查询继续教育材料列表
     *
     * @param resultContinuingEducationMaterial 继续教育材料
     * @return 继续教育材料
     */
    @Override
    public List<ResultContinuingEducationMaterial> selectResultContinuingEducationMaterialList(ResultContinuingEducationMaterial resultContinuingEducationMaterial)
    {
        return resultContinuingEducationMaterialMapper.selectResultContinuingEducationMaterialList(resultContinuingEducationMaterial);
    }

    /**
     * 新增继续教育材料
     *
     * @param resultContinuingEducationMaterial 继续教育材料
     * @return 结果
     */
    @Override
    public int insertResultContinuingEducationMaterial(ResultContinuingEducationMaterial resultContinuingEducationMaterial)
    {
        return resultContinuingEducationMaterialMapper.insertResultContinuingEducationMaterial(resultContinuingEducationMaterial);
    }

    /**
     * 修改继续教育材料
     *
     * @param resultContinuingEducationMaterial 继续教育材料
     * @return 结果
     */
    @Override
    public int updateResultContinuingEducationMaterial(ResultContinuingEducationMaterial resultContinuingEducationMaterial)
    {
        return resultContinuingEducationMaterialMapper.updateResultContinuingEducationMaterial(resultContinuingEducationMaterial);
    }

    /**
     * 批量删除继续教育材料
     *
     * @param ids 需要删除的继续教育材料主键
     * @return 结果
     */
    @Override
    public int deleteResultContinuingEducationMaterialByIds(Long[] ids)
    {
        return resultContinuingEducationMaterialMapper.deleteResultContinuingEducationMaterialByIds(ids);
    }

    /**
     * 删除继续教育材料信息
     *
     * @param id 继续教育材料主键
     * @return 结果
     */
    @Override
    public int deleteResultContinuingEducationMaterialById(Long id)
    {
        return resultContinuingEducationMaterialMapper.deleteResultContinuingEducationMaterialById(id);
    }
}
