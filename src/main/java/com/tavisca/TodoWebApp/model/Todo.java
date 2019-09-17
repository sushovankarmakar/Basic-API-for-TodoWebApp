package com.tavisca.TodoWebApp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Todo {

    @Id
    private int todoId;
    private String todoName;

    public int getTodoId(){
        return todoId;
    }

    public void setTodoId(int todoId){
        this.todoId = todoId;
    }

    public String getTodoName(){
        return todoName;
    }

    public void setTodoName(String todoName){
        this.todoName = todoName;
    }

    @Override
    public String toString() {
        return "Todo [todoId=" + todoId + ", todoName=" + todoName + "]";
    }

}
