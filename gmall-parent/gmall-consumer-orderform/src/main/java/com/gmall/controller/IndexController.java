package com.gmall.controller;
/**
 * 初始跳转 
 * 
 * */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gmall.sys.user.UserBean;

@Controller
@RequestMapping("gmall")
public class IndexController {
	
	/**
	 * 说明：跳转-登录页
	 * @author wan
	 * @date 2019年07月23日16:04:06 
	 * */
	@RequestMapping("/index")
	public String gotoIndexPage() {
		return "login";
	}
	
	/**
	 * 说明：验证登录
	 * @author wan
	 * @date 2019年07月23日16:04:06 
	 * */
	@ResponseBody
	@RequestMapping("/login")
	public boolean verifyLogin(Model model, UserBean bean) {
		try {
			System.out.println(bean.getName()+"    "+bean.getAddress());
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	/**
	 * 说明：跳转-主页面
	 * @author wan
	 * @date 2019年07月23日16:04:06 
	 * */
	@RequestMapping("/main")
	public String gotoMainPage() {
		return "main";
	}
	
	/**
	 * 说明：跳转-主页面
	 * @author wan
	 * @date 2019年07月23日16:04:06 
	 * */
	@RequestMapping("/welcome")
	public String gotoWelcomPage() {
		return "welcome";
	}
}
