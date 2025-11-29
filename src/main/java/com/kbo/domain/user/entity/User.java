package com.kbo.domain.user.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "USER")
public class User {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "USER_ID")
    private Long userId;

    @Column(name = "USER_NM")
    private String userNm;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PHONE_NM")
    private String phoneNm;
}
