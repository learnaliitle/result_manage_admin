package com.ruoyi.result.patents.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.result.patents.domain.ResultPatents;
import com.ruoyi.result.patents.service.IResultPatentsService;
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
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 专利信息Controller
 *
 * @author ruoyi
 * @date 2025-01-14
 */
@RestController
@RequestMapping("/result/patents")
public class ResultPatentsController extends BaseController
{
    @Autowired
    private IResultPatentsService resultPatentsService;

    /**
     * 查询专利信息列表
     */
    @PreAuthorize("@ss.hasPermi('result:patents:list')")
    @GetMapping("/list")
    public TableDataInfo list(ResultPatents resultPatents)
    {
        startPage();
        List<ResultPatents> list = resultPatentsService.selectResultPatentsList(resultPatents);
        return getDataTable(list);
    }

    /**
     * 导出专利信息列表
     */
    @PreAuthorize("@ss.hasPermi('result:patents:export')")
    @Log(title = "专利信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ResultPatents resultPatents)
    {
        List<ResultPatents> list = resultPatentsService.selectResultPatentsList(resultPatents);
        ExcelUtil<ResultPatents> util = new ExcelUtil<ResultPatents>(ResultPatents.class);
        util.exportExcel(response, list, "专利信息数据");
    }

    /**
     * 获取专利信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('result:patents:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(resultPatentsService.selectResultPatentsById(id));
    }

    /**
     * 新增专利信息
     */
    @PreAuthorize("@ss.hasPermi('result:patents:add')")
    @Log(title = "专利信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ResultPatents resultPatents)
    {
        return toAjax(resultPatentsService.insertResultPatents(resultPatents));
    }

    /**
     * 修改专利信息
     */
    @PreAuthorize("@ss.hasPermi('result:patents:edit')")
    @Log(title = "专利信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ResultPatents resultPatents)
    {
        return toAjax(resultPatentsService.updateResultPatents(resultPatents));
    }

    /**
     * 删除专利信息
     */
    @PreAuthorize("@ss.hasPermi('result:patents:remove')")
    @Log(title = "专利信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(resultPatentsService.deleteResultPatentsByIds(ids));
    }
}
