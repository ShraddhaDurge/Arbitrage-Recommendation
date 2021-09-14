package com.dao;

import java.util.List;

import com.pojo.CustomerShares;
import com.pojo.Users;

public interface SharesDAO {
	public int saveShare(CustomerShares share);
	public int deleteShare(String instrumentSymbol);
	public List<CustomerShares> displayAllShares(int userid);

}
