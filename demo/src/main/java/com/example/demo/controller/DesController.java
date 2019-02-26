package com.example.demo.controller;

import com.example.demo.been.Des;
import com.example.demo.been.User;
import com.example.demo.inter.DesRepository;
import com.example.demo.inter.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
@RestController
public class DesController {

    @Autowired
    private DesRepository desRepository;
    @Autowired
    private UserRepository userRepository;
    @GetMapping(value = "/des/all")
    private List<Des> DesList() {
        return desRepository.findAll();
    }


    @PostMapping(value = "/des")
    public Des personAdd(@RequestParam("userId") int userId,
                          @RequestParam("des") String des
                         ) {
        Des desbeen =new Des();
        desbeen.setUserId(userId);
        desbeen.setDes(des);
        for (User item: userRepository.findAll()) {
            if(item.getId()==userId)
                desbeen.setUser(item);
        }
        return desRepository.save(desbeen);
    }
    /**
     * 查询一个人员
     *
     * @param userId
     * @return
     */
    @GetMapping(value = "/des/{userId}")
    public Des personFindOne(@PathVariable("userId") int userId) {
        return desRepository.findDesByUserId(userId);
    }
}
