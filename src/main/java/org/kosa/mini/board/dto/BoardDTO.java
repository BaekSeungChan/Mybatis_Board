package org.kosa.mini.board.dto;


import lombok.*;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class BoardDTO {
    private Long id;
    private String title;
    private String content;
    private String writer;

    private String searchKey;

    private LocalDate dueDate;

    private String userid;

    private String action;
}