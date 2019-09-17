package com.tavisca.TodoWebApp.dao;

import com.tavisca.TodoWebApp.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface TodoRepo extends JpaRepository<Todo, Integer> {

    List<Todo> findByTodoName(String todoName);
    List<Todo> findByTodoIdGreaterThan(int todoId);

    @Query("from Todo where todoName=?1 order by todoId")
    List<Todo> findByTodoNameSorted(String todoName);
}
