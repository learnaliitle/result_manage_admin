package com.ruoyi.controller.result;


import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.system.domain.result_entity.Papers;
import com.ruoyi.system.service.result.PapersService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@Slf4j
@RequestMapping("/papers")
@Api(tags = "论文接口")
@CrossOrigin
public class PapersController {
    @Autowired
    private PapersService papersService;

    @PostMapping("/save")
    @ApiOperation("新增论文")
    public AjaxResult AddPapers(@RequestBody Papers papers){
       return papersService.savePapers(papers);
    }


}
