package com.example.todolist

interface OnItemLongClickListener { // 꾹 눌렀을 때 실행되는 인터페이스 생성.
    fun onLongClick(position: Int)
}