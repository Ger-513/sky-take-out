package com.sky.service;
import com.sky.dto.DishDTO;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;




public interface DishService {
    /**
     * 新增菜品，同时保存对应的口味数据
     * @param dishDTO
     */
    public void saveWithFlavor(DishDTO dishDTO);
}
