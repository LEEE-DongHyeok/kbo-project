package com.kbo.board.repository;

import com.kbo.board.dto.BoardDTO;
import com.kbo.config.MyBatisCustomAnnotation;
import org.springframework.stereotype.Repository;

import java.util.List;

@MyBatisCustomAnnotation
@Repository
public interface BoardMapper {
    List<BoardDTO> selectBoardList();

}
