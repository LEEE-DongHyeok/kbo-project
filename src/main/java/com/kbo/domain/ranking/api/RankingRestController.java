package com.kbo.domain.ranking.api;

import com.kbo.domain.ranking.dto.RankingDTO;
import com.kbo.domain.ranking.service.RankingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class RankingRestController {

    private final RankingService rankService;

    @GetMapping("/api/rank/list")
    public List<RankingDTO> selectRankList(){
        return rankService.selectRankList();
    }


}
