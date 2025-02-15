package com.ruoyi.result.articles.controller;

import com.ruoyi.common.utils.Result;
import com.ruoyi.result.articles.domain.AddArticlesDTO;
import com.ruoyi.result.articles.domain.Articles;
import com.ruoyi.result.articles.service.ArticlesService;

import com.ruoyi.result.producer.MessageProducerService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@Api(tags = "公告接口")
@RequestMapping("/articles")
public class ArticlesController {

    @Autowired
    private ArticlesService articlesService;

    @Autowired
    private MessageProducerService messageProducerService;

    @PostMapping("/add")
    @ApiOperation("添加公告")
    public Result addArticle(@RequestBody AddArticlesDTO addArticlesDTO) {


       return articlesService.saveArticles(addArticlesDTO);


    }
}
