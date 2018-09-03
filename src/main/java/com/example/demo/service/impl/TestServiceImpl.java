package com.example.demo.service.impl;
import com.example.demo.dao.TestMapper;
import com.example.demo.entity.Test;
import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TestServiceImpl implements TestService{
    @Autowired
    private TestMapper testMapper;

    @Override
    public void insert(Test test){
        testMapper.insert(test);
    }
    @Override
    public void delete(int id) {
        testMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(Test test) {
        testMapper.updateByPrimaryKey(test);
    }

    @Override
    public Test select(int id) {
        return testMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Test> selectAll() {

        return testMapper.selectAll();
    }
}
