package com.zhuolang.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by hzg on 2016/10/15.
 */
@Entity
@Table(name = "discuss_tab")
public class Discuss {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "sendId",length = 11)
    private int sendId;
    @Column(name = "observerId",length = 11)
    private int observerId;
    @Column(name = "dcontent")
    private String dcontent;
    @Column(name = "dtime")
    private String dtime;

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

    public int getObserverId() {
        return observerId;
    }

    public void setObserverId(int observerId) {
        this.observerId = observerId;
    }

    public String getDcontent() {
        return dcontent;
    }

    public void setDcontent(String dcontent) {
        this.dcontent = dcontent;
    }

    public String getDtime() {
        return dtime;
    }

    public void setDtime(String dtime) {
        this.dtime = dtime;
    }

    @Override
    public String toString() {
        return "Discuss{" +
                "id=" + id +
                ", sendId=" + sendId +
                ", observerId=" + observerId +
                ", dcontent='" + dcontent + '\'' +
                ", dtime=" + dtime +
                '}';
    }
}
