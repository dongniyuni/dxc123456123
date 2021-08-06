package com.dxc.service;

import com.dxc.entity.Test1;

import java.util.List;

public interface Test1Service {
    List<Test1> selectAll();
    public int insertTest1(Test1 test1);
    public int updateTest1(Test1 test1);
    public int deleteTest1(Test1 test1);
}
