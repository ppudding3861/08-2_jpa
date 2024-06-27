package com.ohgiraffers.section01.problem;

public class Menu {

    private int menuCode;
    private String menuNamel;
    private int menuPrice;
    private int categoryCode;
    private String orderableStatus;

    public Menu() {
    }

    public Menu(int menuCode, String menuNamel, int menuPrice, int categoryCode, String orderableStatus) {
        this.menuCode = menuCode;
        this.menuNamel = menuNamel;
        this.menuPrice = menuPrice;
        this.categoryCode = categoryCode;
        this.orderableStatus = orderableStatus;
    }

    public int getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(int menuCode) {
        this.menuCode = menuCode;
    }

    public String getMenuNamel() {
        return menuNamel;
    }

    public void setMenuNamel(String menuNamel) {
        this.menuNamel = menuNamel;
    }

    public int getMenuPrice() {
        return menuPrice;
    }

    public void setMenuPrice(int menuPrice) {
        this.menuPrice = menuPrice;
    }

    public int getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(int categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getOrderableStatus() {
        return orderableStatus;
    }

    public void setOrderableStatus(String orderableStatus) {
        this.orderableStatus = orderableStatus;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuCode=" + menuCode +
                ", menuNamel='" + menuNamel + '\'' +
                ", menuPrice=" + menuPrice +
                ", categoryCode=" + categoryCode +
                ", orderableStatus='" + orderableStatus + '\'' +
                '}';
    }
}
