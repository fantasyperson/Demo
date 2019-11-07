package com.taotao.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class TbItemCat {

    @RequestMapping("/itemcat/all")
    public String findItemCat(String callback){
        String json = "";
        return callback+"("+json+")";
    }
}
