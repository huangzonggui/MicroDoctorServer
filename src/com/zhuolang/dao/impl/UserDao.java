package com.zhuolang.dao.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.jsp.tagext.TryCatchFinally;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.zhuolang.dao.IUserDao;
import com.zhuolang.model.User;

/**
 * 用户持久层实现类,进行数据持久操作
 * 
 * @author jat
 *
 */
@Repository("userDao")
public class UserDao extends BaseDao<User> implements IUserDao {

//	@Override
//	public void addUser(User user) {
//		// TODO Auto-generated method stub
//		// this.save(user);
//		// 事务对象
//		Transaction tx = null;
//		String hql = "";
//		try {
//			Session session = getSessionFactory().getCurrentSession();
//			tx = session.beginTransaction();// 开启事务
//			
//			session.save(user);
//			
////			hql = "insert ? into user";
////			Query query = session.createQuery(hql);
////			query.setParameter(0, user.getName());
////			List list = query.list();
////			System.out.println(list.toString());
//			tx.commit();
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		} finally {
//			if (tx != null) {
//				tx = null;
//			}
//		}
//	}
}
