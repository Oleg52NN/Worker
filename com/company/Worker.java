package com.company;

public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;
    public static final int ERROR = 32;

    public Worker(OnTaskDoneListener callback) {
        this.callback = callback;
    }

    public Worker(OnTaskErrorListener errorCallback) {
        this.errorCallback = errorCallback;
    }

    public void start(OnTaskErrorListener errorCallback) {
        for (int i = 0; i < 100; i++) {
            if (i != ERROR) {
                callback.onDone("Task " + i + " is done");
            } else {
                errorCallback.onError("Task " + i + " Что-то пошло не так...");
            }
        }
    }
}
