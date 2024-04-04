package org.kosa.mini.board.mapper;

import org.kosa.mini.board.domain.BoardVO;

import java.util.List;

public interface BoardMapper {
    int boardInsert(BoardVO boardVO);

    List<BoardVO> boardFindAll(String searchKey);

    BoardVO boardDetail(Long id);

    int boardDelete(Long id);

    int boardUpdate(BoardVO boardVO, Long id);
}
