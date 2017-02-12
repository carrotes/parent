package com.itcuc.base.web;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itcuc.base.entity.Function;
import com.itcuc.base.entity.User;
import com.itcuc.base.service.UserService;
import com.itcuc.utils.GlobalUtils;

@Controller
public class IndexController {
	@Resource
	private UserService userService;

	@RequestMapping("/index")
	public String toIndex(Map<String, String> paramMap, Model model, HttpServletRequest request,
			HttpServletResponse response) {
		String id = GlobalUtils.get("maincookie");
		User user = null;
		List<Function> functionList = null;
		if (id != null && !id.trim().isEmpty()) {
			user = userService.findUserById(id);
			functionList = userService.findFunctionListByUserId(id);
		}
		if (user == null) {
			return "redirect:/toLogin";
		} else {
			model.addAttribute("user", user);
		}
		if (functionList != null && !functionList.isEmpty()) {
			model.addAttribute("functionList", functionList);
		}
		return "index";
	}
	
	@RequestMapping("/toLogin")
	public String toLogin(){
		return "login";
	}
	
	@RequestMapping("/login")
	public String login(Map<String, String> paramMap, Model model, HttpServletRequest request,
			HttpServletResponse response){
		return "index";
	}
}
