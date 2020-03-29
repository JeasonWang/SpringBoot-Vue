package com.wang.myvhr.service;

import com.wang.myvhr.mapper.PositionMapper;
import com.wang.myvhr.model.Position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PositionService {
    @Autowired
    PositionMapper positionMapper;
    public List<Position> getAllPos(){
        return positionMapper.getAllPos();
    }
    public int deletePos(Integer id){
        return positionMapper.deletePos(id);
    }
    public int addPos(Position position){
        position.setEnabled(true);
        position.setCreateDate(new Date());
        return positionMapper.addPos(position);
    }

}
