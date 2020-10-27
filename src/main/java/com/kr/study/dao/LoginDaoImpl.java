package com.kr.study.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDaoImpl implements LoginDao {

	@Autowired
	DataSource ds;

	private static final Logger logger = LoggerFactory.getLogger(LoginDaoImpl.class);

	@Override
	public int loginCheck(String id, String password) throws ClassNotFoundException, SQLException {

		logger.info("로그인 다오 실행");

//		String mysqlId = "root"; // mysql 아이디
//		String mysqlPassword = ""; // mysql 패스워드
//		String url = "jdbc:mysql://localhost:3306/pre_management_8th"; // mysql 주소
//		Class.forName("com.mysql.jdbc.Driver");	 // DB종류를 지정
//
//		Connection conn = DriverManager.getConnection(url, mysqlId, mysqlPassword);

		Connection conn = ds.getConnection();

		String sql = "select count(*) from user_info where u_no = ? and u_password = ?";

		PreparedStatement ps = conn.prepareStatement(sql);

		ps.setString(1, id);
		ps.setString(2, password);

		ResultSet rs = ps.executeQuery();

		rs.last();

		int result = rs.getInt("count(*)");

		return result;
	}

}
