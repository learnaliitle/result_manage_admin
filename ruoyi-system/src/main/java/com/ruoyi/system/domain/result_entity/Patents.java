package com.ruoyi.system.domain.result_entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("result_patents")
@ApiModel("专利")
public class Patents {

    @ApiModelProperty("唯一标识符")
    @TableField("id")
    private Integer id;

    @ApiModelProperty("专利名称")
    @TableField("patent_title")
    private String patentTitle;

    @ApiModelProperty("专利类型")
    @TableField("patent_type")
    private String patentType;

    @ApiModelProperty("专利状态")
    @TableField("patent_status")
    private String patentStatus;

    @ApiModelProperty("专利编号")
    @TableField("patent_number")
    private String patentNumber;

    @ApiModelProperty("专利权人")
    @TableField("patent_owner")
    private String patentOwner;

    @ApiModelProperty("授权公告日")
    @TableField("authorization_date")
    private Timestamp authorizationDate;

    @ApiModelProperty("申请编号")
    @TableField("application_number")
    private String applicationNumber;

    @ApiModelProperty("专利申请日")
    @TableField("application_date")
    private Timestamp applicationDate;

    @ApiModelProperty("本人排名")
    @TableField("author_rank")
    private Integer authorRank;

    @ApiModelProperty("备注信息")
    @TableField("remarks")
    private String remarks;

    @ApiModelProperty("关联课题")
    @TableField("project_id")
    private Integer projectId;

    @ApiModelProperty("作者信息")
    @TableField("author_info")
    private List<Author> authorInfo;

    @ApiModelProperty("成果同步")
    @TableField("sync_status")
    private String syncStatus;

    @ApiModelProperty("创建时间")
    @TableField("created_at")
    private Timestamp createdAt;

    @ApiModelProperty("更新时间")
    @TableField("updated_at")
    private Timestamp updatedAt;

    @ApiModelProperty("PDF URL")
    @TableField("pdf_url")
    private String pdfUrl;

    @ApiModelProperty("关联用户id")
    @TableField("user_id")
    private Long userId;
}
