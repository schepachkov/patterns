package ru.schepachkov.human;

import ru.schepachkov.human.activity.Activity;

public class Human {

    private Activity activity;

    public void startActivity() {
        if (activity != null) {
            activity.doIt();
        } else {
            System.out.println("Activity is empty.");
        }
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }
}
