package com.kbo.domain.ranking.repository;

import com.kbo.domain.ranking.dto.RankingDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RankingMapper {
    List<RankingDTO> selectRankList();
}
