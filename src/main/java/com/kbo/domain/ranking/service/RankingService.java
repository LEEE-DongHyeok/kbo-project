package com.kbo.domain.ranking.service;

import com.kbo.domain.ranking.dto.RankingDTO;
import com.kbo.domain.ranking.repository.RankingMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class RankingService {
    private final RankingMapper rankMapper;

    public List<RankingDTO> selectRankList(){
        return rankMapper.selectRankList();
    }
}
