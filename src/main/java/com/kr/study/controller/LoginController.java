package com.kr.study.controller;

import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kr.study.service.LoginService;

@Controller
public class LoginController {

	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

	@Autowired
	LoginService service;

	@RequestMapping("loginCheck")
	public ModelAndView loginCheck(String id, String password) throws ClassNotFoundException, SQLException {

		logger.info("로그인체크 컨트롤러");

		ModelAndView mv = service.loginCheck(id, password);

		return mv;
	}


}
