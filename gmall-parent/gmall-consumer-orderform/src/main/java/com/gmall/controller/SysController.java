package com.gmall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gmall.sys.IUserService;
import com.gmall.sys.user.UserBean;
/**
 * 分布式RPC通信
 *   provider
 *   
 * */
@Controller
@RequestMapping("sys")
public class SysController {

	//@Autowired
	@Reference //dubbo提供的远程服务注册
	IUserService userService;
	/**
	 * 查询用户
	 * 
	 * */
	@RequestMapping("/queryUser")
	public String queryUsers(Model model, UserBean bean) {
		List<UserBean> user= userService.queryUsers(bean);
		model.addAttribute("user",user);
		return "sys/user_list";
	}
	
}
