package com.kbo.domain.page;

import com.kbo.domain.ranking.dto.RankingDTO;
import com.kbo.domain.ranking.service.RankingService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class RankingController {
    private final static Logger logger = LoggerFactory.getLogger(RankingController.class);
    private final RankingService rankService;

    @GetMapping("/rank")
    public ModelAndView list (){
        ModelAndView mv = new ModelAndView("rank/list");
        List<RankingDTO> rankList = rankService.selectRankList();
        mv.addObject("rankList", rankList);
        logger.debug(mv.toString());
        return mv;
    }
}
