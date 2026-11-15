package com.ansolm.fetcher;

import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author : ansolm
 * @mail : ansolm@outlook.com
 * @project : https://github.com/ansolm/Fetcher
 */
public class TaskRunnable implements Runnable {
    private final Task task;

    public TaskRunnable(Task task) {
        this.task = task;
    }

    public static synchronized void execute(ThreadPoolExecutor executor, Task task) {
        TaskUtil.prepared(task);
        Future<?> future = executor.submit(new TaskRunnable(task));
        task.config.executors.add(future);
    }

    @Override
    public void run() {

    }
}
