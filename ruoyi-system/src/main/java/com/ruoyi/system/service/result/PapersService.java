package com.ruoyi.system.service.result;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.system.domain.result_entity.Papers;

public interface PapersService extends IService<Papers> {
    AjaxResult savePapers(Papers papers);
}
