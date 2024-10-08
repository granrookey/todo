package com.glocol.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.glocol.todo.domain.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}