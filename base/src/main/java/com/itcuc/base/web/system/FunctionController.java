package com.itcuc.base.web.system;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itcuc.base.entity.Function;
import com.itcuc.base.service.SystemService;
import com.itcuc.base.util.JSONResult;
import com.itcuc.utils.CookieUtils;
import com.itcuc.utils.GlobalUtils;
import com.itcuc.utils.StringUtils;

@Controller
@RequestMapping("system")
public class FunctionController {
	private static Logger logger = Logger.getLogger(FunctionController.class);
	@Resource
	private SystemService systemService;
	
	@RequestMapping("function/addNewMenu")
	public String addNewMenu(@RequestParam Map<String,String> paramMap,@RequestParam String[] roles,Model model){
		String functionName = paramMap.get("functionName");
		String functionUrl = paramMap.get("functionUrl");
		String functionIcon = paramMap.get("functionIcon");
		String functionDisabled = paramMap.get("functionDisabeld");
		System.out.println(roles[0]);
		System.out.println(roles[1]);
		return "";
	}

	@RequestMapping("function/childFunction")
	public String childFunction(@RequestParam Map<String, String> paramMap,Model model) {
		String parentId = paramMap.get("functionId");
		String parentName = paramMap.get("functionName");
		if (StringUtils.isNotNULL(parentId)) {
			List<Map<String, Object>> mapList = systemService.getSubFunctionAndRoles(parentId);
			model.addAttribute("functionName", parentName);
			model.addAttribute("mapList", mapList);
			return "system/function/childFunctionList";
		}
		return "error/permissonError";
	}

	@RequestMapping("function/functionList")
	public String functionList(@RequestParam Map<String, String> paramMap, Model model) {
		List<Map<String, Object>> mapList = systemService.getParentFunctionAndRoles();
		model.addAttribute("mapList", mapList);
		return "system/function/functionList";
	}

	@RequestMapping("function/addMenu")
	public String addMenu(@RequestParam Map<String, String> paramMap, Model model, HttpServletRequest request) {
		String token = CookieUtils.getCookie(request, GlobalUtils.get("maincookie"));
		String path = request.getRequestURI();
		String backUrl = paramMap.get("back");
		model.addAttribute("backUrl", backUrl);
		try {
			boolean permission = systemService.checkPermission(token, path);
			if (!permission) {
				return "error/permissionError";
			}
		} catch (Exception e) {
			logger.warn(e.getMessage());
			model.addAttribute("exc", e);
		}
		return "system/function/addMenuForm";
	}

	@RequestMapping("function/show")
	@ResponseBody
	public JSONResult<List<Function>> show(@RequestParam Map<String, String> paramMap) {
		JSONResult<List<Function>> result = null;
		String functionId = paramMap.get("functionId");
		String userId = paramMap.get("userId");
		if (StringUtils.isNotNULL(functionId) && StringUtils.isNotNULL(userId)) {
			List<Function> functionList = null;
			try {
				functionList = systemService.getSubFunctions(functionId, userId);
			} catch (Exception e) {
				logger.warn(e.getMessage());
				result = new JSONResult<>(e);
			}
			result = new JSONResult<>(functionList);
		}
		return result;
	}
}
