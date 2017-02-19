package com.itcuc.base.web.system;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itcuc.base.bean.Icon;
import com.itcuc.base.util.IconUtils;
import com.itcuc.base.util.JSONResult;

@Controller
@RequestMapping("system/icon")
public class IconController {
	
	private static Logger logger = Logger.getLogger(IconController.class);
	
	@RequestMapping("iconSelect")
	@ResponseBody
	public JSONResult<List<Icon>> iconSelect(){
		try {
			return new JSONResult<>(IconUtils.getIconList());
		} catch (Exception e) {
			logger.warn(e.getMessage());
			return new JSONResult<>(e);
		}
	}
	
	@RequestMapping("getIcons")
	public String getIcons(){
		return "system/function/icons";
	}
}
