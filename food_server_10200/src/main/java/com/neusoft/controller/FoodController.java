package com.neusoft.controller;

import com.neusoft.po.CommonResult;
import com.neusoft.po.Food;
import com.neusoft.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*@CrossOrigin("*")*/
@RestController
@RequestMapping("/FoodController")
public class FoodController {

    @Autowired
    private FoodService foodService;

    @GetMapping("/listFoodByBusinessId/{businessId}")
    public CommonResult<List> listFoodByBusinessId(@PathVariable("businessId") Integer businessId) throws Exception{
        List<Food> list = foodService.listFoodByBusinessId(businessId);
        return new CommonResult(200,"success",list);
    }
}
