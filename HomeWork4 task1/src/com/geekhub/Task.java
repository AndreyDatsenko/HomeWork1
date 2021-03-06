package com.geekhub;

public class Task {

    private String name;
    private String category;

    public Task(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

   @Override
   public String toString() {
       return "Task{" +
               "name='" + name + '\'' +
               ", category='" + category + '\'' +
               '}';
   }
}
