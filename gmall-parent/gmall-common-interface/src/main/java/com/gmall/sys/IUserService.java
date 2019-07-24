package com.gmall.sys;

import java.util.List;

import com.gmall.sys.user.UserBean;

public interface IUserService {
	
   List<UserBean> queryUsers(UserBean bean);

}
