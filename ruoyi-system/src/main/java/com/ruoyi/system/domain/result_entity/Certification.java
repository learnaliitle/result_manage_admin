package com.ruoyi.system.domain.result_entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("result_certificateinfo")
@ApiModel("档案资料")
public class Certification {
    @ApiModelProperty("唯一标识符")
    @TableField("id")
    private Integer id;

    @ApiModelProperty("档案标题")
    @TableField("title")
    private String title;

    @ApiModelProperty("证书类型")
    @TableField("certificate_type")
    private String certificateType;

    @ApiModelProperty("获得时间")
    @TableField("obtain_time")
    private Date obtainTime;

    @ApiModelProperty("证书编号")
    @TableField("certificate_number")
    private String certificateNumber;

    @ApiModelProperty("授予机构")
    @TableField("issuing_institution")
    private String issuingInstitution;

    @ApiModelProperty("备注信息")
    @TableField("remarks")
    private String remarks;

    @ApiModelProperty("关联课题")
    @TableField("project_id")
    private Integer projectId;

    @ApiModelProperty("成果同步状态")
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
