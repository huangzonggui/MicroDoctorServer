package com.zhuolang.test;

import com.zhuolang.model.Discuss;
import com.zhuolang.service.IDiscussService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by hzg on 2016/10/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@Component
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class DiscussTest {
    @Autowired
    IDiscussService service;

    @Test
    public void testAdd() {
        Discuss discuss = new Discuss();
        discuss.setSendId(6);
        discuss.setObserverId(38);
        discuss.setDcontent(null);//"我喜欢评论，我最喜欢评论了，这个是我的评论内容，够长了吧，text类型的"

        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String time = dateFormat.format(date);

        discuss.setDtime(time);

        service.addDiscuss(discuss);
    }

    @Test
    public void testDelete(){
        String hql = "from Discuss where id = '" + 1 + "'";
        service.deleteDiscuss(service.findDiscuss(hql));
    }

    @Test
    public void testUpdate(){
        Discuss discuss = new Discuss();
        discuss.setId(2);
        discuss.setSendId(7);
        discuss.setObserverId(39);
        discuss.setDcontent(null);//"我喜欢评论，我最喜欢评论了，这个是我的评论内容，够长了吧，text类型的"

        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String time = dateFormat.format(date);
        System.out.println(time);

        discuss.setDtime(time);

        service.updateDiscuss(discuss);
    }

    @Test
    public void testFind(){
        String hql="from Discuss where id ='"+2+"'";
        System.out.println(service.findDiscuss(hql));
    }
}
