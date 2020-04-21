package com.wang.myvhr.mapper;

import com.wang.myvhr.model.Hr;
import com.wang.myvhr.model.Role;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface HrMapper {
    Hr loadUserByUsername(String username);

    List<Role> getHrRolesById(Integer id);

    List<Hr> getAllHrs(@Param("hrid") Integer hrid,@Param("keywords") String keywords);

    List<Hr> getAllHrsExceptCurrentHr(Integer id);
}
