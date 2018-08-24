package cn.wanlinus.transwift.controller;

import cn.wanlinus.transwift.baidu.enums.LanguageEnum;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * @author wanli
 * @date 2018-08-23 17:51
 */
@RestController
@RequestMapping()
public class V1SystemController {

    @GetMapping("v1/froms")
    List<Map<String, String>> sLang() {
        List<Map<String, String>> list = new ArrayList<>();
        for (LanguageEnum e : Arrays.asList(LanguageEnum.values())) {
            Map<String, String> map = new HashMap<>();
            map.put("shorhand", e.getShorthand());
            map.put("name", e.getName());
            list.add(map);
        }
        System.out.println(list);
        return list;
    }


}
