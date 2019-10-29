package com.dao;

import com.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    User queryById(int id);
}
