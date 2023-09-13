package com.example.todolist.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface TodoDao {

    // get all - 모두 가져오는 것.
    @Query("SELECT * " +
            "FROM TodoEntity")
    fun getAllTodo() : List<TodoEntity>

    // insert todo 추가
    @Insert
    fun insertTodo(todo : TodoEntity)

    // delete todo 삭제
    @Delete
    fun deleteTodo(todo : TodoEntity)

    companion object {
        fun deleteTodo(todoEntity: TodoEntity) {

        }
    }
}