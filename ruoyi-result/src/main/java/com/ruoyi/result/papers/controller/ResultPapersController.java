package com.ruoyi.result.papers.controller;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.result.papers.domain.ResultPapers;
import com.ruoyi.result.papers.service.IResultPapersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 论文Controller
 *
 * @author ruoyi
 * @date 2025-01-13
 */
@RestController
@RequestMapping("/result/papers")
public class ResultPapersController extends BaseController
{
    @Autowired
    private IResultPapersService resultPapersService;

    /**
     * 查询论文列表
     */
    @PreAuthorize("@ss.hasPermi('result:papers:list')")
    @GetMapping("/list")
    public TableDataInfo list(ResultPapers resultPapers)
    {
        startPage();
        List<ResultPapers> list = resultPapersService.selectResultPapersList(resultPapers);
        return getDataTable(list);
    }

    /**
     * 导出论文列表
     */
    @PreAuthorize("@ss.hasPermi('result:papers:export')")
    @Log(title = "论文", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ResultPapers resultPapers)
    {
        List<ResultPapers> list = resultPapersService.selectResultPapersList(resultPapers);
        ExcelUtil<ResultPapers> util = new ExcelUtil<ResultPapers>(ResultPapers.class);
        util.exportExcel(response, list, "论文数据");
    }

    /**
     * 获取论文详细信息
     */
    @PreAuthorize("@ss.hasPermi('result:papers:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(resultPapersService.selectResultPapersById(id));
    }

    /**
     * 新增论文
     */
    @PreAuthorize("@ss.hasPermi('result:papers:add')")
    @Log(title = "论文", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ResultPapers resultPapers)
    {
        return toAjax(resultPapersService.insertResultPapers(resultPapers));
    }

    /**
     * 修改论文
     */
    @PreAuthorize("@ss.hasPermi('result:papers:edit')")
    @Log(title = "论文", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ResultPapers resultPapers)
    {
        return toAjax(resultPapersService.updateResultPapers(resultPapers));
    }

    /**
     * 删除论文
     */
    @PreAuthorize("@ss.hasPermi('result:papers:remove')")
    @Log(title = "论文", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(resultPapersService.deleteResultPapersByIds(ids));
    }
}
