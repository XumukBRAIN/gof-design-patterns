package com.dev.gofdesignpatterns.creational.abstract_factory.website;

import com.dev.gofdesignpatterns.creational.abstract_factory.ProjectManager;

public class WebsitePM implements ProjectManager {

    @Override
    public void manageProject() {
        System.out.println("Website PM manages website project...");
    }

}
