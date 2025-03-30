package com.kbo.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BoardController {

    @GetMapping("/")
    public ModelAndView list(){
        ModelAndView mv = new ModelAndView("board/list");
        return mv;
    }
}
