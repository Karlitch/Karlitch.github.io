package com.hrms.bean;

public class Orders {

        private Integer orderId;
        private String userName;
        private String telephone;
        private Integer goods;

        private Employee employee;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Integer getGoods() {
        return goods;
    }

    public void setGoods(Integer goods) {
        this.goods = goods;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "orderId=" + orderId +
                ", userName='" + userName + '\'' +
                ", telephone='" + telephone + '\'' +
                ", goods=" + goods +
                ", employee=" + employee +
                '}';
    }

    public Orders() {
    }

    public Orders(Integer orderId, String userName, String telephone, Integer goods, Employee employee) {
        this.orderId = orderId;
        this.userName = userName;
        this.telephone = telephone;
        this.goods = goods;
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
