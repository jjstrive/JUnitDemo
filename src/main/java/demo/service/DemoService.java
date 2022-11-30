package demo.service;

import demo.model.OrderDTO;

public interface DemoService {

    int add(int a, int b);
    Boolean processOrder(OrderDTO orderDTO);
}
