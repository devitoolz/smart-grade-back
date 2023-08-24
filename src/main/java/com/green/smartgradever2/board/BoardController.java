package com.green.smartgradever2.board;

import com.green.smartgradever2.board.model.BoardInsDto;
import com.green.smartgradever2.entity.BoardEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/board")
public class BoardController {
    private final BoardService SERVICE;

    /** insert **/
    @PostMapping(value = "/pics", consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.MULTIPART_FORM_DATA_VALUE})
    public BoardEntity insBoard(@RequestPart BoardInsDto dto,
                                @RequestPart List<MultipartFile> pics) {
        return SERVICE.insBoard(dto, pics);
    }
}