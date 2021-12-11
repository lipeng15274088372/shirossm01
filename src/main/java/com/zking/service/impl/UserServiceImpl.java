package com.zking.service.impl;

import com.zking.mapper.UserMapper;
import com.zking.model.User;
import com.zking.service.IUserService;
import com.zking.util.PasswordHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public int deleteByPrimaryKey(Integer userId) {

        return userMapper.deleteByPrimaryKey(userId);
    }

    @Override
    public int insert(User record) {
        String salt = PasswordHelper.createSalt();
        String pwd = PasswordHelper.createCredentials(record.getPassword(), salt);
        record.setSalt(salt);
        record.setPassword(pwd);

        return userMapper.insert(record);
    }

    @Override
    public int insertSelective(User record) {
        return 0;
    }

    @Override
    public User selectByPrimaryKey(Integer userId) {

        return userMapper.selectByPrimaryKey(userId);
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(User record) {

        return userMapper.updateByPrimaryKey(record);
    }

    @Override
    public User selectByUserName(String username) {

        return userMapper.selectByUserName(username);
    }

    @Override
    public Set<String> getRoleByUserName(String username) {
        return userMapper.getRoleByUserName(username);
    }

    @Override
    public Set<String> getPermissionByUserName(String username) {
        return userMapper.getPermissionByUserName(username);
    }

    @Override
    public List<User> list() {
        return userMapper.list();
    }
}
