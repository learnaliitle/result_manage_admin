package com.ruoyi.result.award.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 个人获奖对象 result_personal_award
 *
 * @author ruoyi
 * @date 2025-01-14
 */
public class ResultPersonalAward extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 荣誉ID */
    private Long id;

    /** 荣誉名称 */
    @Excel(name = "荣誉名称")
    private String title;

    /** 本人排名 */
    @Excel(name = "本人排名")
    private Long authorRank;

    /** 获奖名次 */
    @Excel(name = "获奖名次")
    private String awardLevel;

    /** 级别 */
    @Excel(name = "级别")
    private String level;

    /** 授予单位 */
    @Excel(name = "授予单位")
    private String grantingUnit;

    /** 获奖时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "获奖时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date awardTime;

    /** 备注信息 */
    @Excel(name = "备注信息")
    private String remarks;

    /** 关联课题ID */
    @Excel(name = "关联课题ID")
    private String projectId;

    /** 作者 */
    @Excel(name = "作者")
    private String authorInfo;

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
    public void setAuthorRank(Long authorRank)
    {
        this.authorRank = authorRank;
    }

    public Long getAuthorRank()
    {
        return authorRank;
    }
    public void setAwardLevel(String awardLevel)
    {
        this.awardLevel = awardLevel;
    }

    public String getAwardLevel()
    {
        return awardLevel;
    }
    public void setLevel(String level)
    {
        this.level = level;
    }

    public String getLevel()
    {
        return level;
    }
    public void setGrantingUnit(String grantingUnit)
    {
        this.grantingUnit = grantingUnit;
    }

    public String getGrantingUnit()
    {
        return grantingUnit;
    }
    public void setAwardTime(Date awardTime)
    {
        this.awardTime = awardTime;
    }

    public Date getAwardTime()
    {
        return awardTime;
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
    public void setAuthorInfo(String authorInfo)
    {
        this.authorInfo = authorInfo;
    }

    public String getAuthorInfo()
    {
        return authorInfo;
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
            .append("authorRank", getAuthorRank())
            .append("awardLevel", getAwardLevel())
            .append("level", getLevel())
            .append("grantingUnit", getGrantingUnit())
            .append("awardTime", getAwardTime())
            .append("remarks", getRemarks())
            .append("projectId", getProjectId())
            .append("authorInfo", getAuthorInfo())
            .append("syncStatus", getSyncStatus())
            .append("createdAt", getCreatedAt())
            .append("updatedAt", getUpdatedAt())
            .append("pdfUrl", getPdfUrl())
            .append("userId", getUserId())
            .toString();
    }
}
