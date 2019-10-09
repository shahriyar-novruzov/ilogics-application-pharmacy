package com.ilogics.application.pharmacy.repository.mapper;

import com.ilogics.application.pharmacy.entity.UserEntity;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper<UserEntity> {

    @Override
    public UserEntity mapRow(ResultSet rs, int arg1) throws SQLException {

        UserEntity user = new UserEntity();
        user.setId(rs.getLong("userid"));
        user.setUsername(rs.getString("username"));
        user.setPassword(rs.getString("password"));

        return user;
    }
}
