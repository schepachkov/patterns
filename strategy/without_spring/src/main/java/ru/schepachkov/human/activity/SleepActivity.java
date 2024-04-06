package ru.schepachkov.human.activity;

import ru.schepachkov.human.activity.Activity;

public class SleepActivity implements Activity {
    @Override
    public void doIt() {
        System.out.println("Zzz.........");
    }
}
