package com.kbo.rank.repository;

import com.kbo.rank.dto.RankDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RankMapper {
    List<RankDTO> selectRankList();
}
