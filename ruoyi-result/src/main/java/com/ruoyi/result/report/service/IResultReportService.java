package com.ruoyi.result.report.service;

import java.util.List;
import com.ruoyi.result.report.domain.ResultReport;

/**
 * 新闻报道上传Service接口
 *
 * @author ruoyi
 * @date 2025-01-14
 */
public interface IResultReportService
{
    /**
     * 查询新闻报道上传
     *
     * @param id 新闻报道上传主键
     * @return 新闻报道上传
     */
    public ResultReport selectResultReportById(Long id);

    /**
     * 查询新闻报道上传列表
     *
     * @param resultReport 新闻报道上传
     * @return 新闻报道上传集合
     */
    public List<ResultReport> selectResultReportList(ResultReport resultReport);

    /**
     * 新增新闻报道上传
     *
     * @param resultReport 新闻报道上传
     * @return 结果
     */
    public int insertResultReport(ResultReport resultReport);

    /**
     * 修改新闻报道上传
     *
     * @param resultReport 新闻报道上传
     * @return 结果
     */
    public int updateResultReport(ResultReport resultReport);

    /**
     * 批量删除新闻报道上传
     *
     * @param ids 需要删除的新闻报道上传主键集合
     * @return 结果
     */
    public int deleteResultReportByIds(Long[] ids);

    /**
     * 删除新闻报道上传信息
     *
     * @param id 新闻报道上传主键
     * @return 结果
     */
    public int deleteResultReportById(Long id);
}
