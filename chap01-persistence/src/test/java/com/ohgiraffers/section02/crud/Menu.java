package com.ohgiraffers.section02.crud;


import jakarta.persistence.*;

@Entity(name = "section02_menu") // 엔티티 객체로 만들기 위한 어노테이션이다
@Table(name = "tbl_menu") // 데이터베이스에 매핑될 테이블 이름
public class Menu {

    @Id
    @Column(name = "menu_code")
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 기본키 생성 전략
    private int menuCode;

    @Column(name="menu_name")
    private String menuName;

    @Column(name = "menu_price")
    private int menuPrice;

    @Column(name = "categry_code")
    private int categoryCode;

    @Column(name = "orderablde_status")
    private String orderabldeStatus;

    public Menu() {
    }

    public Menu(int menuCode, String menuName, int menuPrice, int categoryCode, String orderabldeStatus) {
        this.menuCode = menuCode;
        this.menuName = menuName;
        this.menuPrice = menuPrice;
        this.categoryCode = categoryCode;
        this.orderabldeStatus = orderabldeStatus;
    }

    public int getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(int menuCode) {
        this.menuCode = menuCode;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
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

    public String getOrderabldeStatus() {
        return orderabldeStatus;
    }

    public void setOrderabldeStatus(String orderabldeStatus) {
        this.orderabldeStatus = orderabldeStatus;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuCode=" + menuCode +
                ", menuName='" + menuName + '\'' +
                ", menuPrice=" + menuPrice +
                ", categoryCode=" + categoryCode +
                ", orderabldeStatus='" + orderabldeStatus + '\'' +
                '}';
    }
}
