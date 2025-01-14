package com.ruoyi.result.publication.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 著作信息对象 result_publication
 *
 * @author ruoyi
 * @date 2025-01-14
 */
public class ResultPublication extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 著作ID */
    private Long id;

    /** 著作名称 */
    @Excel(name = "著作名称")
    private String title;

    /** 出版号 */
    @Excel(name = "出版号")
    private String isbn;

    /** 身份 */
    @Excel(name = "身份")
    private String role;

    /** 本人排名 */
    @Excel(name = "本人排名")
    private Long authorRank;

    /** 出版社 */
    @Excel(name = "出版社")
    private String publisher;

    /** 著作类型 */
    @Excel(name = "著作类型")
    private String type;

    /** 字数(千字) */
    @Excel(name = "字数(千字)")
    private BigDecimal wordCount;

    /** 出版地 */
    @Excel(name = "出版地")
    private String location;

    /** 出版时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "出版时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date publishDate;

    /** 备注信息 */
    @Excel(name = "备注信息")
    private String remarks;

    /** 关联课题 */
    @Excel(name = "关联课题")
    private Long projectId;

    /** 作者信息 */
    @Excel(name = "作者信息")
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
    public void setIsbn(String isbn)
    {
        this.isbn = isbn;
    }

    public String getIsbn()
    {
        return isbn;
    }
    public void setRole(String role)
    {
        this.role = role;
    }

    public String getRole()
    {
        return role;
    }
    public void setAuthorRank(Long authorRank)
    {
        this.authorRank = authorRank;
    }

    public Long getAuthorRank()
    {
        return authorRank;
    }
    public void setPublisher(String publisher)
    {
        this.publisher = publisher;
    }

    public String getPublisher()
    {
        return publisher;
    }
    public void setType(String type)
    {
        this.type = type;
    }

    public String getType()
    {
        return type;
    }
    public void setWordCount(BigDecimal wordCount)
    {
        this.wordCount = wordCount;
    }

    public BigDecimal getWordCount()
    {
        return wordCount;
    }
    public void setLocation(String location)
    {
        this.location = location;
    }

    public String getLocation()
    {
        return location;
    }
    public void setPublishDate(Date publishDate)
    {
        this.publishDate = publishDate;
    }

    public Date getPublishDate()
    {
        return publishDate;
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
            .append("isbn", getIsbn())
            .append("role", getRole())
            .append("authorRank", getAuthorRank())
            .append("publisher", getPublisher())
            .append("type", getType())
            .append("wordCount", getWordCount())
            .append("location", getLocation())
            .append("publishDate", getPublishDate())
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
