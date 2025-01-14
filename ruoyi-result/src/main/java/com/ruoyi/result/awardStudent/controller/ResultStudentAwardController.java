package com.ruoyi.result.awardStudent.controller;

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
import com.ruoyi.result.awardStudent.domain.ResultStudentAward;
import com.ruoyi.result.awardStudent.service.IResultStudentAwardService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 学生获奖信息Controller
 *
 * @author ruoyi
 * @date 2025-01-14
 */
@RestController
@RequestMapping("/result/awardStudent")
public class ResultStudentAwardController extends BaseController
{
    @Autowired
    private IResultStudentAwardService resultStudentAwardService;

    /**
     * 查询学生获奖信息列表
     */
    @PreAuthorize("@ss.hasPermi('result:awardStudent:list')")
    @GetMapping("/list")
    public TableDataInfo list(ResultStudentAward resultStudentAward)
    {
        startPage();
        List<ResultStudentAward> list = resultStudentAwardService.selectResultStudentAwardList(resultStudentAward);
        return getDataTable(list);
    }

    /**
     * 导出学生获奖信息列表
     */
    @PreAuthorize("@ss.hasPermi('result:awardStudent:export')")
    @Log(title = "学生获奖信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ResultStudentAward resultStudentAward)
    {
        List<ResultStudentAward> list = resultStudentAwardService.selectResultStudentAwardList(resultStudentAward);
        ExcelUtil<ResultStudentAward> util = new ExcelUtil<ResultStudentAward>(ResultStudentAward.class);
        util.exportExcel(response, list, "学生获奖信息数据");
    }

    /**
     * 获取学生获奖信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('result:awardStudent:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(resultStudentAwardService.selectResultStudentAwardById(id));
    }

    /**
     * 新增学生获奖信息
     */
    @PreAuthorize("@ss.hasPermi('result:awardStudent:add')")
    @Log(title = "学生获奖信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ResultStudentAward resultStudentAward)
    {
        return toAjax(resultStudentAwardService.insertResultStudentAward(resultStudentAward));
    }

    /**
     * 修改学生获奖信息
     */
    @PreAuthorize("@ss.hasPermi('result:awardStudent:edit')")
    @Log(title = "学生获奖信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ResultStudentAward resultStudentAward)
    {
        return toAjax(resultStudentAwardService.updateResultStudentAward(resultStudentAward));
    }

    /**
     * 删除学生获奖信息
     */
    @PreAuthorize("@ss.hasPermi('result:awardStudent:remove')")
    @Log(title = "学生获奖信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(resultStudentAwardService.deleteResultStudentAwardByIds(ids));
    }
}
