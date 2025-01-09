package com.ruoyi.system.mapper.result;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import com.ruoyi.system.domain.result_entity.Papers;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PapersMapper extends BaseMapper<Papers> {

    boolean savePapers(Papers papers);
}
