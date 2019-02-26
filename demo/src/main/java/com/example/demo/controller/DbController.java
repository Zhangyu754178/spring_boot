package com.example.demo.controller;

import com.example.demo.been.User;
import com.example.demo.inter.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class DbController {

    @Autowired
    private UserRepository userRepository;

//    @RequestMapping("/db")
//    void SaveUser() {
//        Date date = new Date();
//        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
//        String formattedDate = dateFormat.format(date);
//
//        userRepository.save(new User("aa1", "aa@126.com", "aa", "aa123456",formattedDate));
//
//        //userRepository.delete(userRepository.findByUserName("aa1"));
//    }


    @GetMapping(value = "/person/all")
    public List<User> personList() {
        return userRepository.findAll();
    }


    @PostMapping(value = "/person")
    public User personAdd(@RequestParam("name") String name,
                            @RequestParam("password") String password,
                          @RequestParam("email") String email,
                          @RequestParam("nickname") String nickname) {
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        String formattedDate = dateFormat.format(date);
        User person = new User(name,password,email,nickname,formattedDate);
        return userRepository.save(person);
    }
    /**
     * 查询一个人员
     *
     * @param name
     * @return
     */
    @GetMapping(value = "/person/{name}")
    public User personFindOne(@PathVariable("name") String name) {
        return userRepository.findByUserName(name);
    }

    /**
     * 删除一个人员
     *
     * @param name
     */
    @DeleteMapping(value = "/person/{name}")
    public void personDelete(@PathVariable("name") String name) {
        userRepository.delete(userRepository.findByUserName(name));
    }

    /**
     * 更新一个人员
     *

     * @return
     */
    @PutMapping(value = "/person/{name}")
    public User personUpdate(@RequestParam("name") String name,
                             @RequestParam("password") String password,
                             @RequestParam("email") String email,
                             @RequestParam("nickname") String nickname) {
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        String formattedDate = dateFormat.format(date);
        User person = new User(name,password,email,nickname,formattedDate);
        return userRepository.save(person);
    }
}
