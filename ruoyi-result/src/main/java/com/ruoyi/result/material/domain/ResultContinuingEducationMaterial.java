package com.ruoyi.result.material.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 继续教育材料对象 result_continuing_education_material
 *
 * @author ruoyi
 * @date 2025-01-14
 */
public class ResultContinuingEducationMaterial extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 材料ID */
    private Long id;

    /** 材料标题 */
    @Excel(name = "材料标题")
    private String title;

    /** 培训单位 */
    @Excel(name = "培训单位")
    private String trainingUnit;

    /** 课时 */
    @Excel(name = "课时")
    private BigDecimal hours;

    /** 评分/等级 */
    @Excel(name = "评分/等级")
    private String score;

    /** 获得时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "获得时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date obtainTime;

    /** 备注信息 */
    @Excel(name = "备注信息")
    private String remarks;

    /** 关联课题ID */
    @Excel(name = "关联课题ID")
    private String projectId;

    /** 成果同步 */
    @Excel(name = "成果同步")
    private String syncStatus;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date createdAt;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date updatedAt;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String pdfUrl;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long userId;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getTitle()
    {
        return title;
    }
    public void setTrainingUnit(String trainingUnit)
    {
        this.trainingUnit = trainingUnit;
    }

    public String getTrainingUnit()
    {
        return trainingUnit;
    }
    public void setHours(BigDecimal hours)
    {
        this.hours = hours;
    }

    public BigDecimal getHours()
    {
        return hours;
    }
    public void setScore(String score)
    {
        this.score = score;
    }

    public String getScore()
    {
        return score;
    }
    public void setObtainTime(Date obtainTime)
    {
        this.obtainTime = obtainTime;
    }

    public Date getObtainTime()
    {
        return obtainTime;
    }
    public void setRemarks(String remarks)
    {
        this.remarks = remarks;
    }

    public String getRemarks()
    {
        return remarks;
    }
    public void setProjectId(String projectId)
    {
        this.projectId = projectId;
    }

    public String getProjectId()
    {
        return projectId;
    }
    public void setSyncStatus(String syncStatus)
    {
        this.syncStatus = syncStatus;
    }

    public String getSyncStatus()
    {
        return syncStatus;
    }
    public void setCreatedAt(Date createdAt)
    {
        this.createdAt = createdAt;
    }

    public Date getCreatedAt()
    {
        return createdAt;
    }
    public void setUpdatedAt(Date updatedAt)
    {
        this.updatedAt = updatedAt;
    }

    public Date getUpdatedAt()
    {
        return updatedAt;
    }
    public void setPdfUrl(String pdfUrl)
    {
        this.pdfUrl = pdfUrl;
    }

    public String getPdfUrl()
    {
        return pdfUrl;
    }
    public void setUserId(Long userId)
    {
        this.userId = userId;
    }

    public Long getUserId()
    {
        return userId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("title", getTitle())
            .append("trainingUnit", getTrainingUnit())
            .append("hours", getHours())
            .append("score", getScore())
            .append("obtainTime", getObtainTime())
            .append("remarks", getRemarks())
            .append("projectId", getProjectId())
            .append("syncStatus", getSyncStatus())
            .append("createdAt", getCreatedAt())
            .append("updatedAt", getUpdatedAt())
            .append("pdfUrl", getPdfUrl())
            .append("userId", getUserId())
            .toString();
    }
}
