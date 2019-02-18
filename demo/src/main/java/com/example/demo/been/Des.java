package com.example.demo.been;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Des implements  Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    public long id;

    @Column(nullable = false, unique = true)
    public int userId;

    @Column(nullable = false, unique = true)
    public String des;

    @ManyToOne
    @JoinColumn(name = "user")
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }


}
