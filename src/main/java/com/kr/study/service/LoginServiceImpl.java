package com.kr.study.service;

import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.kr.study.dao.LoginDao;
@Service
public class LoginServiceImpl implements LoginService {

	private static final Logger logger = LoggerFactory.getLogger(LoginServiceImpl.class);

	@Autowired
	LoginDao dao;

	@Override
	public ModelAndView loginCheck(String id, String password) throws ClassNotFoundException, SQLException {

		logger.info("로그인 서비스");

		int result = dao.loginCheck(id, password);

		ModelAndView mv = new ModelAndView();

		if(result > 0) {
			mv.setViewName("main");
			mv.addObject("id",id);
		} else {
			mv.setViewName("home");
		}

		return mv;
	}

}
