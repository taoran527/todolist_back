package com.example.demo.service;
import com.example.demo.entity.Test;
import java.util.List;
public interface TestService {
    public void insert(Test test);
    public void delete(int id);
    public void update(Test test);
    public Test select(int id);
    public List<Test> selectAll();
}
