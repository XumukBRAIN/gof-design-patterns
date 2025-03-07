package com.dev.gofdesignpatterns.structural.adapter;

public class DataBaseClient {

    public static void main(String[] args) {

        DataBase dataBase = new AdapterJavaToDataBase();

        dataBase.select();
        dataBase.save();
        dataBase.update();
        dataBase.delete();

    }

}
