package com.kbo.rank.api;

import com.kbo.rank.dto.RankDTO;
import com.kbo.rank.service.RankService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class RankRestController {

    private final RankService rankService;

    @GetMapping("/api/rank/list")
    public List<RankDTO> selectRankList(){
        return rankService.selectRankList();
    }


}
