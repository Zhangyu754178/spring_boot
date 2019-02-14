package com.example.demo.been;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

//@Entity
public class Comment implements Serializable {
    private static final long serialVersionUID = 1L;
    //@Id
    //@GeneratedValue
    public long id;
   // @Column(nullable = false, unique = true)
    public int useid;
    //@Column(nullable = false)
    public String usedDes;

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
