package com.example.demo.been;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Comment implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    public long id;
    @Column(nullable = false, unique = true)
    public int useid;
    @Column(nullable = false)
    public String usedDes;

//    @JsonIgnore
//    @OneToOne(fetch = FetchType.LAZY, mappedBy = "comment")
//    private Des des;

//    public Des getDes() {
//        return des;
//    }
//
//    public void setDes(Des des) {
//        this.des = des;
//    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

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

    public String getUsedDes() {
        return usedDes;
    }

    public void setUsedDes(String usedDes) {
        this.usedDes = usedDes;
    }
}
