package com.mijia.controller;

import org.slf4j.Logger;  
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;
import com.mijia.weixinUser.service.IMWeixinUserService;  
  
  
/** 
 * @Ivan
 */  
@Controller 
@RequestMapping(value = "/user")
public class UserController {  
    private final Logger log = LoggerFactory.getLogger(UserController.class);  
     
    @Autowired
    IMWeixinUserService mWeixinUserService;
    
    @RequestMapping(value = "/a",method = RequestMethod.GET)  
    public String home() {  
    	mWeixinUserService.selectByPk("");
        log.info("·µ»ØÊ×Ò³£¡");  
        return "index";  
    }  
      
}  