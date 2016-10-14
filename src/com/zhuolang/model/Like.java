package com.zhuolang.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by hzg on 2016/10/14.
 */
@Entity
@Table(name = "likes_tab")
public class Like {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "sendId",length = 11)
    private int sendId;
    @Column(name = "likesId",length = 11)
    private int likesId;
    @Column(name = "likesTime")
    private Date likesTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSendId() {
        return sendId;
    }

    public void setSendId(int sendId) {
        this.sendId = sendId;
    }

    public int getLikesId() {
        return likesId;
    }

    public void setLikesId(int likesId) {
        this.likesId = likesId;
    }

    public Date getLikesTime() {
        return likesTime;
    }

    public void setLikesTime(Date likesTime) {
        this.likesTime = likesTime;
    }

    @Override
    public String toString() {
        return "Like{" +
                "id=" + id +
                ", sendId=" + sendId +
                ", likesId=" + likesId +
                ", likesTime=" + likesTime +
                '}';
    }
}
