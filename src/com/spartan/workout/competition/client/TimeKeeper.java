package com.spartan.workout.competition.client;

public class TimeKeeper {
    private long startTimer;
    private long endTimer;
    private boolean runningTimer;
    private boolean pausedTimer;
    private long pausedStart;

    public TimeKeeper() {
        this.pausedStart = 0;
        this.startTimer = 0;
        this.endTimer = 0;
    }

    public boolean isRunningTimer() {
        return runningTimer;
    }
    public boolean isPausedTimer() {
        return pausedTimer;
    }
    public void startTimer() {
        startTimer = System.nanoTime();
        runningTimer = true;
        pausedTimer = false;
        pausedStart = -1;
    }
    public long stopTimer() {
        if (!isRunningTimer()) {
            return -1;
        } else if (isPausedTimer()) {
            runningTimer = false;
            pausedTimer = false;

            return pausedStart - startTimer;
        } else {
            endTimer = System.nanoTime();
            runningTimer = false;
            return endTimer - startTimer;
        }
    }
    public long pauseTimer() {
        if(!isRunningTimer()) {
            return -1;
    }   else if (isPausedTimer()) {
            return (pausedStart - startTimer);
    } else {
            pausedStart = System.nanoTime();
            pausedTimer = true;
            return (pausedStart - startTimer);
        }
    }
    public long elapsed() {
        if (isRunningTimer()) {
            if (isPausedTimer())
                return (pausedStart - startTimer);
 //           return (System.nanoTime()) - startTimer);
        } else
            return (endTimer - startTimer);
    }

    public String toString() {
        long enlapsed = elapsed();
        return ((double) enlapsed / 10000000000.0) + " Seconds";
    }

}
