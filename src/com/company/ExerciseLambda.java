package com.company;


import com.sun.javafx.tk.Toolkit;

import java.util.ArrayList;
import java.util.List;

public class ExerciseLambda {

    public static void main(String[] args) {

        List<Task> tasks = getTasks();



        List<String> titles = taskTitles(tasks);

        for(String title: titles){
            System.out.println(title);
        }


        public static List<String> taskTitles(List<Task> tasks){

            List<String> readingTitles = new ArrayList<>();

            for(Task task: tasks){
                if(task.getType() == TaskEnum.READING){
                    readingTitles.add(task.getTitles());
                }
            }
        }




    }
}
