package com.example.demo.control;
import com.example.demo.service.TestService;
import com.example.demo.entity.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


@RestController
@CrossOrigin
public class TestControl {
    @Autowired
    private TestService testService;

    @CrossOrigin
//    @RequestMapping(value = "/insert", method = RequestMethod.POST,produces="application/json;charset=UTF-8")
    @RequestMapping("/insert")
    public void insert(Test user){
        testService.insert(user);
    }
    @RequestMapping("/delete/{id}")
    public void delete(@PathVariable("id")  int id){
        testService.delete(id);
    }

    @RequestMapping(value = "/a_action", method=RequestMethod.OPTIONS)
    public void aActionOption(HttpServletResponse response ){

        System.out.println("option execute.....");
        response.setHeader("Access-Control-Allow-Headers", "accept, content-type,Origin");
        response.setHeader("Access-Control-Allow-Method", "POST, GET, PATCH, DELETE, PUT");
        response.setHeader("Access-Control-Allow-Origin", "*");
    }
    @CrossOrigin
    @RequestMapping(value = "/update",method = RequestMethod.PATCH,produces = "application/json; charset=utf-8")
    public void update(@RequestBody Test user){
        testService.update(user);
    }
    @RequestMapping("/select/{id}")
    public Test select(@PathVariable("id") int id){
        return testService.select(id);
    }

    @RequestMapping("/selectAll")
    public List<Test> selectAll(){

        return testService.selectAll();
    }
}