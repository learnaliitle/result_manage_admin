package com.ruoyi.result.articles.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import com.ruoyi.result.articles.domain.AddArticlesDTO;
import com.ruoyi.result.articles.domain.Articles;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ArticlesMapper extends BaseMapper<Articles> {

    boolean saveArticles(AddArticlesDTO addArticlesDTO);
}
