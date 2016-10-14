package com.zhuolang.dao.impl;

import com.zhuolang.dao.ISendDao;
import com.zhuolang.model.Send;
import org.springframework.stereotype.Repository;

/**
 * Created by hzg on 2016/10/13.
 */
@Repository("sendDao")
public class SendDao extends BaseDao<Send> implements ISendDao{

}
