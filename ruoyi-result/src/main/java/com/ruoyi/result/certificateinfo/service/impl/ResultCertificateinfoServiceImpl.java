package com.ruoyi.result.certificateinfo.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.result.certificateinfo.mapper.ResultCertificateinfoMapper;
import com.ruoyi.result.certificateinfo.domain.ResultCertificateinfo;
import com.ruoyi.result.certificateinfo.service.IResultCertificateinfoService;

/**
 * 档案资料上传Service业务层处理
 *
 * @author ruoyi
 * @date 2025-01-14
 */
@Service
public class ResultCertificateinfoServiceImpl implements IResultCertificateinfoService
{
    @Autowired
    private ResultCertificateinfoMapper resultCertificateinfoMapper;

    /**
     * 查询档案资料上传
     *
     * @param id 档案资料上传主键
     * @return 档案资料上传
     */
    @Override
    public ResultCertificateinfo selectResultCertificateinfoById(Long id)
    {
        return resultCertificateinfoMapper.selectResultCertificateinfoById(id);
    }

    /**
     * 查询档案资料上传列表
     *
     * @param resultCertificateinfo 档案资料上传
     * @return 档案资料上传
     */
    @Override
    public List<ResultCertificateinfo> selectResultCertificateinfoList(ResultCertificateinfo resultCertificateinfo)
    {
        return resultCertificateinfoMapper.selectResultCertificateinfoList(resultCertificateinfo);
    }

    /**
     * 新增档案资料上传
     *
     * @param resultCertificateinfo 档案资料上传
     * @return 结果
     */
    @Override
    public int insertResultCertificateinfo(ResultCertificateinfo resultCertificateinfo)
    {
        return resultCertificateinfoMapper.insertResultCertificateinfo(resultCertificateinfo);
    }

    /**
     * 修改档案资料上传
     *
     * @param resultCertificateinfo 档案资料上传
     * @return 结果
     */
    @Override
    public int updateResultCertificateinfo(ResultCertificateinfo resultCertificateinfo)
    {
        return resultCertificateinfoMapper.updateResultCertificateinfo(resultCertificateinfo);
    }

    /**
     * 批量删除档案资料上传
     *
     * @param ids 需要删除的档案资料上传主键
     * @return 结果
     */
    @Override
    public int deleteResultCertificateinfoByIds(Long[] ids)
    {
        return resultCertificateinfoMapper.deleteResultCertificateinfoByIds(ids);
    }

    /**
     * 删除档案资料上传信息
     *
     * @param id 档案资料上传主键
     * @return 结果
     */
    @Override
    public int deleteResultCertificateinfoById(Long id)
    {
        return resultCertificateinfoMapper.deleteResultCertificateinfoById(id);
    }
}
