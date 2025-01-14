package com.ruoyi.result.publication.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.result.publication.mapper.ResultPublicationMapper;
import com.ruoyi.result.publication.domain.ResultPublication;
import com.ruoyi.result.publication.service.IResultPublicationService;

/**
 * 著作信息Service业务层处理
 *
 * @author ruoyi
 * @date 2025-01-14
 */
@Service
public class ResultPublicationServiceImpl implements IResultPublicationService
{
    @Autowired
    private ResultPublicationMapper resultPublicationMapper;

    /**
     * 查询著作信息
     *
     * @param id 著作信息主键
     * @return 著作信息
     */
    @Override
    public ResultPublication selectResultPublicationById(Long id)
    {
        return resultPublicationMapper.selectResultPublicationById(id);
    }

    /**
     * 查询著作信息列表
     *
     * @param resultPublication 著作信息
     * @return 著作信息
     */
    @Override
    public List<ResultPublication> selectResultPublicationList(ResultPublication resultPublication)
    {
        return resultPublicationMapper.selectResultPublicationList(resultPublication);
    }

    /**
     * 新增著作信息
     *
     * @param resultPublication 著作信息
     * @return 结果
     */
    @Override
    public int insertResultPublication(ResultPublication resultPublication)
    {
        return resultPublicationMapper.insertResultPublication(resultPublication);
    }

    /**
     * 修改著作信息
     *
     * @param resultPublication 著作信息
     * @return 结果
     */
    @Override
    public int updateResultPublication(ResultPublication resultPublication)
    {
        return resultPublicationMapper.updateResultPublication(resultPublication);
    }

    /**
     * 批量删除著作信息
     *
     * @param ids 需要删除的著作信息主键
     * @return 结果
     */
    @Override
    public int deleteResultPublicationByIds(Long[] ids)
    {
        return resultPublicationMapper.deleteResultPublicationByIds(ids);
    }

    /**
     * 删除著作信息信息
     *
     * @param id 著作信息主键
     * @return 结果
     */
    @Override
    public int deleteResultPublicationById(Long id)
    {
        return resultPublicationMapper.deleteResultPublicationById(id);
    }
}
