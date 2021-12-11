package com.zking.service;

import com.zking.model.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

@Transactional
public interface IUserService {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    public User selectByUserName(String username);
    public Set<String> getRoleByUserName(String username);
    public Set<String>getPermissionByUserName(String username);
    List<User> list();
}