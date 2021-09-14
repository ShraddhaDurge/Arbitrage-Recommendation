package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import com.pojo.CustomerShares;
@Repository
public class SharesDAOImpl implements SharesDAO {


	@Autowired
	JdbcTemplate template;
	
	@Override
	public int saveShare(CustomerShares share) {
		// TODO Auto-generated method stub
		int inserted = 0;

		String INSERT_SHARE = "insert into saved_shares(user_id,stock_symbol,stock_shortname,stock_bseprice,stock_nseprice,stock_profit,"
				+ "stock_quantity,saved_time) values(?,?,?,?,?,?,?,?)";
		inserted = template.update(INSERT_SHARE,share.getUser_id(),share.getStock_symbol(),share.getStock_shortname(),share.getStock_bseprice()
				,share.getStock_nseprice(),share.getStock_profit(),share.getStock_quantity(),share.getSaved_time());
		return inserted;
	}

	@Override
	public int deleteShare(String instrumentSymbol) {
		// TODO Auto-generated method stub
		int deleted = 0;

		String DELETE_SHARE = "DELETE FROM saved_shares WHERE stock_symbol=?";
		deleted = template.update(DELETE_SHARE,instrumentSymbol);
		
		return deleted;
		
	}


	@Override
	public List<CustomerShares> displayAllShares(int user_id) {
		// TODO Auto-generated method stub

		String FINDSHARES = "select * from saved_shares where user_id=?";
		List<CustomerShares> shares = template.query(FINDSHARES, new RowMapper<CustomerShares>() {

			@Override
			public CustomerShares mapRow(ResultSet set, int arg1) throws SQLException {
				// TODO Auto-generated method stub
				return new CustomerShares(set.getString(3),set.getDouble(4),set.getDouble(5),set.getInt(6),set.getDouble(7),set.getDate(8));				
			}

		}, user_id);

		System.out.println(shares);
		return shares;
	}


}
