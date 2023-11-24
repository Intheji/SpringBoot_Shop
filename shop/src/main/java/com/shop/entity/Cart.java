package com.shop.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name="cart")
@Getter @Setter
@ToString
public class Cart extends BaseEntity {
    @Id //기본키
    @Column(name = "cart_id")   //테이블의 열과 매핑
    @GeneratedValue(strategy = GenerationType.AUTO) //전략
    private Long id;

    @OneToOne(fetch = FetchType.EAGER)  //즉시로딩 : 엔티티를 한번에 조회    지연로딩은 LAZY
    @JoinColumn(name="member_id")
    private Member member;
}
