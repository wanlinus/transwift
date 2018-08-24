package cn.wanlinus.transwift.baidu.controller;

import cn.wanlinus.transwift.baidu.domain.BaiduTransRequestData;
import cn.wanlinus.transwift.baidu.service.BaiduTransService;
import cn.wanlinus.transwift.domain.Result;
import cn.wanlinus.transwift.domain.TransFormData;
import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wanli
 * @date 2018-08-23 14:42
 */
@RestController
@RequestMapping("v1/baidu")
public class BaiduController {

    private static final Logger logger = LoggerFactory.getLogger(BaiduController.class);

    @Autowired
    private BaiduTransService baiduTransService;

    @PostMapping(value = "trans")
    public List<Result> trans(@RequestBody TransFormData data) {
        List<Result> list = baiduTransService.trans(data);
        logger.info(JSON.toJSONString(list));
        return list;
    }
}
