package org.kosa.mini.board.controller;

import org.kosa.mini.board.dto.BoardDTO;
import org.kosa.mini.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping("/list")
    public String list(BoardDTO board, Model model) throws Exception {
        String searchKey = board.getSearchKey();
        model.addAttribute("list", boardService.boardFindAll(searchKey));

        return "list";
    }



}
