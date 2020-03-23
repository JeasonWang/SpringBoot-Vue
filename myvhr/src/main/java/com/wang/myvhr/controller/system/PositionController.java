package com.wang.myvhr.controller.system;

import com.wang.myvhr.model.Position;
import com.wang.myvhr.model.RespBean;
import com.wang.myvhr.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/system/basic")
public class PositionController {
    @Autowired
    PositionService positionService;
    @GetMapping("/pos")
    public List<Position> getAllPos(){
        return positionService.getAllPos();
    }

    @DeleteMapping("/pos/{id}")
    public RespBean deletePositionById(@PathVariable Integer id) {
        if (positionService.deletePos(id) == 1) {
            return RespBean.ok("删除成功!");
        }
        return RespBean.error("删除失败!");
    }
    @PostMapping("/pos")
    public RespBean addPos(@RequestBody Position position){
        if(positionService.addPos(position) == 1)
        {
            return RespBean.ok("增加成功");
        }
        return RespBean.error("增加失败");
    }
}
