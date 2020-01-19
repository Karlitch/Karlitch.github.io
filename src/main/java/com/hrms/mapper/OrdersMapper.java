package com.hrms.mapper;

import com.hrms.bean.Employee;
import com.hrms.bean.Orders;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface OrdersMapper {

        String TABLE_NAME = "orders";
        String INSERT_FIELDS = "orderId,userName,telephone,goods";
        String SELECT_FIELDS = "orderId " + INSERT_FIELDS;

        /**
         * ================================= 删除 ============================================
         */
        @Delete({"DELETE FROM", TABLE_NAME, "WHERE orderId = #{orderId}"})
        int deleteOneById(@Param("orderId") Integer orderId);
        /**
         * ================================= 修改 ============================================
         */
        int updateOneById(@Param("orderId") Integer orderId,
                          @Param("orders") Orders orders);
        /**
         * =================================新增============================================
         */
        @Insert({"INSERT INTO", TABLE_NAME, "(",INSERT_FIELDS,") " +
                "VALUES(#{userName}, " +
                "#{telephone}, " +
                "#{goods})"})
        int insertOne(Orders orders);

        /**
         * =================================查询============================================
         */
        Orders selectOneById(@Param("orderId") int orderId);
        Orders selectOneByName(@Param("userName") String userName);
        //查询带有部门信息的Orders
        Orders selectWithDeptById(@Param("orderId") Integer orderId);

        /**
         * 分页查询
         * @param limit 返回记录最大行数
         * @param offset 返回记录行的偏移量
         * @return 如offset=10，limit=5的时候，就会从数据库第11行记录开始返回5条查询结果，即范围从(offset+1)---(offset+limit)
         */
        List<Orders> selectByLimitAndOffset(@Param("offset") Integer offset,
                                              @Param("limit") Integer limit);

        /**
         * 查询总记录数
         * @return
         */
        @Select({"select count(*) from", TABLE_NAME})
        int countOrders();

    }
