package com.kbo.domain.ranking.dto;

import lombok.Data;

@Data
public class RankingDTO {
    private String clubCode;
    private int rankSeq;
    private int games;
    private int wins;
    private int loses;
    private int draws;
    private float percentage;
    private float gameBehind;
}
