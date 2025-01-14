package com.ruoyi.result.publication.controller;

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
import com.ruoyi.result.publication.domain.ResultPublication;
import com.ruoyi.result.publication.service.IResultPublicationService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 著作信息Controller
 *
 * @author ruoyi
 * @date 2025-01-14
 */
@RestController
@RequestMapping("/result/publication")
public class ResultPublicationController extends BaseController
{
    @Autowired
    private IResultPublicationService resultPublicationService;

    /**
     * 查询著作信息列表
     */
    @PreAuthorize("@ss.hasPermi('result:publication:list')")
    @GetMapping("/list")
    public TableDataInfo list(ResultPublication resultPublication)
    {
        startPage();
        List<ResultPublication> list = resultPublicationService.selectResultPublicationList(resultPublication);
        return getDataTable(list);
    }

    /**
     * 导出著作信息列表
     */
    @PreAuthorize("@ss.hasPermi('result:publication:export')")
    @Log(title = "著作信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ResultPublication resultPublication)
    {
        List<ResultPublication> list = resultPublicationService.selectResultPublicationList(resultPublication);
        ExcelUtil<ResultPublication> util = new ExcelUtil<ResultPublication>(ResultPublication.class);
        util.exportExcel(response, list, "著作信息数据");
    }

    /**
     * 获取著作信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('result:publication:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(resultPublicationService.selectResultPublicationById(id));
    }

    /**
     * 新增著作信息
     */
    @PreAuthorize("@ss.hasPermi('result:publication:add')")
    @Log(title = "著作信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ResultPublication resultPublication)
    {
        return toAjax(resultPublicationService.insertResultPublication(resultPublication));
    }

    /**
     * 修改著作信息
     */
    @PreAuthorize("@ss.hasPermi('result:publication:edit')")
    @Log(title = "著作信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ResultPublication resultPublication)
    {
        return toAjax(resultPublicationService.updateResultPublication(resultPublication));
    }

    /**
     * 删除著作信息
     */
    @PreAuthorize("@ss.hasPermi('result:publication:remove')")
    @Log(title = "著作信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(resultPublicationService.deleteResultPublicationByIds(ids));
    }
}
