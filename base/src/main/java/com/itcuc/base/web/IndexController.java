package com.itcuc.base.web;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.itcuc.base.entity.Function;
import com.itcuc.base.entity.User;
import com.itcuc.base.service.UserService;
import com.itcuc.base.util.JSONResult;
import com.itcuc.utils.CookieUtils;
import com.itcuc.utils.GlobalUtils;
import com.itcuc.utils.StringUtils;

@Controller
public class IndexController {
	private static Logger logger = Logger.getLogger(IndexController.class);
	
	@Resource
	private UserService userService;

	@RequestMapping("/getHead")
	public void getHead(@RequestParam Map<String, String> paramMap, HttpServletRequest request,
			HttpServletResponse response) {
		try {
			OutputStream out = response.getOutputStream();
			String userId = paramMap.get("userId");
			if (StringUtils.isNotNULL(userId)) {
				byte[] data = userService.getUserHead(userId);
				out.write(data);
			}
		} catch (IOException e) {
			logger.warn(e.getMessage());
			return;
		}
	}

	@RequestMapping("/index")
	public String toIndex(@RequestParam Map<String, String> paramMap, Model model, HttpServletRequest request,
			HttpServletResponse response, RedirectAttributes attr) {
		String token = CookieUtils.getCookie(request, GlobalUtils.get("maincookie"));
		if (token != null && !token.trim().isEmpty()) {
			try {
				User user = userService.validateToken(token);
				List<Function> mapList = userService.checkToken(token);
				model.addAttribute("user", user);
				if (mapList != null) {
					model.addAttribute("list", mapList);
					return "index";
				}
			} catch (Exception e) {
				logger.warn(e.getMessage());
				attr.addAttribute("ex", e.getMessage());
			}
		}
		return "redirect:/toLogin";
	}

	@RequestMapping("/toLogin")
	public String toLogin() {
		return "login";
	}

	@RequestMapping("/login")
	@ResponseBody
	public JSONResult<String> login(@RequestParam Map<String, String> paramMap, Model model, HttpServletRequest request,
			HttpServletResponse response) {
		String userAccount = request.getParameter("user_account");
		String userPassword = request.getParameter("user_password");
		try {
			String token = userService.login(userAccount, userPassword);
			CookieUtils.addCookie(response, GlobalUtils.get("maincookie"), token, 0);
		} catch (Exception e) {
			logger.warn(e.getMessage());
			return new JSONResult<>(e);
		}
		return new JSONResult<>("index");
	}
}
