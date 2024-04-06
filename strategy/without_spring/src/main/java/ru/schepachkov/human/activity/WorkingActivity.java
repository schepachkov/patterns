package ru.schepachkov.human.activity;

import ru.schepachkov.human.activity.Activity;

public class WorkingActivity implements Activity {
    @Override
    public void doIt() {
        System.out.println("I am working!");
    }
}
