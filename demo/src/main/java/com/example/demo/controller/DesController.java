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

    @GetMapping(value = "/des/all")
    private List<Des> personList() {
        return desRepository.findAll();
    }


    @PostMapping(value = "/des")
    public Des personAdd(@RequestParam("userId") int userId,
                          @RequestParam("des") String des
                         ) {
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        String formattedDate = dateFormat.format(date);
        Des desbeen =new Des();
        desbeen.setUserId(userId);
        desbeen.setDes(des);
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
