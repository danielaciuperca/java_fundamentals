package com.daniela.webapp.repository;

import com.daniela.webapp.model.User;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    private JdbcTemplate jdbcTemplate;

    public UserRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void create(User user) {
        String sql = " insert into users values (?, ?, ?) ";

        jdbcTemplate.update(sql, 1, user.getUsername(), user.getPassword());

    }
}
