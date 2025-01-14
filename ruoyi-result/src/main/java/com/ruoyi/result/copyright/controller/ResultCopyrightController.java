package com.ruoyi.result.copyright.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.result.copyright.service.IResultCopyrightService;
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
import com.ruoyi.result.copyright.domain.ResultCopyright;
import com.ruoyi.result.copyright.service.IResultCopyrightService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 软件著作权Controller
 *
 * @author ruoyi
 * @date 2025-01-14
 */
@RestController
@RequestMapping("/result/copyright")
public class ResultCopyrightController extends BaseController
{
    @Autowired
    private IResultCopyrightService resultCopyrightService;

    /**
     * 查询软件著作权列表
     */
    @PreAuthorize("@ss.hasPermi('result:copyright:list')")
    @GetMapping("/list")
    public TableDataInfo list(ResultCopyright resultCopyright)
    {
        startPage();
        List<ResultCopyright> list = resultCopyrightService.selectResultCopyrightList(resultCopyright);
        return getDataTable(list);
    }

    /**
     * 导出软件著作权列表
     */
    @PreAuthorize("@ss.hasPermi('result:copyright:export')")
    @Log(title = "软件著作权", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ResultCopyright resultCopyright)
    {
        List<ResultCopyright> list = resultCopyrightService.selectResultCopyrightList(resultCopyright);
        ExcelUtil<ResultCopyright> util = new ExcelUtil<ResultCopyright>(ResultCopyright.class);
        util.exportExcel(response, list, "软件著作权数据");
    }

    /**
     * 获取软件著作权详细信息
     */
    @PreAuthorize("@ss.hasPermi('result:copyright:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(resultCopyrightService.selectResultCopyrightById(id));
    }

    /**
     * 新增软件著作权
     */
    @PreAuthorize("@ss.hasPermi('result:copyright:add')")
    @Log(title = "软件著作权", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ResultCopyright resultCopyright)
    {
        return toAjax(resultCopyrightService.insertResultCopyright(resultCopyright));
    }

    /**
     * 修改软件著作权
     */
    @PreAuthorize("@ss.hasPermi('result:copyright:edit')")
    @Log(title = "软件著作权", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ResultCopyright resultCopyright)
    {
        return toAjax(resultCopyrightService.updateResultCopyright(resultCopyright));
    }

    /**
     * 删除软件著作权
     */
    @PreAuthorize("@ss.hasPermi('result:copyright:remove')")
    @Log(title = "软件著作权", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(resultCopyrightService.deleteResultCopyrightByIds(ids));
    }
}
