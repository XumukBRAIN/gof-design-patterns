package com.dev.gofdesignpatterns.creational.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Project implements Copyable{

    private int id;
    private String name;
    private String sourceCode;

    @Override
    public Object copy() {
        return new Project(id, name, sourceCode);
    }
}
