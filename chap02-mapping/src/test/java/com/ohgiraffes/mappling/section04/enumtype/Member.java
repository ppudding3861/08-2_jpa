package com.ohgiraffes.mappling.section04.enumtype;

import jakarta.persistence.*;

import java.util.Date;


@Entity(name = "member_section04")
@Table(name = "tbl_member_section04") // 어떤 테이블과 매핑할건지
public class Member {

    @Id // 이걸 안쓰면 PK값이 없어서 에러남
    @Column(name = "member_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int memberNo;

    @Column(name = "member_id")
    private String memberId;

    @Column(name = "member_pwd")
    private String memberPwd;

    @Column(name = "nickName")
    @Transient // 테이블 생성시에 필드를 만들지 말라는 속성
    private String nickName;

    @Column(name = "phone", columnDefinition = "varchar(200) default '010-0000-0000'") // 컬럼의 기본구조 정의
    private String phone;

    @Column(name = "address", unique = true) // 이 값은 유일해야되 디폴트는 false
    private String address;

    @Column(name = "enroll_date")
    @Temporal(TemporalType.TIMESTAMP) // 데이터를 저장할때 타입을 지정하는 것
    private Date enrollDate;

    @Column(name = "member_role",nullable = false) // 널을 허용하지 않겠다
    @Enumerated(EnumType.STRING) // enumtype을 설정할 수 있따.
    private Roletype memberRole;

    @Column(name = "status", length = 300)
    private String status;

    public Member() {
    }

    public Member(int memberNo, String memberId, String memberPwd, String nickName, String phone, String address, Date enrollDate, Roletype memberRole, String status) {
        this.memberNo = memberNo;
        this.memberId = memberId;
        this.memberPwd = memberPwd;
        this.nickName = nickName;
        this.phone = phone;
        this.address = address;
        this.enrollDate = enrollDate;
        this.memberRole = memberRole;
        this.status = status;
    }

    public int getMemberNo() {
        return memberNo;
    }

    public void setMemberNo(int memberNo) {
        this.memberNo = memberNo;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberPwd() {
        return memberPwd;
    }

    public void setMemberPwd(String memberPwd) {
        this.memberPwd = memberPwd;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getEnrollDate() {
        return enrollDate;
    }

    public void setEnrollDate(Date enrollDate) {
        this.enrollDate = enrollDate;
    }

    public Roletype getMemberRole() {
        return memberRole;
    }

    public void setMemberRole(Roletype memberRole) {
        this.memberRole = memberRole;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberNo=" + memberNo +
                ", memberId='" + memberId + '\'' +
                ", memberPwd='" + memberPwd + '\'' +
                ", nickName='" + nickName + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", enrollDate=" + enrollDate +
                ", memberRole='" + memberRole + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
