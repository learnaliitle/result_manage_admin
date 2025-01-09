package com.ruoyi.system.service.impl.result;

import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.system.domain.result_entity.Author;
import com.ruoyi.system.domain.result_entity.Papers;
import com.ruoyi.system.mapper.result.PapersMapper;
import com.ruoyi.system.service.result.PapersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@Service
public class PapersServiceImpl extends ServiceImpl<PapersMapper, Papers> implements PapersService {

    @Autowired
    private PapersMapper papersMapper;
    @Override
    public AjaxResult savePapers(Papers papers) {
        try {
            List<String> indexing = papers.getIndexing();
            List<Author> authorInfo = papers.getAuthorInfo();

            papers.setIndexing(indexing);
            // 设置用户 ID
            papers.setUserId(SecurityUtils.getUserId());

            boolean save = papersMapper.savePapers(papers);
            if (save) {
                return AjaxResult.success("新增成功");
            } else {
                return AjaxResult.error("新增失败");
            }
        } catch (Exception e) {
            // 记录异常日志
            log.error("保存论文时发生异常", e);
            return AjaxResult.error("系统错误，请稍后再试");
        }
    }
}
