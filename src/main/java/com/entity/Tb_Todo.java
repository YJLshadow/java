package com.entity;


public class Tb_Todo {

    private Integer todoId;
    private Integer staffId;
    private String todoTitle;
    private String todoBody;
    private Integer todoBodyState;

    public Tb_Todo() {
    }

    public Tb_Todo(Integer staffId, String todoTitle, String todoBody, Integer todoBodyState) {
        this.staffId = staffId;
        this.todoTitle = todoTitle;
        this.todoBody = todoBody;
        this.todoBodyState = todoBodyState;
    }

    public Tb_Todo(Integer todoId, Integer staffId, String todoTitle, String todoBody, Integer todoBodyState) {
        this.todoId = todoId;
        this.staffId = staffId;
        this.todoTitle = todoTitle;
        this.todoBody = todoBody;
        this.todoBodyState = todoBodyState;
    }

    public Integer getTodoId() {
        return todoId;
    }

    public void setTodoId(Integer todoId) {
        this.todoId = todoId;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getTodoTitle() {
        return todoTitle;
    }

    public void setTodoTitle(String todoTitle) {
        this.todoTitle = todoTitle;
    }

    public String getTodoBody() {
        return todoBody;
    }

    public void setTodoBody(String todoBody) {
        this.todoBody = todoBody;
    }

    public Integer getTodoBodyState() {
        return todoBodyState;
    }

    public void setTodoBodyState(Integer todoBodyState) {
        this.todoBodyState = todoBodyState;
    }

    @Override
    public String toString() {
        return "Tb_Todo{" +
                "todoId=" + todoId +
                ", staffId=" + staffId +
                ", todoTitle='" + todoTitle + '\'' +
                ", todoBody='" + todoBody + '\'' +
                ", todoBodyState=" + todoBodyState +
                '}';
    }
}
