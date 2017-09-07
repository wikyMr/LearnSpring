package com.wiky.demo.controller;

import java.util.ArrayList;
import java.util.List;
import com.wiky.demo.model.User;

import io.swagger.annotations.ApiOperation;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/users")
public class SwaggerController {
    
    /*
     *  http://localhost:8080/swagger/index.html
     */
 
    @ApiOperation(value="Get all users",notes="requires noting")
    @RequestMapping(method=RequestMethod.GET)
    public List<User> getUsers(){
        List<User> list=new ArrayList<User>();
 
        User user=new User();
        user.setName("hello");
        list.add(user);
 
        User user2=new User();
        user2.setName("world");
        list.add(user2);
        return list;
    }
 
    @ApiOperation(value="Get user with id",notes="requires the id of user")
    @RequestMapping(value="/{name}",method=RequestMethod.GET)
    public User getUserById(@PathVariable String name){
        User user=new User();
        user.setName("hello world");
        return user;
    }
}
