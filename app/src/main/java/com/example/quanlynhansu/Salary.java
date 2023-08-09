package com.example.quanlynhansu;

public class Salary {
    private int id;
    private int employeeId;
    private int month;
    private int year;
    private int workingDays;
    private int baseSalary;
    private double totalSalary;

    public Salary() {
        // Default constructor
    }

    public Salary(int id, int employeeId, int month, int year, int workingDays,
                  int baseSalary, double totalSalary) {
        this.id = id;
        this.employeeId = employeeId;
        this.month = month;
        this.year = year;
        this.workingDays = workingDays;
        this.baseSalary = baseSalary;
        this.totalSalary = totalSalary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getWorkingDays() {
        return workingDays;
    }

    public void setWorkingDays(int workingDays) {
        this.workingDays = workingDays;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(double totalSalary) {
        this.totalSalary = totalSalary;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "id=" + id +
                ", employeeId=" + employeeId +
                ", month=" + month +
                ", year=" + year +
                ", workingDays=" + workingDays +
                ", baseSalary=" + baseSalary +
                ", totalSalary=" + totalSalary +
                '}';
    }
}

