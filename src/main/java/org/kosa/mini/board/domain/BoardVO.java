package org.kosa.mini.board.domain;


import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BoardVO {
    private Long id; // PK
    private String title; // 제목
    private String content; // 내용
    private String writer; // 작성자
    private LocalDate dueDate; // 작성 날짜
    private String userid; // FK
}