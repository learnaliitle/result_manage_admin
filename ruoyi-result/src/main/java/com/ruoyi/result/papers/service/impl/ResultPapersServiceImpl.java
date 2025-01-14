package com.ruoyi.result.papers.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.result.papers.domain.ResultPapers;
import com.ruoyi.result.papers.mapper.ResultPapersMapper;
import com.ruoyi.result.papers.service.IResultPapersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 论文Service业务层处理
 *
 * @author ruoyi
 * @date 2025-01-13
 */
@Service
public class ResultPapersServiceImpl extends ServiceImpl<ResultPapersMapper, ResultPapers> implements IResultPapersService
{
    @Autowired
    private ResultPapersMapper resultPapersMapper;

    /**
     * 查询论文
     *
     * @param id 论文主键
     * @return 论文
     */
    @Override
    public ResultPapers selectResultPapersById(Long id)
    {
        return resultPapersMapper.selectResultPapersById(id);
    }

    /**
     * 查询论文列表
     *
     * @param resultPapers 论文
     * @return 论文
     */
    @Override
    public List<ResultPapers> selectResultPapersList(ResultPapers resultPapers)
    {
        return resultPapersMapper.selectResultPapersList(resultPapers);
    }

    /**
     * 新增论文
     *
     * @param resultPapers 论文
     * @return 结果
     */
    @Override
    public int insertResultPapers(ResultPapers resultPapers)
    {
        return resultPapersMapper.insertResultPapers(resultPapers);
    }

    /**
     * 修改论文
     *
     * @param resultPapers 论文
     * @return 结果
     */
    @Override
    public int updateResultPapers(ResultPapers resultPapers)
    {
        return resultPapersMapper.updateResultPapers(resultPapers);
    }

    /**
     * 批量删除论文
     *
     * @param ids 需要删除的论文主键
     * @return 结果
     */
    @Override
    public int deleteResultPapersByIds(Long[] ids)
    {
        return resultPapersMapper.deleteResultPapersByIds(ids);
    }

    /**
     * 删除论文信息
     *
     * @param id 论文主键
     * @return 结果
     */
    @Override
    public int deleteResultPapersById(Long id)
    {
        return resultPapersMapper.deleteResultPapersById(id);
    }

}
