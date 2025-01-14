package com.ruoyi.result.awardPersonal.controller;

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
import com.ruoyi.result.awardPersonal.domain.ResultPersonalAward;
import com.ruoyi.result.awardPersonal.service.IResultPersonalAwardService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 个人获奖Controller
 *
 * @author ruoyi
 * @date 2025-01-14
 */
@RestController
@RequestMapping("/result/awardPersonal")
public class ResultPersonalAwardController extends BaseController
{
    @Autowired
    private IResultPersonalAwardService resultPersonalAwardService;

    /**
     * 查询个人获奖列表
     */
    @PreAuthorize("@ss.hasPermi('result:awardPersonal:list')")
    @GetMapping("/list")
    public TableDataInfo list(ResultPersonalAward resultPersonalAward)
    {
        startPage();
        List<ResultPersonalAward> list = resultPersonalAwardService.selectResultPersonalAwardList(resultPersonalAward);
        return getDataTable(list);
    }

    /**
     * 导出个人获奖列表
     */
    @PreAuthorize("@ss.hasPermi('result:awardPersonal:export')")
    @Log(title = "个人获奖", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ResultPersonalAward resultPersonalAward)
    {
        List<ResultPersonalAward> list = resultPersonalAwardService.selectResultPersonalAwardList(resultPersonalAward);
        ExcelUtil<ResultPersonalAward> util = new ExcelUtil<ResultPersonalAward>(ResultPersonalAward.class);
        util.exportExcel(response, list, "个人获奖数据");
    }

    /**
     * 获取个人获奖详细信息
     */
    @PreAuthorize("@ss.hasPermi('result:awardPersonal:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(resultPersonalAwardService.selectResultPersonalAwardById(id));
    }

    /**
     * 新增个人获奖
     */
    @PreAuthorize("@ss.hasPermi('result:awardPersonal:add')")
    @Log(title = "个人获奖", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ResultPersonalAward resultPersonalAward)
    {
        return toAjax(resultPersonalAwardService.insertResultPersonalAward(resultPersonalAward));
    }

    /**
     * 修改个人获奖
     */
    @PreAuthorize("@ss.hasPermi('result:awardPersonal:edit')")
    @Log(title = "个人获奖", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ResultPersonalAward resultPersonalAward)
    {
        return toAjax(resultPersonalAwardService.updateResultPersonalAward(resultPersonalAward));
    }

    /**
     * 删除个人获奖
     */
    @PreAuthorize("@ss.hasPermi('result:awardPersonal:remove')")
    @Log(title = "个人获奖", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(resultPersonalAwardService.deleteResultPersonalAwardByIds(ids));
    }
}
