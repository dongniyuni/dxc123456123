package com.dxc.mapper;


import com.dxc.entity.Test1;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Test1Mapper
{
    List<Test1> selectAll();
    public int insertTest1(Test1 test1);
    public int updateTest1(Test1 test1);
    public int deleteTest1(Test1 test1);

}
