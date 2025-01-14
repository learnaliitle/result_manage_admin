package com.ruoyi.result.papers.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.result.papers.domain.ResultPapers;

import java.util.List;

/**
 * 论文Mapper接口
 *
 * @author ruoyi
 * @date 2025-01-13
 */
public interface ResultPapersMapper extends BaseMapper<ResultPapers>
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
     * 删除论文
     *
     * @param id 论文主键
     * @return 结果
     */
    public int deleteResultPapersById(Long id);

    /**
     * 批量删除论文
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteResultPapersByIds(Long[] ids);
}
