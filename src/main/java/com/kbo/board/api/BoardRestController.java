package com.kbo.board.api;

import com.kbo.board.dto.BoardDTO;
import com.kbo.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class BoardRestController {

    private final BoardService boardService;

    @GetMapping("/api/board/list")
    public List<BoardDTO> selectBoardList(){
        return boardService.selectBoardList();
    }
}
