package com.example.springkadaitodo.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springkadaitodo.entity.ToDo;
import com.example.springkadaitodo.repository.ToDoRepository;

@Service
public class ToDoService {
	 private final ToDoRepository toDoRepository;
	// 依存性の注入（DI）
	 public ToDoService(ToDoRepository toDoRepository) {
	        this.toDoRepository = toDoRepository;
	    }
	 public List<ToDo> getAllToDo() {
	        return toDoRepository.findAll();
	    }
}
