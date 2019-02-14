package com.example.demo.been;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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

    public List<UseLike> useLikes;

    public List<Comment> comments;

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

    public List<UseLike> getUseLikes() {
        return useLikes;
    }

    public void setUseLikes(List<UseLike> useLikes) {
        this.useLikes = useLikes;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
