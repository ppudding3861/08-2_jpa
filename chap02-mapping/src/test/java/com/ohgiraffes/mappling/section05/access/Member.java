package com.ohgiraffes.mappling.section05.access;
import jakarta.persistence.*;

/**
 * 필드 접근이 기본 값이므로 해당 설정을 제거해도 동일하게 동작한다.
 * 또한 필드레벨과 프로퍼티 레벨에 모두 선언하면 프로퍼티 레벨을 우선으로 한다.
 * */

@Entity(name = "member_section05")
@Table(name = "tbl_member_section05") // 어떤 테이블과 매핑할건지
// 1.클래스레벨 : 모든 필드에 대해서 필드 접근 방식을 적용한다.
@Access(AccessType.FIELD)
public class Member {

    //2. 필드레벨 : 해당 필드에 대해서 필드 접근 방식을 적용한다.
    @Id // 이걸 안쓰면 PK값이 없어서 에러남
    @Column(name = "member_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Access(AccessType.FIELD)
    private int memberNo;

    @Column(name = "member_id")
    @Access(AccessType.FIELD)
    private String memberId;

    @Column(name = "member_pwd")
    @Access(AccessType.FIELD)
    private String memberPwd;

    @Column(name = "nickName")
    @Access(AccessType.FIELD)
    private String nickName;

    public Member() {
    }

    public Member(int memberNo, String memberId, String memberPwd, String nickName) {
        this.memberNo = memberNo;
        this.memberId = memberId;
        this.memberPwd = memberPwd;
        this.nickName = nickName;
    }
}
