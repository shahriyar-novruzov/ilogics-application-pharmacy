package com.ilogics.application.pharmacy.repository.postgres;

import com.ilogics.application.pharmacy.entity.UserEntity;
import com.ilogics.application.pharmacy.repository.UserRepository;
import com.ilogics.application.pharmacy.repository.mapper.UserRowMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserRepositoryPostgres implements UserRepository {

    private JdbcTemplate template;
    private Logger logger = LoggerFactory.getLogger(UserRepositoryPostgres.class);

    public UserRepositoryPostgres(JdbcTemplate template) {
        this.template = template;
    }

    @Override
    public UserEntity findByUsername(String username) {

        String sql = "select * from users where username = ?";
        UserEntity entityList = template.queryForObject(sql, new Object[]{username}, new UserRowMapper());

        logger.debug("findByUsername user: {}", entityList);

        return entityList;
    }

    @Override
    public UserEntity findById(Long id) {

        String sql = "select * from users where id = ?";

        UserEntity entityList = template.queryForObject(sql, new Object[]{id}, new UserRowMapper());

        logger.debug("findById user: {}", entityList);

        return entityList;
    }
}
