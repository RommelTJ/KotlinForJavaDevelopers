package com.rommelrico.s1basicdifferences;

/** Employee Class. */
public class EmployeeJava {

    private String name;
    private int id;

    public EmployeeJava(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof EmployeeJava) {
            return id == ((EmployeeJava) obj).id && name.equals(((EmployeeJava) obj).name);
        }
        return false;
    }
}
