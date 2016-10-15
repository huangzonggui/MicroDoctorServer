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
import java.util.List;

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
    public void testDelete() {
        String hql = "from Like where id = '" + 5 + "'";
        service.deleteLike(service.findLike(hql));
    }

    @Test
    public void testUpdate() {
        Like like = new Like();
        like.setId(6);
        like.setSendId(7);
        like.setLikesId(39);
        Date date = new Date();
        like.setLikesTime(date);
        service.updateLike(like);
    }

    @Test
    public void testFind() {
        String hql = "from Like where id = '" +6 + "'";
        List<Like> list = service.findLike(hql);
        System.out.println(list);
    }

}
