package com.ruoyi.result.report.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.result.report.domain.ResultReport;
import com.ruoyi.result.report.service.IResultReportService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 新闻报道上传Controller
 *
 * @author ruoyi
 * @date 2025-01-14
 */
@RestController
@RequestMapping("/result/report")
public class ResultReportController extends BaseController
{
    @Autowired
    private IResultReportService resultReportService;

    /**
     * 查询新闻报道上传列表
     */
    @PreAuthorize("@ss.hasPermi('result:report:list')")
    @GetMapping("/list")
    public TableDataInfo list(ResultReport resultReport)
    {
        startPage();
        List<ResultReport> list = resultReportService.selectResultReportList(resultReport);
        return getDataTable(list);
    }

    /**
     * 导出新闻报道上传列表
     */
    @PreAuthorize("@ss.hasPermi('result:report:export')")
    @Log(title = "新闻报道上传", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ResultReport resultReport)
    {
        List<ResultReport> list = resultReportService.selectResultReportList(resultReport);
        ExcelUtil<ResultReport> util = new ExcelUtil<ResultReport>(ResultReport.class);
        util.exportExcel(response, list, "新闻报道上传数据");
    }

    /**
     * 获取新闻报道上传详细信息
     */
    @PreAuthorize("@ss.hasPermi('result:report:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(resultReportService.selectResultReportById(id));
    }

    /**
     * 新增新闻报道上传
     */
    @PreAuthorize("@ss.hasPermi('result:report:add')")
    @Log(title = "新闻报道上传", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ResultReport resultReport)
    {
        return toAjax(resultReportService.insertResultReport(resultReport));
    }

    /**
     * 修改新闻报道上传
     */
    @PreAuthorize("@ss.hasPermi('result:report:edit')")
    @Log(title = "新闻报道上传", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ResultReport resultReport)
    {
        return toAjax(resultReportService.updateResultReport(resultReport));
    }

    /**
     * 删除新闻报道上传
     */
    @PreAuthorize("@ss.hasPermi('result:report:remove')")
    @Log(title = "新闻报道上传", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(resultReportService.deleteResultReportByIds(ids));
    }
}
