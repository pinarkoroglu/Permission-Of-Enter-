package com.permission.permission.Service;

import com.permission.permission.Model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);

}
