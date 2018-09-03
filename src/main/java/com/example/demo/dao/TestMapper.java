package com.example.demo.dao;

import com.example.demo.entity.Test;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
@Mapper
public interface TestMapper {
    @Delete("DELETE FROM test WHERE id = #{id}")
    int deleteByPrimaryKey(Integer id);
    @Insert("INSERT INTO test (id,name,state) values ( #{id},#{name},#{state})")
    int insert(Test test);
    @Select("SELECT * FROM test WHERE id = #{id}")
    Test selectByPrimaryKey(Integer id);
    @Select("select * from test")
    List<Test> selectAll();
    @Update("UPDATE test SET name = #{name}, state = #{state}" +
            " where id = #{id}")
    int updateByPrimaryKey(Test test);
}