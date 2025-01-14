package com.ruoyi.result.certificateinfo.service;

import java.util.List;
import com.ruoyi.result.certificateinfo.domain.ResultCertificateinfo;

/**
 * 档案资料上传Service接口
 *
 * @author ruoyi
 * @date 2025-01-14
 */
public interface IResultCertificateinfoService
{
    /**
     * 查询档案资料上传
     *
     * @param id 档案资料上传主键
     * @return 档案资料上传
     */
    public ResultCertificateinfo selectResultCertificateinfoById(Long id);

    /**
     * 查询档案资料上传列表
     *
     * @param resultCertificateinfo 档案资料上传
     * @return 档案资料上传集合
     */
    public List<ResultCertificateinfo> selectResultCertificateinfoList(ResultCertificateinfo resultCertificateinfo);

    /**
     * 新增档案资料上传
     *
     * @param resultCertificateinfo 档案资料上传
     * @return 结果
     */
    public int insertResultCertificateinfo(ResultCertificateinfo resultCertificateinfo);

    /**
     * 修改档案资料上传
     *
     * @param resultCertificateinfo 档案资料上传
     * @return 结果
     */
    public int updateResultCertificateinfo(ResultCertificateinfo resultCertificateinfo);

    /**
     * 批量删除档案资料上传
     *
     * @param ids 需要删除的档案资料上传主键集合
     * @return 结果
     */
    public int deleteResultCertificateinfoByIds(Long[] ids);

    /**
     * 删除档案资料上传信息
     *
     * @param id 档案资料上传主键
     * @return 结果
     */
    public int deleteResultCertificateinfoById(Long id);
}
