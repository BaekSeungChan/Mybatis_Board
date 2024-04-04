package org.kosa.mini.board.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.kosa.mini.board.domain.BoardVO;
import org.kosa.mini.board.dto.BoardDTO;
import org.kosa.mini.board.mapper.BoardMapper;
import org.kosa.mini.board.util.MapperUtil;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardMapper mapper;

    ModelMapper modelMapper = MapperUtil.INSTANCE.get();
    public int boardInsert(BoardDTO boardDTO){
        BoardVO boardVO = modelMapper.map(boardDTO, BoardVO.class);
        int updated = mapper.boardInsert(boardVO);
        return updated;
    }

    public List<BoardDTO> boardFindAll(String searchKey){
        List<BoardVO> boards = mapper.boardFindAll(searchKey);

        return boards.stream().map(vo -> modelMapper.map(vo, BoardDTO.class))
                .collect(Collectors.toList());
    }

    public BoardDTO boardDetail(Long id){
        BoardVO boardVO = mapper.boardDetail(id);

        BoardDTO boardDTO = modelMapper.map(boardVO, BoardDTO.class);

        return boardDTO;
    }

    public int boardDelete(Long id){
        int updated = mapper.boardDelete(id);

        return updated;
    }

    public int boardUpdate(BoardDTO boardDTO, Long id) {
        BoardVO boardVO = modelMapper.map(boardDTO, BoardVO.class);

        return mapper.boardUpdate(boardVO, id);
    }

}
