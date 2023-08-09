package com.example.quanlynhansu;

public class Department {
    private int id;
    private String departmentName;
    private String description;

    public Department() {
        // Default constructor
    }

    public Department(int id, String departmentName, String description) {
        this.id = id;
        this.departmentName = departmentName;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", departmentName='" + departmentName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

