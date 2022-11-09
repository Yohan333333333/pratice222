package com.jsplec.bbs.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.jsplec.bbs.Dto.HostDto;

public class HostDao {

	DataSource dataSource;
	
	
	public HostDao() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/Hoping");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public int ClientLogin(String id, String pw){
		ArrayList<HostDto> dtos = new ArrayList<HostDto>();
		Connection connection = null; //데이터 접근을 위한 객체
		PreparedStatement preparedStatement = null; //쿼리문 실행을 위한 객체
		ResultSet resultSet = null; //데이터를 가져와 결과값을 얻기 위한 객체
		int count = 0;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "select count(*) from customer where cId = '" + id + "' cPw = '" +  pw + "'";
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				count = resultSet.getInt(1);
				
				System.out.println(query);
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(resultSet != null) resultSet.close();
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return count;
	}
	public int HostSignup(String id, String pw){
		ArrayList<HostDto> dtos = new ArrayList<HostDto>();
		Connection connection = null; //데이터 접근을 위한 객체
		PreparedStatement preparedStatement = null; //쿼리문 실행을 위한 객체
		ResultSet resultSet = null; //데이터를 가져와 결과값을 얻기 위한 객체
		int count = 0;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "select count(*) from customer where cId = '" + id + "' cPw = '" +  pw + "'";
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				count = resultSet.getInt(1);
				
				System.out.println(query);
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(resultSet != null) resultSet.close();
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return count;
	}










}
