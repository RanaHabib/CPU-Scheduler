package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numOfProcesses;
        int arrivalTime;
        int Qnumber;
        String nameOfProcess;
        int contextSwitchTime;
        int RRtime;
        int priorityTime;
        ArrayList<Process> process = new ArrayList<Process>();
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter number of processes ");
        numOfProcesses = input.nextInt();

        for (int i = 0; i < numOfProcesses; i++) {
            System.out.println("Please enter name of process " + (i+1));
            nameOfProcess = input.next();

            System.out.println("Please enter arrival time of process " + nameOfProcess);
            arrivalTime = input.nextInt();

            System.out.println("Please enter burst time of process " + nameOfProcess);
            int burstTime = input.nextInt();

            System.out.println("Please enter Queue number that the process will enter ");
            Qnumber =  input.nextInt();

            Process temp = new Process(nameOfProcess,arrivalTime,Qnumber,burstTime);
            process.add(temp);
        }

        System.out.println("Please enter context switching time ");
        contextSwitchTime = input.nextInt();

        System.out.println("Please enter Round Robin time quantum ");
        RRtime = input.nextInt();

        System.out.println("Please enter priority time ");
        priorityTime = input.nextInt();

        SJF sjf = new SJF(process, contextSwitchTime);

    }

    public static void fillQueue(ArrayList<Process> processes){
        //TODO: sort the arraylist of the processes
    }
}