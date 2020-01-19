package com.hrms.service;

import com.hrms.bean.Employee;
import com.hrms.bean.Orders;
import com.hrms.mapper.OrdersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderService {

        @Autowired
        OrdersMapper ordersMapper;

        public int getOrdersCount(){
            return ordersMapper.countOrders();
        }
        public List<Orders> getOrdersList(Integer offser, Integer limit){
            return ordersMapper.selectByLimitAndOffset(offser, limit);
        }
        public Orders getOrdersById(Integer orderId){
            return ordersMapper.selectOneById(orderId);
        }
        public Orders getOrdersByName(String  userName){return ordersMapper.selectOneByName(userName);};
        public int updateOrdersById(Integer orderId, Orders orders){
            return ordersMapper.updateOneById(orderId, orders);
        }
        public int deleteOrdersById(Integer orderId){
            return ordersMapper.deleteOneById(orderId);
        }
        public int addOrders(Orders orders){
            return ordersMapper.insertOne(orders);
        }


}
