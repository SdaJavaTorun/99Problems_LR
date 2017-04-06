package com.company;

/**
 * Created by RENT on 2017-04-06.
 */
public static class Task {

    public String titles;
    public TaskEnum tasks;
    public String type;

    public Task(){
    }

    public Task(String titles, TaskEnum tasks, String type) {

    this.titles = titles;
    this.tasks = tasks;
    this.type = type;
    }

    public String getTitles() {
        return titles;
    }

 //  public TaskEnum getTasks() {
   //     return tasks.;
   // }

    public String getType() {
        return type;
    }

    public void setTitles(String titles) {
        this.titles = titles;
    }

    public void setTasks(TaskEnum tasks) {
        this.tasks = tasks;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static void getTasks(){

    }

}
