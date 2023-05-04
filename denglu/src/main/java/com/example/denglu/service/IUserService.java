package com.example.denglu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.denglu.pojo.User;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @since 2023-02-27
 */
public interface IUserService extends IService<User> {

    User login(String userName, String password);

    public User findUserByUserName(String userName);

    void updatePassword(String username, String oldpassword, String newpassword, String confirmpassword);
}
