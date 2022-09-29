package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {

    //    shared fields
    private int id;
    private static int nextID = 1;
    private String value;

    //    shared constructors
//    public JobField() {
//        this.id = nextId;
//        nextID++;
//    }

//    public JobField(String value) {
//        this();
//        this.value = value;
//    }

    //    getters/setters
    public int getID() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

//    @Override
//    public int hashCode() {
//        return Object.hash(getID());
    }





