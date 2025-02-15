package com.ruoyi.result.articles.domain;

// 假设你已经有一个包含 retryCount 字段的 Articles 或其他类
public class RetryMessage {
    private String content;  // 公告内容
    private int retryCount;  // 重试次数

    // Getter 和 Setter 方法
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getRetryCount() {
        return retryCount;
    }

    public void setRetryCount(int retryCount) {
        this.retryCount = retryCount;
    }
}
