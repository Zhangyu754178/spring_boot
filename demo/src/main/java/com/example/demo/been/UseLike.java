package com.example.demo.been;

import com.fasterxml.jackson.annotation.JsonIgnore;


import javax.persistence.*;
import java.io.Serializable;
@Entity
public class UseLike implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id" )
    public long id;
    @Column(name = "useid" )
    public int useid;

//    @JsonIgnore
//    @OneToOne(fetch = FetchType.LAZY, mappedBy = "uselike")
//    private Des des;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getUseid() {
        return useid;
    }

    public void setUseid(int useid) {
        this.useid = useid;
    }

//    public Des getDes() {
//        return des;
//    }
//
//    public void setDes(Des des) {
//        this.des = des;
//    }
}
