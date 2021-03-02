package com.example.demo.service;

import com.example.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<User> query(){
        String sql="select * from user";

        List<User> users=jdbcTemplate.query(sql, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                User user=new User();
                user.setUid(resultSet.getInt("uid"));
                user.setUname(resultSet.getString("uname"));
                user.setUgender(resultSet.getString("ugender"));
                user.setUpassword(resultSet.getString("upassword"));
                user.setUphone(resultSet.getLong("uphone"));
                user.setUbirth(resultSet.getString("ubirth"));
                user.setUemail(resultSet.getString("uemail"));
                user.setUflag(resultSet.getInt("uflag"));
                return user;
            }
        });
        return users;
    }
}
