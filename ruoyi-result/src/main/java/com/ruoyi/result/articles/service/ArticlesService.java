package com.ruoyi.result.articles.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ruoyi.common.utils.Result;
import com.ruoyi.result.articles.domain.AddArticlesDTO;
import com.ruoyi.result.articles.domain.Articles;

public interface ArticlesService extends IService<Articles> {
    Result saveArticles(AddArticlesDTO addArticlesDTO);
}
