package com.taotao.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/")
    public String toPage(){
        return "index";
    }
    @RequestMapping("page/{page}")
    public String toPage2(@PathVariable("page") String page){
        return page;
    }

    @RequestMapping("/{page}")
    public String toPage3(@PathVariable("page") String page){
        return page;
    }


    @RequestMapping("rest/page/{page}")
    public String toPage4(@PathVariable("page") String page){
        return page;
    }



}
