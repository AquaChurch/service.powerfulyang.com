package com.powerfulyang.cache.redis.service;

import com.powerfulyang.cache.redis.entity.User;

public interface UserService {
    /**
     * 保存或修改用户
     *
     * @param user 用户对象
     */
    void saveOrUpdate(User user);

    /**
     * 获取用户
     *
     * @param id key值
     * @return 返回结果
     */
    User get(Long id);

    /**
     * 删除
     *
     * @param id key值
     */
    void delete(Long id);
}
