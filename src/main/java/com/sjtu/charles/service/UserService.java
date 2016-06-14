package com.sjtu.charles.service;


import com.sjtu.charles.po.User;

import java.util.List;

public interface UserService {
    /**
     * 查找所有用户
     * @return
     * @throws Exception
     */
    List<User> findUser()throws Exception;
}
