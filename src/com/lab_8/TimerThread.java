package com.lab_8;

import java.util.Timer;
import java.util.TimerTask;
import java.util.*;

public class TimerThread {
   public static void main(String []args) {
      Task t1 = new Task("Task 1");
      Task t2 = new Task("Task 2");
      Timer t = new Timer();
      t.schedule(t1, 10000); //  executes for every 10 seconds
      t.schedule(t2, 1000, 2000); // executes for every 2 seconds
   }
}
class Task extends TimerTask {
   private String n;
   public Task(String name) {
       this.n = n;
   }
   public void run() {
      System.out.println("[" + new Date() + "] " + n + ": task executed!");
   }
}