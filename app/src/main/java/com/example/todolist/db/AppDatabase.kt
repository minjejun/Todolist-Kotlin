package com.example.todolist.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(TodoEntity::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun getTodoDao() : TodoDao

    companion object { // 어떤 클래스의 모든 인스턴스가 공유하는 객체를 만들고 싶을 때 사용,
        // 클래스 당 하나만 가질 수 있음.
        val databaseName = "JJDB"
        var appDatabase : AppDatabase? = null

        fun getInstance(context : Context) : AppDatabase? {
            if(AppDatabase == null) {
                appDatabase = Room.databaseBuilder(context, AppDatabase::class.java, databaseName).

                fallbackToDestructiveMigration()
                    .build()
            }
            return appDatabase
        }
    }
}