package ru.schepachkov.human;

import org.junit.Test;
import ru.schepachkov.human.activity.EatActivity;
import ru.schepachkov.human.activity.SleepActivity;
import ru.schepachkov.human.activity.WorkingActivity;

import static org.junit.Assert.*;

public class HumanTest {

    @Test
    public void startActivity() {
        Human human = new Human();
        human.startActivity();

        human.setActivity(new EatActivity());
        human.startActivity();

        human.setActivity(new WorkingActivity());
        human.startActivity();

        human.setActivity(new SleepActivity());
        human.startActivity();
    }
}