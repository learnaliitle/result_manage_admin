package com.ruoyi.system.domain.result_entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("result_publication")
@ApiModel("著作")
public class Publication {
    @ApiModelProperty("唯一标识符")
    @TableField("id")
    private Integer id;

    @ApiModelProperty("著作名称")
    @TableField("title")
    private String title;

    @ApiModelProperty("出版号")
    @TableField("isbn")
    private String isbn;

    @ApiModelProperty("身份")
    @TableField("role")
    private String role;

    @ApiModelProperty("本人排名")
    @TableField("author_rank")
    private Integer authorRank;

    @ApiModelProperty("出版社")
    @TableField("publisher")
    private String publisher;

    @ApiModelProperty("著作类型")
    @TableField("type")
    private String type;

    @ApiModelProperty("字数(千字)")
    @TableField("word_count")
    private BigDecimal wordCount;

    @ApiModelProperty("出版地")
    @TableField("location")
    private String location;

    @ApiModelProperty("出版时间")
    @TableField("publish_date")
    private Date publishDate;

    @ApiModelProperty("备注信息")
    @TableField("remarks")
    private String remarks;

    @ApiModelProperty("关联课题")
    @TableField("project_id")
    private Integer projectId;

    @ApiModelProperty("作者信息")
    @TableField("author_info")
    private String authorInfo;

    @ApiModelProperty("成果同步")
    @TableField("sync_status")
    private String syncStatus;

    @ApiModelProperty("创建时间")
    @TableField("created_at")
    private Date createdAt;

    @ApiModelProperty("更新时间")
    @TableField("updated_at")
    private Date updatedAt;

    @ApiModelProperty("PDF URL")
    @TableField("pdf_url")
    private String pdfUrl;

    @ApiModelProperty("关联用户id")
    @TableField("user_id")
    private Long userId;
}
