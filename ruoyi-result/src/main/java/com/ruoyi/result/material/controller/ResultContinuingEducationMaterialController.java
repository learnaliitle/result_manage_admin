package com.ruoyi.result.material.controller;

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
import com.ruoyi.result.material.domain.ResultContinuingEducationMaterial;
import com.ruoyi.result.material.service.IResultContinuingEducationMaterialService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 继续教育材料Controller
 *
 * @author ruoyi
 * @date 2025-01-14
 */
@RestController
@RequestMapping("/result/material")
public class ResultContinuingEducationMaterialController extends BaseController
{
    @Autowired
    private IResultContinuingEducationMaterialService resultContinuingEducationMaterialService;

    /**
     * 查询继续教育材料列表
     */
    @PreAuthorize("@ss.hasPermi('result:material:list')")
    @GetMapping("/list")
    public TableDataInfo list(ResultContinuingEducationMaterial resultContinuingEducationMaterial)
    {
        startPage();
        List<ResultContinuingEducationMaterial> list = resultContinuingEducationMaterialService.selectResultContinuingEducationMaterialList(resultContinuingEducationMaterial);
        return getDataTable(list);
    }

    /**
     * 导出继续教育材料列表
     */
    @PreAuthorize("@ss.hasPermi('result:material:export')")
    @Log(title = "继续教育材料", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ResultContinuingEducationMaterial resultContinuingEducationMaterial)
    {
        List<ResultContinuingEducationMaterial> list = resultContinuingEducationMaterialService.selectResultContinuingEducationMaterialList(resultContinuingEducationMaterial);
        ExcelUtil<ResultContinuingEducationMaterial> util = new ExcelUtil<ResultContinuingEducationMaterial>(ResultContinuingEducationMaterial.class);
        util.exportExcel(response, list, "继续教育材料数据");
    }

    /**
     * 获取继续教育材料详细信息
     */
    @PreAuthorize("@ss.hasPermi('result:material:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(resultContinuingEducationMaterialService.selectResultContinuingEducationMaterialById(id));
    }

    /**
     * 新增继续教育材料
     */
    @PreAuthorize("@ss.hasPermi('result:material:add')")
    @Log(title = "继续教育材料", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ResultContinuingEducationMaterial resultContinuingEducationMaterial)
    {
        return toAjax(resultContinuingEducationMaterialService.insertResultContinuingEducationMaterial(resultContinuingEducationMaterial));
    }

    /**
     * 修改继续教育材料
     */
    @PreAuthorize("@ss.hasPermi('result:material:edit')")
    @Log(title = "继续教育材料", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ResultContinuingEducationMaterial resultContinuingEducationMaterial)
    {
        return toAjax(resultContinuingEducationMaterialService.updateResultContinuingEducationMaterial(resultContinuingEducationMaterial));
    }

    /**
     * 删除继续教育材料
     */
    @PreAuthorize("@ss.hasPermi('result:material:remove')")
    @Log(title = "继续教育材料", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(resultContinuingEducationMaterialService.deleteResultContinuingEducationMaterialByIds(ids));
    }
}
