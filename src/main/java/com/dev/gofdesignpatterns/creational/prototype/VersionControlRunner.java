package com.dev.gofdesignpatterns.creational.prototype;

public class VersionControlRunner {

    public static void main(String[] args) {
        Project master = new Project(1, "Super Project", "'SourceCode sourceCode = new SourceCode();'");
        System.out.println(master);

        System.out.println("-----------------------------------------------------------------------------------------");

        ProjectFactory factory = new ProjectFactory(master);

        Project masterCopy = factory.cloneProject();
        System.out.println(masterCopy);
    }

}
