package com.hand.hp23854.mapper;

import com.hand.hp23854.domain.User;

public interface UserMapper {
    int insertUser(User user);

    int updateUser(User user);

    int deleteUser(Long userId);

    User findUserById(Long id);
}
