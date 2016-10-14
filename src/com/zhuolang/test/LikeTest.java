package com.zhuolang.test;

import com.zhuolang.model.Like;
import com.zhuolang.service.ILikeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/**
 * Created by hzg on 2016/10/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@Component
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class LikeTest {
    @Autowired
    ILikeService service;

    @Test
    public void testAdd(){
        Like like = new Like();
        like.setSendId(8);
        like.setLikesId(38);
        Date date = new Date();
        like.setLikesTime(date);

        service.addLike(like);
    }

    @Test
    public void testdelete() {
        String hql = "from Like where id = '" + 5 + "'";
        service.deleteLike(service.findLike(hql));
    }

}
