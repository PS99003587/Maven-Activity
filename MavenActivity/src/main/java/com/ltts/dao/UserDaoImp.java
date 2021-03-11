package com.ltts.dao;

import java.sql.JDBCType;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;
import javax.swing.tree.RowMapper;

import com.ltts.model.Login;
import com.ltts.model.User;

public class UserDaoImp implements UserDao{
	
	DataSource datasource;
	
	JDBCType jdbcTemplate;
	public void register(User user) {

	    String sql = "insert into users values(?,?,?,?,?,?,?)";

	    jdbcTemplate.update(sql, new Object[] { user.getName(), user.getPassword(), user.getFname(),
	    user.getLname(), user.getMob() });
	    }

	    public User validateUser(Login login) {

	    String sql = "select * from users where username='" + login.getName() + "' and password='" + login.getPassword()
	    + "'";

	    List<User> users = jdbcTemplate.query(sql, new UserMapper());\
	    

	    return users.size() > 0 ? users.get(0) : null;
	    }

	  }

	  class UserMapper implements RowMapper<User> {

	  public User mapRow(ResultSet rs, int arg1) throws SQLException {
	    User user = new User();

	    user.setName(rs.getString("name"));
	    user.setPassword(rs.getString("password"));
	    user.setFname(rs.getString("fname"));
	    user.setLname(rs.getString("lname"));
	    user.setMob(rs.getInt("mob"));

	    return user;
	  }

}
