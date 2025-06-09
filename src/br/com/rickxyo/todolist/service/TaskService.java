package br.com.rickxyo.todolist.service;

import br.com.rickxyo.todolist.model.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskService {
    int id = 0;
    List<Task> tasks = new ArrayList<>();

    public void createTask(String title){
        id++;
        Task task = new Task(id, title);
        tasks.add(task);
    }

}
