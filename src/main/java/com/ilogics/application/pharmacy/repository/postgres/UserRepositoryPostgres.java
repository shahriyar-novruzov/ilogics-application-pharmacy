package com.ilogics.application.pharmacy.repository.postgres;

import com.ilogics.application.pharmacy.entity.UserEntity;
import com.ilogics.application.pharmacy.repository.UserRepository;
import com.ilogics.application.pharmacy.repository.mapper.UserRowMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRepositoryPostgres implements UserRepository {

    private NamedParameterJdbcTemplate template;
    private Logger logger = LoggerFactory.getLogger(UserRepositoryPostgres.class);

    public UserRepositoryPostgres(NamedParameterJdbcTemplate template) {
        this.template = template;
    }

    @Override
    public UserEntity getByUsername(String username) {

        logger.debug("getByUsername username: {}, template: {}", username, template);

        String sql = "select * from users where username = :username";
        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("username", username);
        List<UserEntity> entityList = template.query(sql, param, new UserRowMapper());

        logger.debug("getByUsername user: {}", entityList);

        return entityList != null && entityList.size() > 0 ? entityList.get(0) : null;
    }
}
