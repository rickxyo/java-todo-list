package br.com.rickxyo.todolist.service;

import br.com.rickxyo.todolist.model.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskService {
    List<Task> tasks = new ArrayList<>();

    public void addTask(Task task){
        tasks.add(task);
    }

}
