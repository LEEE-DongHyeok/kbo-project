package com.kbo.board.api;

import com.kbo.board.dto.BoardDTO;
import com.kbo.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class BoardRestController {
    private final SqlSessionFactory sqlSessionFactory;
    private final BoardService boardService;
    List<BoardDTO> boardList = new ArrayList<>();

    @GetMapping("/api/board/list")
    public List<BoardDTO> selectBoardList(){


        try(SqlSession session = sqlSessionFactory.openSession()){
//            // 테스트 코드
//            BoardDTO boardDTO = session.selectOne("com.kbo.board.repository.BoardMapper.selectBoardList");
//            System.out.println("세션 확인 : " + session);
//            System.out.println("데이터 확인 : " + boardDTO);

            boardList = boardService.selectBoardList();
            System.out.println("데이터 확인 : " + boardList);

        }catch(Exception e) {
            e.printStackTrace();
        }

        return boardList;
    }
}
