package com.kbo.rank.service;

import com.kbo.rank.dto.RankDTO;
import com.kbo.rank.repository.RankMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class RankService {
    private final RankMapper rankMapper;

    public List<RankDTO> selectRankList(){
        return rankMapper.selectRankList();
    }
}
