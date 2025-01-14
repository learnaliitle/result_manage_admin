package com.ruoyi.result.papers.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ruoyi.result.papers.domain.ResultPapers;

import java.util.List;

/**
 * 论文Service接口
 *
 * @author ruoyi
 * @date 2025-01-13
 */
public interface IResultPapersService extends IService<ResultPapers>
{
    /**
     * 查询论文
     *
     * @param id 论文主键
     * @return 论文
     */
    public ResultPapers selectResultPapersById(Long id);

    /**
     * 查询论文列表
     *
     * @param resultPapers 论文
     * @return 论文集合
     */
    public List<ResultPapers> selectResultPapersList(ResultPapers resultPapers);

    /**
     * 新增论文
     *
     * @param resultPapers 论文
     * @return 结果
     */
    public int insertResultPapers(ResultPapers resultPapers);

    /**
     * 修改论文
     *
     * @param resultPapers 论文
     * @return 结果
     */
    public int updateResultPapers(ResultPapers resultPapers);

    /**
     * 批量删除论文
     *
     * @param ids 需要删除的论文主键集合
     * @return 结果
     */
    public int deleteResultPapersByIds(Long[] ids);

    /**
     * 删除论文信息
     *
     * @param id 论文主键
     * @return 结果
     */
    public int deleteResultPapersById(Long id);
}
