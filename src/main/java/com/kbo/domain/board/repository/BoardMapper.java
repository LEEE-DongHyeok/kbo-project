package com.kbo.domain.board.repository;

import com.kbo.domain.board.dto.BoardDTO;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface BoardMapper {
    List<BoardDTO> selectBoardList();
}
