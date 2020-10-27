package com.kr.study.dao;

import java.sql.SQLException;

public interface LoginDao {

	int loginCheck(String id, String password) throws ClassNotFoundException, SQLException;

}
