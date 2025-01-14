package com.ruoyi.result.report.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.result.report.mapper.ResultReportMapper;
import com.ruoyi.result.report.domain.ResultReport;
import com.ruoyi.result.report.service.IResultReportService;

/**
 * 新闻报道上传Service业务层处理
 *
 * @author ruoyi
 * @date 2025-01-14
 */
@Service
public class ResultReportServiceImpl implements IResultReportService
{
    @Autowired
    private ResultReportMapper resultReportMapper;

    /**
     * 查询新闻报道上传
     *
     * @param id 新闻报道上传主键
     * @return 新闻报道上传
     */
    @Override
    public ResultReport selectResultReportById(Long id)
    {
        return resultReportMapper.selectResultReportById(id);
    }

    /**
     * 查询新闻报道上传列表
     *
     * @param resultReport 新闻报道上传
     * @return 新闻报道上传
     */
    @Override
    public List<ResultReport> selectResultReportList(ResultReport resultReport)
    {
        return resultReportMapper.selectResultReportList(resultReport);
    }

    /**
     * 新增新闻报道上传
     *
     * @param resultReport 新闻报道上传
     * @return 结果
     */
    @Override
    public int insertResultReport(ResultReport resultReport)
    {
        return resultReportMapper.insertResultReport(resultReport);
    }

    /**
     * 修改新闻报道上传
     *
     * @param resultReport 新闻报道上传
     * @return 结果
     */
    @Override
    public int updateResultReport(ResultReport resultReport)
    {
        return resultReportMapper.updateResultReport(resultReport);
    }

    /**
     * 批量删除新闻报道上传
     *
     * @param ids 需要删除的新闻报道上传主键
     * @return 结果
     */
    @Override
    public int deleteResultReportByIds(Long[] ids)
    {
        return resultReportMapper.deleteResultReportByIds(ids);
    }

    /**
     * 删除新闻报道上传信息
     *
     * @param id 新闻报道上传主键
     * @return 结果
     */
    @Override
    public int deleteResultReportById(Long id)
    {
        return resultReportMapper.deleteResultReportById(id);
    }
}
