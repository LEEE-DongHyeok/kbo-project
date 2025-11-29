package com.kbo.domain.ranking.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "RANKING")
public class Ranking {

    @Id
    @Column(name = "CLUB_CODE")
    private String clubCode;

    @Column(name = "RANKING_SEQ")
    private int rankingSeq;

    @Column(name = "GAMES")
    private int games;

    @Column(name = "WINS")
    private int wins;

    @Column(name = "LOSES")
    private int loses;

    @Column(name = "DRWAS")
    private int draws;

    @Column(name = "PERCENTAGE")
    private float percentage;

    @Column(name = "GAME_BEHIND")
    private float gameBehind;
}
