package com.gmall.service.sys;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.gmall.sys.IUserService;
import com.gmall.sys.user.UserBean;

@Service  //使用dubbo暴露服务
@Component //service注解被占用，使用Spring其他注解
public class UserServiceImpl implements IUserService{

	@Override
	public List<UserBean> queryUsers(UserBean bean) {
		List<UserBean> list=new ArrayList<UserBean>();
		UserBean user=new UserBean();
		user.setId(1);
		user.setName("wanchanghuang");
		user.setAddress("shanghai");
		user.setAge(30);
		list.add(user);
		
		UserBean user2=new UserBean();
		user2.setId(2);
		user2.setName("rose");
		user2.setAddress("wuhan");
		user2.setAge(26);
		list.add(user2);
		
		return list;
	}

}



