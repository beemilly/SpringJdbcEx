package com.kr.study.service;

import java.sql.SQLException;

import org.springframework.web.servlet.ModelAndView;

public interface LoginService {

	ModelAndView loginCheck(String id, String password) throws ClassNotFoundException, SQLException;




}
