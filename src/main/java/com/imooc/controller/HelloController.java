package com.imooc.controller;

import com.imooc.pojo.Resource;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private Resource resource;

    @RequestMapping("/hello")
    public Resource Hello(){
        Resource bean=new Resource();
        BeanUtils.copyProperties(resource,bean);
        return bean;
    }

    @RequestMapping("/index")
    public String index(ModelMap map){
        map.addAttribute("name","The great gatsby");
        return "index";
    }
}
