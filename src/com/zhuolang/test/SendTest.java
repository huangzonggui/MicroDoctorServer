package com.zhuolang.test;

import com.zhuolang.model.Send;
import com.zhuolang.service.ISendService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by hzg on 2016/10/13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@Component
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class SendTest {
    @Autowired
    ISendService service;
    @Test
    public void testAdd(){
        System.out.println("service:"+service);
        Send send = new Send();
        send.setSendContent("发送信息");
        send.setUserId(38);
        send.setSendTime("12:12:00");

        service.addSend(send);
    }

    @Test
    public void testDelete(){
        int userId=38;
        String hql = "from Send where userId = '"+userId+"'";
        service.deleteSend(service.findSend(hql));
    }

    @Test
    public void testUpdate(){
        Send send = new Send();
        send.setSendContent("发送信息改为修改信息");
        send.setSendId(4);
        send.setUserId(38);
//        Date time = new Date();
//        send.setSendTime(time.toString());
        send.setSendTime("2016/10/13 20:43");

        service.updateSend(send);
    }

    @Test
    public void testFind(){

        String hql="from Send where userId = '"+ 38 +"'";
        List<Send> list = service.findSend(hql);
        System.out.println(list);
    }
}
