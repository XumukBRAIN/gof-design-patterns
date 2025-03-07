package com.dev.gofdesignpatterns.structural.adapter;

public class AdapterJavaToDataBase extends JavaApplication implements DataBase {

    @Override
    public void select() {
        loadObject();
    }

    @Override
    public void save() {
        saveObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void delete() {
        deleteObject();
    }

}
