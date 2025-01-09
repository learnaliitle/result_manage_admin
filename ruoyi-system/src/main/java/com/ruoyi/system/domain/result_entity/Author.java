package com.ruoyi.system.domain.result_entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("作者")
public class Author implements Serializable {
    @ApiModelProperty("作者在作者列表中的顺序")
    private Integer rank;

    @ApiModelProperty("作者的名字")
    private String name;

    @ApiModelProperty("作者的身份或角色")
    private String identity;

    @ApiModelProperty("是否为通讯作者")
    private boolean isCorresponding;

    @ApiModelProperty("是否为共同第一作者")
    private boolean isCoFirstAuthor;

    @ApiModelProperty("作者所属的单位名称")
    private String institution;
}