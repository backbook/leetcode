package com.sujy.design.mode.factory;

public class TeacherWorkFactory implements IWorkFactory {
    @Override
    public Work getWork() {
        return new TeacherWork();
    }
}
