package com.company;

public class Process {
    private String processName;
    private int arrivalTime;
    private int queueNumber;
    private int burstTime;
    private int endTime;
    private int remainingTime;


    public Process(String processName, int arrivalTime, int queueNumber, int burstTime) {
        this.processName = processName;
        this.arrivalTime = arrivalTime;
        this.queueNumber = queueNumber;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
    }

    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName;
    }

    public int getBurstTime() {
        return burstTime;
    }

    public void setBurstTime(int burstTime) {
        this.burstTime = burstTime;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getQueueNumber() {
        return queueNumber;
    }

    public void setQueueNumber(int queueNumber) {
        this.queueNumber = queueNumber;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public int getRemainingTime() {
        return remainingTime;
    }

    public void setRemainingTime(int remainingTime) {
        this.remainingTime = remainingTime;
    }
}
