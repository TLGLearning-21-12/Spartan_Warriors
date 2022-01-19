package com.spartan.competition;

import java.util.Scanner;

public class TimeKeeper {
    private long startTimer;
    private long endTimer;
    private boolean runningTimer;
    private boolean pausedTimer;
    private long pausedStart;
    private double times[];
    private double range;
    private int totalPoints;

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
        if (!isRunningTimer()) {
            return -1;
        } else if (isPausedTimer()) {
            return (pausedStart - startTimer);
        } else {
            pausedStart = System.nanoTime();
            pausedTimer = true;
            return (pausedStart - startTimer);
        }
    }

    public long elapsed() {
        if (isRunningTimer()) {
            if (isPausedTimer()) {
                return (pausedStart - startTimer);
            }
            return (System.nanoTime() - startTimer);
        } else {
            return (endTimer - startTimer);
        }
    }

    public void readTimes() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the race times (in minutes):");
        for(int i = 0; i < 3; i++) {
            times[i] = sc.nextDouble();
        }
        sortTimesAscending();
        range = times[2] - times[0];

    }

    private void sortTimesAscending() {
        double temp;
        for(int i =0; i<3;i++){
            for(int j = 0; j<3;j++) {
                if(this.times[i] < this.times[j]) {
                    temp = this.times[i];
                    this.times[i] = this.times[j];
                    this.times[j] = temp;
                }
            }
        }
    }

    public void totalPoints() {
        System.out.println("First place (time in minutes):" + times[2]);
        System.out.println("Second place (time in minutes):" + times[1]);
        System.out.println("Third place (time in minutes):" + times[0]);
    }

    public String toString() {
        long enlapsed = elapsed();
        return ((double) enlapsed / 10000000000.0) + " Seconds";
    }

}
