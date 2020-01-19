package com.hrms.controller;

import com.hrms.bean.Orders;
import com.hrms.service.EmployeeService;
import com.hrms.service.OrderService;
import com.hrms.util.JsonMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = "/hrms/orders")
public class OrdersController {

        @Autowired
        OrderService orderService;

        /**
         * 删除操作
         * @param orderId
         * @return
         */
        @RequestMapping(value = "/deleteOrders/{orderId}", method = RequestMethod.DELETE)
        @ResponseBody
        public JsonMsg deleteOrders(@PathVariable("orderId") Integer orderId){
            int res = 0;
            if (orderId > 0){
                res = orderService.deleteOrdersById(orderId);
            }
            if (res != 1){
                return JsonMsg.fail().addInfo("orders_del_error", "信息删除异常");
            }
            return JsonMsg.success();
        }



        /**
         * 查询
         * @param pageNo 查询指定页码包含的数据
         * @return
         */
        @RequestMapping(value = "/getOrdersList", method = RequestMethod.GET)
        public ModelAndView getOrders(@RequestParam(value = "pageNo", defaultValue = "1") Integer pageNo){
            ModelAndView mv = new ModelAndView("ordersPage");
            int limit = 5;
            // 记录的偏移量(即从第offset行记录开始查询)，
            // 如第1页是从第1行(offset=(21-1)*5=0,offset+1=0+1=1)开始查询；
            // 第2页从第6行(offset=(2-1)*5=5,offset+1=5+1=6)记录开始查询
            int offset = (pageNo-1)*limit;
            //获取指定页数包含的员工信息
            List<Orders> orders = orderService.getOrdersList(offset, limit);
            //获取总的记录数
            int totalItems = orderService.getOrdersCount();
            //获取总的页数
            int temp = totalItems / limit;
            int totalPages = (totalItems % limit == 0) ? temp : temp+1;
            //当前页数
            int curPage = pageNo;

            //将上述查询结果放到Model中，在JSP页面中可以进行展示
            mv.addObject("orders", orders)
                    .addObject("totalItems", totalItems)
                    .addObject("totalPages", totalPages)
                    .addObject("curPage", curPage);
            return mv;
        }

}
