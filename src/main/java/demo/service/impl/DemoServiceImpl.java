package demo.service.impl;

import com.alibaba.fastjson.JSON;
import demo.model.OrderDTO;
import demo.service.DemoService;
import org.springframework.stereotype.Component;

@Component
public class DemoServiceImpl implements DemoService {

    public int add(int a, int b) {
        return a + b;
    }

    public Boolean processOrder(OrderDTO orderDTO) {
        if(orderDTO == null){
            return false;
        }
        if(orderDTO.getBuyer() == null || orderDTO.getSeller() == null){
            return false;
        }
        if(orderDTO.getCount() <= 0){
            return false;
        }
        if(orderDTO.getCount() == 100){
            throw new RuntimeException("error count");
        }
        System.out.println(JSON.toJSONString(orderDTO));
        return true;
    }
}

