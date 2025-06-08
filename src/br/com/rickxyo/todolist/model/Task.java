package br.com.rickxyo.todolist.model;

public class Task {
    private int id;
    private String title;
    boolean completed;

//    quando uma tarefa é criada, ela basicamente está pendente = false,
//    logo penso que nao tem motivo do usuario PRECISAR inserir o status dela na criação
    public Task(int id, String title) {
        this.id = id;
        this.title = title;
        this.completed = false;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
