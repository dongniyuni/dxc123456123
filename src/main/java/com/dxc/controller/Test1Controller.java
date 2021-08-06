package com.dxc.controller;

import com.dxc.entity.Test1;
import com.dxc.service.Test1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/test1/")
public class Test1Controller {

    @Autowired
    private Test1Service test1Service;

    @GetMapping("selectAll")
    @ResponseBody
    public List<Test1> selectAll(){
        return test1Service.selectAll();
    }
    @PostMapping ("/Test1")
    @ResponseBody
    public int insert(Test1 test1){
        return test1Service.insertTest1(test1);
    }
    @PostMapping("updateTest1")
    @ResponseBody
    public int update(Test1 test1){
        return test1Service.updateTest1(test1);
    }
    @PostMapping("deleteTest1")
    @ResponseBody
    public int delete(Test1 test1){
        return test1Service.deleteTest1(test1);
    }


}
