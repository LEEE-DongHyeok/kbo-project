package com.kbo.domain.board.service;

import com.kbo.domain.board.dto.BoardDTO;
import com.kbo.domain.board.repository.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BoardService {
    private final BoardMapper boardMapper;

    public List<BoardDTO> selectBoardList(){
        return boardMapper.selectBoardList();
    }
}
