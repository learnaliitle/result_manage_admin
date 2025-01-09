package com.ruoyi.system.domain.result_entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
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
@TableName("result_copyright")
@ApiModel("软件著作权")
public class CopyRight {
    @ApiModelProperty("唯一标识符")
    @TableField("id")
    private Integer id;

    @ApiModelProperty("著作权名称")
    @TableField("title")
    private String title;

    @ApiModelProperty("证书号")
    @TableField("certificate_no")
    private String certificateNo;

    @ApiModelProperty("本人排名")
    @TableField("author_rank")
    private Integer authorRank;

    @ApiModelProperty("开发完成时间")
    @TableField("finish_time")
    private Timestamp finishTime;

    @ApiModelProperty("获得时间")
    @TableField("puttime")
    private Timestamp puttime;

    @ApiModelProperty("登记号")
    @TableField("register_no")
    private String registerNo;

    @ApiModelProperty("著作权类型")
    @TableField("copyright_type")
    private String copyrightType;

    @ApiModelProperty("著作权人")
    @TableField("copyright_owner")
    private String copyrightOwner;

    @ApiModelProperty("备注信息")
    @TableField("description")
    private String description;

    @ApiModelProperty("成果同步")
    @TableField("sync_status")
    private String syncStatus;

    @ApiModelProperty("创建时间")
    @TableField(value = "created", fill = FieldFill.INSERT)
    private Timestamp created;

    @ApiModelProperty("更新时间")
    @TableField(value = "updated", fill = FieldFill.INSERT_UPDATE)
    private Timestamp updated;

    @ApiModelProperty("作者信息")
    @TableField("author_info")
    private List<Author> authorInfo;

    @ApiModelProperty("关联课题ID")
    @TableField("project_id")
    private Integer projectId;

    @ApiModelProperty("更新时间")
    @TableField(value = "updated_at", fill = FieldFill.INSERT_UPDATE)
    private Timestamp updatedAt;

    @ApiModelProperty("PDF URL")
    @TableField("pdf_url")
    private String pdfUrl;

    @ApiModelProperty("关联用户id")
    @TableField("user_id")
    private Long userId;
}
