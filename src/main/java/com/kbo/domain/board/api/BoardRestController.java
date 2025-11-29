package com.kbo.domain.board.api;

import com.kbo.domain.board.dto.BoardDTO;
import com.kbo.domain.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class BoardRestController {
    private final BoardService boardService;
//    private final SqlSessionFactory sqlSessionFactory;
//    List<BoardDTO> boardList = new ArrayList<>();

    @GetMapping("/api/board/list")
    public List<BoardDTO> selectBoardList() {
        return boardService.selectBoardList();

//        try(SqlSession session = sqlSessionFactory.openSession()){
//            // 테스트 코드1
//            BoardDTO boardDTO = session.selectOne("com.kbo.board.repository.BoardMapper.selectBoardList");
//            System.out.println("세션 확인 : " + session);
//            System.out.println("데이터 확인 : " + boardDTO);
//
//            // 테스트 코드2
//            boardList = boardService.selectBoardList();
//            System.out.println("데이터 확인 : " + boardList);
//        }catch(Exception e) {
//            e.printStackTrace();
//        }

    }
}
