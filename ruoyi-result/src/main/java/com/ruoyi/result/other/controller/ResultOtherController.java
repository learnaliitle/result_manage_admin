package com.ruoyi.result.other.controller;

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
import com.ruoyi.result.other.domain.ResultOther;
import com.ruoyi.result.other.service.IResultOtherService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 其他上传Controller
 *
 * @author ruoyi
 * @date 2025-01-14
 */
@RestController
@RequestMapping("/result/other")
public class ResultOtherController extends BaseController
{
    @Autowired
    private IResultOtherService resultOtherService;

    /**
     * 查询其他上传列表
     */
    @PreAuthorize("@ss.hasPermi('result:other:list')")
    @GetMapping("/list")
    public TableDataInfo list(ResultOther resultOther)
    {
        startPage();
        List<ResultOther> list = resultOtherService.selectResultOtherList(resultOther);
        return getDataTable(list);
    }

    /**
     * 导出其他上传列表
     */
    @PreAuthorize("@ss.hasPermi('result:other:export')")
    @Log(title = "其他上传", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ResultOther resultOther)
    {
        List<ResultOther> list = resultOtherService.selectResultOtherList(resultOther);
        ExcelUtil<ResultOther> util = new ExcelUtil<ResultOther>(ResultOther.class);
        util.exportExcel(response, list, "其他上传数据");
    }

    /**
     * 获取其他上传详细信息
     */
    @PreAuthorize("@ss.hasPermi('result:other:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(resultOtherService.selectResultOtherById(id));
    }

    /**
     * 新增其他上传
     */
    @PreAuthorize("@ss.hasPermi('result:other:add')")
    @Log(title = "其他上传", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ResultOther resultOther)
    {
        return toAjax(resultOtherService.insertResultOther(resultOther));
    }

    /**
     * 修改其他上传
     */
    @PreAuthorize("@ss.hasPermi('result:other:edit')")
    @Log(title = "其他上传", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ResultOther resultOther)
    {
        return toAjax(resultOtherService.updateResultOther(resultOther));
    }

    /**
     * 删除其他上传
     */
    @PreAuthorize("@ss.hasPermi('result:other:remove')")
    @Log(title = "其他上传", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(resultOtherService.deleteResultOtherByIds(ids));
    }
}
