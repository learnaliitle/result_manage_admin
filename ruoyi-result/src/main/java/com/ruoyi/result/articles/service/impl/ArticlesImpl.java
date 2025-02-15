package com.ruoyi.result.articles.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.ruoyi.common.utils.Result;
import com.ruoyi.result.articles.domain.AddArticlesDTO;
import com.ruoyi.result.articles.domain.Articles;
import com.ruoyi.result.articles.mapper.ArticlesMapper;
import com.ruoyi.result.articles.service.ArticlesService;
import com.ruoyi.result.producer.MessageProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticlesImpl extends ServiceImpl<ArticlesMapper, Articles> implements ArticlesService {
    @Autowired
    private MessageProducerService messageProducerService;

    @Autowired
    private ArticlesMapper articlesMapper;
    @Override
    public Result saveArticles(AddArticlesDTO addArticlesDTO) {
        try {
            // 1. 保存公告到数据库
            boolean isSaved = articlesMapper.saveArticles(addArticlesDTO);
            if (!isSaved) {
                return Result.error("保存公告到数据库失败");
            }

            // 2. 发送公告消息到 RabbitMQ
            messageProducerService.sendMessage(addArticlesDTO);

            return Result.success(addArticlesDTO);
        } catch (Exception e) {
            e.printStackTrace();
            return Result.error("操作失败: " + e.getMessage());
        }
    }
}
