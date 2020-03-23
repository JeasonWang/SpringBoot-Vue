package com.wang.myvhr.mapper;

import com.wang.myvhr.model.Position;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PositionMapper {
    List<Position> getAllPos();
    int deletePos(Integer id);
    int addPos(Position position);
}
