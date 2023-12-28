package com.bls101.todoapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bls101.todoapp.model.ToDo;

@Repository
public interface ToDoRepoInterface extends JpaRepository<ToDo, Long>{

}
