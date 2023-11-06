package com.alok.dev.demo.MybatisXMLPostgreSQL.repository;

import com.alok.dev.demo.MybatisXMLPostgreSQL.model.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {

    List<User> findAll();

    Optional<User> findById(Integer id);

    int deleteById(Integer id);

    int insert(User user);

    int update(User user);

}
