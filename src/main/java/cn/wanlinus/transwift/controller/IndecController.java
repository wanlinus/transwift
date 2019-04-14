package cn.wanlinus.transwift.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author wanli
 * @date 2018-08-23 18:02
 */
@Controller
public class IndecController {
    @GetMapping("")
    public String index() {
        return "index";
    }
    
    @GetMapping("/a")
    public String iddd(){
        return "asdsadsdsd";
    }

}
