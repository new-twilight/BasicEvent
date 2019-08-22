package com.twilight.base.mapper;

import com.twilight.base.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author paulx
 * @since 2019-08-22
 */
@Component("userMapper")
public interface UserMapper extends BaseMapper<User> {

}
