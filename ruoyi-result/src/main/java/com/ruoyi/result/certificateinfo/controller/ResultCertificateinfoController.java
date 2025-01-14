package com.ruoyi.result.certificateinfo.controller;

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
import com.ruoyi.result.certificateinfo.domain.ResultCertificateinfo;
import com.ruoyi.result.certificateinfo.service.IResultCertificateinfoService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 档案资料上传Controller
 *
 * @author ruoyi
 * @date 2025-01-14
 */
@RestController
@RequestMapping("/result/certificateinfo")
public class ResultCertificateinfoController extends BaseController
{
    @Autowired
    private IResultCertificateinfoService resultCertificateinfoService;

    /**
     * 查询档案资料上传列表
     */
    @PreAuthorize("@ss.hasPermi('result:certificateinfo:list')")
    @GetMapping("/list")
    public TableDataInfo list(ResultCertificateinfo resultCertificateinfo)
    {
        startPage();
        List<ResultCertificateinfo> list = resultCertificateinfoService.selectResultCertificateinfoList(resultCertificateinfo);
        return getDataTable(list);
    }

    /**
     * 导出档案资料上传列表
     */
    @PreAuthorize("@ss.hasPermi('result:certificateinfo:export')")
    @Log(title = "档案资料上传", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ResultCertificateinfo resultCertificateinfo)
    {
        List<ResultCertificateinfo> list = resultCertificateinfoService.selectResultCertificateinfoList(resultCertificateinfo);
        ExcelUtil<ResultCertificateinfo> util = new ExcelUtil<ResultCertificateinfo>(ResultCertificateinfo.class);
        util.exportExcel(response, list, "档案资料上传数据");
    }

    /**
     * 获取档案资料上传详细信息
     */
    @PreAuthorize("@ss.hasPermi('result:certificateinfo:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(resultCertificateinfoService.selectResultCertificateinfoById(id));
    }

    /**
     * 新增档案资料上传
     */
    @PreAuthorize("@ss.hasPermi('result:certificateinfo:add')")
    @Log(title = "档案资料上传", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ResultCertificateinfo resultCertificateinfo)
    {
        return toAjax(resultCertificateinfoService.insertResultCertificateinfo(resultCertificateinfo));
    }

    /**
     * 修改档案资料上传
     */
    @PreAuthorize("@ss.hasPermi('result:certificateinfo:edit')")
    @Log(title = "档案资料上传", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ResultCertificateinfo resultCertificateinfo)
    {
        return toAjax(resultCertificateinfoService.updateResultCertificateinfo(resultCertificateinfo));
    }

    /**
     * 删除档案资料上传
     */
    @PreAuthorize("@ss.hasPermi('result:certificateinfo:remove')")
    @Log(title = "档案资料上传", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(resultCertificateinfoService.deleteResultCertificateinfoByIds(ids));
    }
}
