package com.kbo.domain.club.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "CLUB")
public class Club {

    @Id
    @Column(name = "CLUB_CODE")
    private String clubCode;

    @Column(name = "CLUB_NAME")
    private String clubName;

    @Column(name = "LOCATION")
    private String location;

    @Column(name = "CLUB_COLOR")
    private String clubColor;
}
