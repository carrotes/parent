package com.itcuc.base.web;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itcuc.base.entity.Function;
import com.itcuc.base.service.SystemService;
import com.itcuc.base.util.JSONResult;
import com.itcuc.utils.StringUtils;

@Controller
@RequestMapping("system")
public class SystemController {
	private static Logger logger = Logger.getLogger(SystemController.class);
	@Resource
	private SystemService systemService;
	
	@RequestMapping("show")
	@ResponseBody
	public JSONResult<List<Function>> show(@RequestParam Map<String,String>paramMap){
		JSONResult<List<Function>> result = null;
		String functionId = paramMap.get("functionId");
		String userId = paramMap.get("userId");
		if(StringUtils.isNotNULL(functionId) && StringUtils.isNotNULL(userId)){
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
