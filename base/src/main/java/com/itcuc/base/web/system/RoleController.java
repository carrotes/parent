package com.itcuc.base.web.system;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itcuc.base.entity.Role;
import com.itcuc.base.service.SystemService;
import com.itcuc.base.util.JSONResult;

@Controller
@RequestMapping("system/role")
public class RoleController {
	private static Logger logger = Logger.getLogger(IconController.class);
	
	@Resource
	private SystemService systemService;
	
	@RequestMapping("getRoles")
	@ResponseBody
	public JSONResult<List<Role>> getRoles(){
		List<Role> roleList = systemService.getRoleList();
		if(roleList!=null){
			return new JSONResult<>(roleList);
		}
		return new JSONResult<>(new Exception("没有数据"));
	}
}
