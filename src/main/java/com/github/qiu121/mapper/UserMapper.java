package com.github.qiu121.mapper;

import com.github.qiu121.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    // 返回值必须用包装类型，为空返回null，而不是0
    @Select("SELECT `id` FROM `student25`.`user25` WHERE `id`=#{id} AND `pwd`=#{password}")
    Integer login(@Param("id") int id, @Param("password") String password);

    @Insert("INSERT INTO `student25`.`user25` (`id`, `age`, `name`, `sex`, `pwd`, `subject`)VALUES (#{id}, #{age}, #{name}, #{sex}, #{pwd}, #{subject})")
    Integer register(User user);

    @Select("SELECT * FROM `student25`.`user25`")
    List<User> list();
}
