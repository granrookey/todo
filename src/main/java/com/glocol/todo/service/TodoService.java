package com.glocol.todo.service;

import com.glocol.todo.dto.PageRequestDTO;
import com.glocol.todo.dto.PageResponseDTO;
import com.glocol.todo.dto.TodoDTO;

public interface TodoService {

    Long register(TodoDTO todoDTO);

    TodoDTO get(Long tno);

    void modify(TodoDTO todoDTO);

    void remove(Long tno);

    PageResponseDTO<TodoDTO> list(PageRequestDTO pageRequestDTO);

}