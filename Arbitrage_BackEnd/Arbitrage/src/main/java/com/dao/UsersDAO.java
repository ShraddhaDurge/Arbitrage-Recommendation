package com.dao;

import java.util.List;

import com.pojo.Users;

public interface UsersDAO {

	public Users checkLogin(String user_name,String pass_word);
	public int logOut();
	public void forgotPassword();
	public List<Users> findAllUsers();
}
