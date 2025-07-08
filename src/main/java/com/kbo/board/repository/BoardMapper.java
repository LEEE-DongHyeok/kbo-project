package com.kbo.board.repository;

import com.kbo.board.dto.BoardDTO;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface BoardMapper {
    List<BoardDTO> selectBoardList();
}
