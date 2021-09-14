package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.pojo.Users;

@Repository
public class UsersDAOImpl implements UsersDAO {

	@Autowired
	JdbcTemplate template;


	@Override
	public int logOut() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void forgotPassword() {
		// TODO Auto-generated method stub

	}
	@Override
	public List<Users> findAllUsers() {
		// TODO Auto-generated method stub
		String FINDUSERS = "select * from users";
		List<Users> user = template.query(FINDUSERS, new RowMapper<Users>() {

			@Override
			public Users mapRow(ResultSet set, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				return new Users(set.getInt(1),set.getString(2), set.getString(3));
			}

	});
		return user;
}
	@Override
	public Users checkLogin(String username,String password) {
		// TODO Auto-generated method stub
		String FINDPASSWORD = "select * from users where username=? and password=?";
		Users userss =  template.queryForObject(FINDPASSWORD, new RowMapper<Users>() {

			@Override
			public Users mapRow(ResultSet set, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				return new Users(set.getInt(1),set.getString(2), set.getString(3));
			}


	},username,password);
		//System.out.println(pass);
		/*List<String> temp=pass; 
		if(pass.contains(pass1))
			return true;
		else
			return false;*/
		return userss;
}
}
