package com.ruoyi.result.articles.service;

import com.ruoyi.result.articles.domain.Articles;

public interface EmailService {
    void sendEmail(String email, Articles article);
}
