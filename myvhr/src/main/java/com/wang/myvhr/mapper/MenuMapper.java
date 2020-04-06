package com.wang.myvhr.mapper;

import com.wang.myvhr.model.Menu;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuMapper {
    List<Menu> getAllMenus();
    List<Menu> getMenusByHrId(Integer hrid);
    List<Integer> getMidsByRid(Integer rid);
    List<Menu> getAllMenusWithRole();
}
