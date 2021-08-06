package com.dxc.service.impl;

import com.dxc.entity.Test1;
import com.dxc.mapper.Test1Mapper;
import com.dxc.service.Test1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Test1ServiceImpl implements Test1Service {

    @Autowired
    private Test1Mapper test1Mapper;

    @Override
    public List<Test1> selectAll() {
        return test1Mapper.selectAll();
    }
    @Override
    public int insertTest1(Test1 test1){
        return test1Mapper.insertTest1(test1);
    }
    @Override
    public int updateTest1(Test1 test1){
        return test1Mapper.updateTest1(test1);
    }
    @Override
    public int deleteTest1(Test1 test1){
        return test1Mapper.deleteTest1(test1);
    }
}
