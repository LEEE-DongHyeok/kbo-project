package com.kbo.board;

import com.kbo.board.dto.BoardDTO;
import com.kbo.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class BoardController {
    private final static Logger logger = LoggerFactory.getLogger(BoardController.class);
    private final BoardService boardService;

    @GetMapping("/board")
    public ModelAndView list(){
        ModelAndView mv = new ModelAndView("board/list");
        List<BoardDTO> boardList = boardService.selectBoardList();

        // addObject 메소드로 Object 를 삽입할 때는 별칭처럼 불릴 AttributeName 을 넣어줘야 인식이 됨
        mv.addObject(boardList);

        logger.debug(mv.toString());
        return mv;
    }
}
