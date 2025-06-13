package br.com.rickxyo.todolist.app;

import br.com.rickxyo.todolist.model.Task;
import br.com.rickxyo.todolist.service.TaskService;
import br.com.rickxyo.todolist.utils.TerminalUtils;

import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskService taskService = new TaskService();
        boolean taskMenu = true;

        while (taskMenu) {
            System.out.println("Welcome to your To Do List!");
            System.out.println("1 - Add task");
            System.out.println("2 - Remove task");
            System.out.println("3 - Edit task");
            System.out.println("4 - Show all tasks");
            System.out.println("5 - Exit");

            int number = scanner.nextInt();
            scanner.nextLine();

            switch (number) {
                case 1:
                    TerminalUtils.clearTerminal();
                    System.out.println("Enter task title: ");
                    String taskTitle = scanner.nextLine();
                    taskService.createTask(taskTitle);
                    System.out.println("Task added successfully!");
                    break;
                case 2:
                    System.out.println("teste 2");
                    break;
                case 3:
                    System.out.println("teste 3");
                    break;
                case 4:
                    System.out.println("teste 4");
                    break;
                case 5:
                    taskMenu = false;
                    TerminalUtils.clearTerminal();
                    break;
                default:
                    System.out.println("Not a option! Try again");
            }
        }

    }
}