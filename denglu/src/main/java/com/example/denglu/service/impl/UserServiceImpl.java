package com.example.denglu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.denglu.Md5;
import com.example.denglu.Util.AssertUtil;
import com.example.denglu.Util.StringUtil;
import com.example.denglu.mapper.UserMapper;
import com.example.denglu.pojo.User;
import com.example.denglu.service.IUserService;
import org.springframework.stereotype.Service;
/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @since 2023-02-27
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    private Md5 md5=new Md5();

    @Override
    public User login(String username,String password){
        AssertUtil.isTrue(StringUtil.isEmpty(username),"用户名不能为空");
        AssertUtil.isTrue(StringUtil.isEmpty(password),"密码不能为空");
        User user=this.findUserByUserName(username);
        AssertUtil.isTrue(null==user,"该用户不存在");
        password=md5.md5(password);
        AssertUtil.isTrue(!(user.getPassword().equals(password)),"密码错误");
        return user;
    }
    @Override
    public User findUserByUserName(String userName){

        return this.baseMapper.selectOne(new QueryWrapper<User>().eq("username",userName));
    }

    @Override
    public void updatePassword(String username, String oldpassword, String newpassword, String confirmpassword) {
        User user=this.findUserByUserName(username);
        AssertUtil.isTrue(null==user,"用户名不存在！");
        AssertUtil.isTrue(StringUtil.isEmpty(oldpassword),"原始密码不能为空");
        AssertUtil.isTrue(StringUtil.isEmpty(newpassword),"新密码不能为空");
        AssertUtil.isTrue(StringUtil.isEmpty(confirmpassword),"确认密码不能为空");
        oldpassword=md5.md5(oldpassword);
        AssertUtil.isTrue(!(user.getPassword().equals(oldpassword)),"原始密码错误");
        AssertUtil.isTrue(!(newpassword.equals(confirmpassword)),"新密码和确认密码不一致");
        newpassword=md5.md5(newpassword);
        AssertUtil.isTrue(oldpassword.equals(newpassword),"新密码和原始密码一致");
        user.setPassword(newpassword);
        AssertUtil.isTrue(!updateById(user),"用户密码更新失败");
    }

}
