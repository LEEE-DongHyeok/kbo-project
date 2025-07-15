package com.kbo.rank.dto;

import lombok.Data;

@Data
public class RankDTO {
    private int rankSeq;
    private String clubName;
    private int games;
    private int wins;
    private int loses;
    private int draws;
    private float percentage;
    private float gameBehind;

}
