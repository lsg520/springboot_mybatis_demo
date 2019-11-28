package com.qf.controller;

import com.qf.dao.StuMapper;
import com.qf.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author lsg
 * @Date 2019/11/28
 */
@RestController
@RequestMapping("/stu")
public class StuController {
    @Autowired
    private StuMapper stuMapper;
    @RequestMapping("/list")
    public List<Student> getList(){
        List<Student> slist = stuMapper.getList();
        return slist;
    }
}
