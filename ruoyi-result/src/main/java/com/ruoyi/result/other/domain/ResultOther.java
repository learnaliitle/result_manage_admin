package com.ruoyi.result.other.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 其他上传对象 result_other
 *
 * @author ruoyi
 * @date 2025-01-14
 */
public class ResultOther extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 唯一标识 */
    private Long id;

    /** 成果名称 */
    @Excel(name = "成果名称")
    private String achievementName;

    /** 本人排名 */
    @Excel(name = "本人排名")
    private Long authorRank;

    /** 获得时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "获得时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date obtainTime;

    /** 备注信息 */
    @Excel(name = "备注信息")
    private String remarks;

    /** 关联课题 */
    @Excel(name = "关联课题")
    private Long projectId;

    /** 成果同步状态 */
    @Excel(name = "成果同步状态")
    private String syncStatus;

    /** 作者信息 */
    @Excel(name = "作者信息")
    private String authorInfo;

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
    public void setAchievementName(String achievementName)
    {
        this.achievementName = achievementName;
    }

    public String getAchievementName()
    {
        return achievementName;
    }
    public void setAuthorRank(Long authorRank)
    {
        this.authorRank = authorRank;
    }

    public Long getAuthorRank()
    {
        return authorRank;
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
    public void setProjectId(Long projectId)
    {
        this.projectId = projectId;
    }

    public Long getProjectId()
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
    public void setAuthorInfo(String authorInfo)
    {
        this.authorInfo = authorInfo;
    }

    public String getAuthorInfo()
    {
        return authorInfo;
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
            .append("achievementName", getAchievementName())
            .append("authorRank", getAuthorRank())
            .append("obtainTime", getObtainTime())
            .append("remarks", getRemarks())
            .append("projectId", getProjectId())
            .append("syncStatus", getSyncStatus())
            .append("authorInfo", getAuthorInfo())
            .append("createdAt", getCreatedAt())
            .append("updatedAt", getUpdatedAt())
            .append("pdfUrl", getPdfUrl())
            .append("userId", getUserId())
            .toString();
    }
}
