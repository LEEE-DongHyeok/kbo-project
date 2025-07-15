package com.kbo.rank;

import com.kbo.board.BoardController;
import com.kbo.rank.dto.RankDTO;
import com.kbo.rank.service.RankService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class RankController {
    private final static Logger logger = LoggerFactory.getLogger(RankController.class);
    private final RankService rankService;

    @GetMapping("/rank")
    public ModelAndView list (){
        ModelAndView mv = new ModelAndView("rank/list");
        List<RankDTO> rankList = rankService.selectRankList();
        mv.addObject("rankList", rankList);
        logger.debug(mv.toString());
        return mv;
    }
}
