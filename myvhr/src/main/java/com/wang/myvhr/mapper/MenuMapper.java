package com.wang.myvhr.mapper;

import com.wang.myvhr.bean.Menu;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuMapper {
    List<Menu> getAllMenu();
    List<Menu> getMenusByHrId(Long hrId);
    List<Menu> menuTree();
    List<Long> getMenusByRid(Long rid);
}
